package com.jobs.domain;

public class Employee extends AbsStaffMember {

	protected double salaryPerMonth;
	protected IPaymentRate paymentRate;
	protected double brutYear;
	protected double netYear; 
	protected double bonus;

	public Employee(String name, String address, String phone, double salaryPerMonth,IPaymentRate paymentRate) throws Exception {
		super(name, address, phone);		
		if(salaryPerMonth<0) throw new Exception();
		if(paymentRate==null) throw new Exception();
				
		this.salaryPerMonth=salaryPerMonth;
		this.paymentRate=paymentRate;
	}

	
	@Override
	public void pay() {
		totalPaid=paymentRate.pay(salaryPerMonth);
		brutYear=salaryPerMonth*12;
		netYear=totalPaid*12;
	}
	
	public String getStaff() {
		String text = this.name + ", " + this.address + ", " + this.phone + ", sou brut mes: " + this.salaryPerMonth + ", sou net mes: " + this.totalPaid + ", sou brut any: " + this.brutYear + ", sou net any: " + this.netYear;
		return text;
	}

	public String getName() {
		return this.name;
	}
	
	public void setTotalPaid(double num) {
		this.totalPaid = num;
	}
	
	public double payBonus() {
		this.bonus = this.brutYear*0.10;
		return this.bonus;
	}
}

