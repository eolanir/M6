package com.jobs.domain;

public class Volunteer extends AbsStaffMember {
	
	protected double ajut;

	public Volunteer(String name, String address, String phone) throws Exception {
		super(name, address, phone);
		
		//TODO
	}

	
	@Override
	public void pay() {
		
	}
	
	public String getStaff() {
		String text;
		if(totalPaid > 0) {
			text = this.name + ", " + this.address + ", " + this.phone + ", sou brut: no cobra! Sou net amb ajuts: " + this.totalPaid;
		} else {
			text = this.name + ", " + this.address + ", " + this.phone + ", sou brut: no cobra! Sou net: " + this.totalPaid;
		}
		return text;
	}
	
	public String getName() {
		return this.name;
	}

	public double getTotalPaid() {
		return this.totalPaid;
	}
	
	public void setTotalPaid(double num) {
		this.totalPaid = num;
	}
	
	public double payBonus() {
		return 0;
	}
}
