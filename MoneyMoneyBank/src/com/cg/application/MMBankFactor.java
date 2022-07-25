package com.cg.application;

import com.cg.framework.BankFactor;
import com.cg.framework.CurrentAc;
import com.cg.framework.SavingAc;

public class MMBankFactor implements BankFactor{

	@Override
	public SavingAc getNewSavingAccount(int AccNo, String accNm, float accBal, float isSalaried){
		
		MMSavingAc mmsa = new MMSavingAc(AccNo, accNm, isSalaried, false);
		
		return mmsa;
	}

	@Override
	public CurrentAc getNewCurrentAccount(int AccNo, String accNm, float accBal, float creditLimit){
	
		MMCurrentAc mmca = new MMCurrentAc(AccNo, accNm, creditLimit);
		
		return mmca;
	}

}