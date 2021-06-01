package com.jobs.domain;

public class Junior extends Employee{
	
	public Junior(String name, String address, String phone, double salaryPerMonth,IPaymentRate paymentRate) throws Exception{
		super(name, address, phone, salaryPerMonth, paymentRate);		
		if(salaryPerMonth<0) throw new Exception();
		if(paymentRate==null) throw new Exception();
				
		this.salaryPerMonth=salaryPerMonth;
		this.paymentRate=paymentRate;
	}
}
