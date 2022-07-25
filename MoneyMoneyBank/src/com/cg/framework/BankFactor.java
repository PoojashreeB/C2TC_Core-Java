package com.cg.framework;

public interface BankFactor {
		
		public SavingAc getNewSavingAccount(int AccNo, String accNm, float accBal, float isSalaried);
		public CurrentAc getNewCurrentAccount(int AccNo, String accNm, float accBal, float creditLimit);

}
