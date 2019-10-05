package com;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Bank {
	private ArrayList<Account> account;

	public Bank() {
		super();
		account=new ArrayList<Account>();
	}
	
	boolean addAccount(Account acc)
	{
		for(Account a:account)
			if(a.getAccountId()==acc.getAccountId())
				return false;
		account.add(acc);
		return true;
	}
	
	double deposit(int accountId, double amount)
	{
		for(Account a:account)
			if(a.getAccountId()==accountId)
				{
					a.deposit(amount);
					return a.getBalance();
				}
		return -1;
	}
	
	double withdraw(int accountId, double amount) throws OutOfBlanceException
	{
		for(Account a:account)
			if(a.getAccountId()==accountId)
				if(a.getBalance()>=amount)
				{
					a.withdraw(amount);
					return a.getBalance();
				}
				else
					throw new OutOfBlanceException(a.getBalance(),amount);
		return -1;
	}
	
	HashSet<Integer> getUniqueCustomerIds()
	{
		HashSet<Integer> hsci=new HashSet<Integer>();
		for(Account a:account)
			hsci.add(a.getCustomerId());
		return hsci;
	}
	
	HashMap<Integer, Account> getAccountHashMap()
	{
		HashMap<Integer, Account> hma=new HashMap<Integer, Account>();
		for(Account a:account)
			hma.put(a.getAccountId(), a);
		return hma;
	}
}
