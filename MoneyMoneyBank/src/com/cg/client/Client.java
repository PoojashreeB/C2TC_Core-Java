package com.cg.client;

import com.cg.application.MMBankFactor;
import com.cg.application.MMCurrentAc;
import com.cg.application.MMSavingAc;
import com.cg.framework.BankFactor;
import com.cg.framework.CurrentAc;
import com.cg.framework.SavingAc;

public class Client {

	public static void main(String[] args){
		
		BankFactor bf = new MMBankFactor();
		SavingAc sa = new MMSavingAc(1234, "pooja", 10000, false);
		CurrentAc ca = new MMCurrentAc(4567, "shalini", 200000);
		
		sa.withdraw(sa.getAccBal());
		sa.toString();
		ca.withdraw(ca.getCreditLimit());
		ca.toString();
		
	}

}
