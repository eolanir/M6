package com.jobs.application;

import com.jobs.domain.IPaymentRate;

public class PaymentFactory {

	
	public static IPaymentRate createPaymentRateBoss(){
		return new IPaymentRate() {	
			@Override
			public double pay(double salaryPerMonth) {
				return salaryPerMonth*1.5 - salaryPerMonth*0.32;
			}
		};
	}
	
	public static IPaymentRate createPaymentRateJuniorEmployee(){
		return new IPaymentRate() {
			@Override
			public double pay(double salaryPerMonth) {
				return salaryPerMonth - salaryPerMonth*0.15 - salaryPerMonth*0.02;
			}
		};
	}
	
	public static IPaymentRate createPaymentRateMidEmployee(){
		return new IPaymentRate() {
			@Override
			public double pay(double salaryPerMonth) {
				return salaryPerMonth - salaryPerMonth*0.10 - salaryPerMonth*0.15;
			}
		};
	}
	
	public static IPaymentRate createPaymentRateSeniorEmployee(){
		return new IPaymentRate() {
			@Override
			public double pay(double salaryPerMonth) {
				return salaryPerMonth - salaryPerMonth*0.05 - salaryPerMonth*0.24;
			}
		};
	}
	
	public static IPaymentRate createPaymentRateManager() {
		return new IPaymentRate() {
			public double pay(double salaryPerMonth) {
				return salaryPerMonth*1.1 - salaryPerMonth*0.26;
			}
		};
	}
}
