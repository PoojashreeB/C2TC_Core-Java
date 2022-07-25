package com.cg.framework;

public class SavingAc extends BankAc{

	private boolean isSalary;
	private static final float MINBAL=100;


	public SavingAc(int accNo, String accNm, float accBal, boolean isSalary) {
		super(accNo, accNm, accBal);
		this.isSalary = isSalary;
	}

	public boolean isSalary(){
		return isSalary;
	}

	public void setSalary(boolean isSalary){
		this.isSalary = isSalary;
	}

	public static float getMinbal(){
		return MINBAL;
	}

	public void withdraw(float accBal){
		
		System.out.println("Account balance is:"+accBal);

	}

	@Override
	public String toString(){
		return "SavingAcc [isSalary=" + isSalary + ", isSalary()=" + isSalary() + ", getAccNo()=" + getAccNo()
				+ ", getAccNm()=" + getAccNm() + ", getAccBal()=" + getAccBal() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
}