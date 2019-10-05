package com;

public class SavingAccount extends Account {

	public SavingAccount(int accountId, int customerId, double balance) {
		super(accountId, customerId, balance);
		
	}

	double deposit(double amount) {
		this.setBalance(this.getBalance()+amount);
		return this.getBalance();
	}

	double withdraw(double amount) {
		this.setBalance(this.getBalance()-amount);
		return this.getBalance();
	}

}
