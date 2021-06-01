package com.jobs.domain;

public class Senior extends Employee {

	public Senior(String name, String address, String phone, double salaryPerMonth,IPaymentRate paymentRate) throws Exception{
		super(name, address, phone, salaryPerMonth, paymentRate);		
		if(salaryPerMonth<0) throw new Exception();
		if(paymentRate==null) throw new Exception();
				
		this.salaryPerMonth=salaryPerMonth;
		this.paymentRate=paymentRate;
	}
}
