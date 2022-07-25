package com.cg.application;

import com.cg.framework.CurrentAc;

public class MMCurrentAc extends CurrentAc{


	public MMCurrentAc(int accNo, String accNm, float accBal){
		super(accNo, accNm, accBal);
		
	}

	public void withdraw(float creditLimit){
		
		System.out.println("Dear Current Account User, Your Account balance:"+getAccBal()+"Your credit limit:"+creditLimit);
		
	}

	@Override
	public String toString() {
		return "MMCurrentAcc [getCreditLimit()=" + getCreditLimit() + ", toString()=" + super.toString()
				+ ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm() + ", getAccBal()=" + getAccBal()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	}