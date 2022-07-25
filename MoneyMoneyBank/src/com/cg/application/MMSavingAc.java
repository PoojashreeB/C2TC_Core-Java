package com.cg.application;

import com.cg.framework.SavingAc;

public class MMSavingAc extends SavingAc{
	
	private static final float MINBAL=100;	

	public MMSavingAc(int accNo, String accNm, float accBal, boolean isSalary){
		super(accNo, accNm, accBal, isSalary);
	}

    public void withdraw(float accBal){
    	
    	System.out.println("Dear Savings Accouny User, Your cash is withdrawn and the current balance is:"+accBal);
		
	}

	@Override
	public String toString() {
		return "MMSavingAcc [isSalary()=" + isSalary() + ", toString()=" + super.toString() + ", getAccNo()="
				+ getAccNo() + ", getAccNm()=" + getAccNm() + ", getAccBal()=" + getAccBal() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
}
