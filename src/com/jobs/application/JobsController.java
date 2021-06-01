package com.jobs.application;

import java.util.List;

import com.jobs.domain.AbsStaffMember;
import com.jobs.domain.Employee;
import com.jobs.domain.Junior;
import com.jobs.domain.Mid;
import com.jobs.domain.Senior;
import com.jobs.domain.Volunteer;
import com.jobs.persistence.EmployeeRepository;

public class JobsController {

	private EmployeeRepository repository = new EmployeeRepository();
	
	public JobsController(){
		
	}
	
	public void createBossEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{
		if(salaryPerMonth < 8000) {
			throw new Exception();
		} else {
			Employee boss = new Employee(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateBoss());
			repository.addMember(boss);
		}
	}
	
	public void createJuniorEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{		
		if(salaryPerMonth >= 900 && salaryPerMonth <= 1600) {
			Employee employee = new Junior(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateJuniorEmployee());
			repository.addMember(employee);
		} else {
			throw new Exception();
		}
	}
	
	public void createMidEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{		
		if(salaryPerMonth >= 1800 && salaryPerMonth <= 2500) {
			Employee employee = new Mid(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateMidEmployee());
			repository.addMember(employee);
		} else {
			throw new Exception();
		}
	}

	public void createSeniorEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{		
		if(salaryPerMonth >= 2700 && salaryPerMonth <= 4000) {
			Employee employee = new Senior(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateSeniorEmployee());
			repository.addMember(employee);
		} else {
			throw new Exception();
		}
	}
	
	public void createManagerEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{
		if(salaryPerMonth >= 3000 && salaryPerMonth <= 5000) {
			Employee manager = new Employee(name, address, phone, salaryPerMonth, PaymentFactory.createPaymentRateManager());
			repository.addMember(manager);
		} else {
			throw new Exception();
		}
	}


	public void payAllEmployeers() {
		List<AbsStaffMember> list = repository.getAllMembers();
		for(AbsStaffMember i : list) {
			i.pay();
		}
	}

	public String getAllEmployees() {
		String text = "";
		List<AbsStaffMember> list = repository.getAllMembers();
		for(AbsStaffMember i : list) {
			text = text + i.getStaff() + "\n";
		}
		return text;
	}

	public void createVolunteer(String name, String address, String phone) throws Exception {
		Volunteer volunteer = new Volunteer(name, address, phone);
		if(volunteer.getTotalPaid() == 0) {
			repository.addMember(volunteer);
		} else {
			throw new Exception();
		}
		
	}
	
	public void payAjut(String name) {
		List<AbsStaffMember> list = repository.getAllMembers();
		for(AbsStaffMember i : list) {
			if(i.getName().equalsIgnoreCase(name) && i instanceof Volunteer) {
				i.setTotalPaid(300);
			}
		}
	}
	
	public void payBonus() {
		List<AbsStaffMember> list = repository.getAllMembers();
		for(AbsStaffMember i : list) {
			if(i instanceof Employee) {	
				double bonus = i.payBonus();
				System.out.println("S'ha pagat un bonus de " + bonus + "€ a l'empleat " + i.getName());
			}
		}
	}
	
	
	
}
