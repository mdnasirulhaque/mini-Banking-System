package com;

public abstract class Account implements Comparable<Account>{
	private int accountId;
	private int customerId;
	private double balance;
	public Account(int accountId, int customerId, double balance) {
		super();
		this.accountId = accountId;
		this.customerId = customerId;
		this.balance = balance;
	}
	public int getAccountId() {
		return accountId;
	}
	public int getCustomerId() {
		return customerId;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	abstract double deposit(double amount);
	abstract double withdraw(double amount);
	
	public int compareTo(Account a)
	{
		if(this.getAccountId()<a.getAccountId())
			return 1;
		return 0;
	}
}
