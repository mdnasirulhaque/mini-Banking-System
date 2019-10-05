package com;
import java.util.TreeSet;

public class NewBank {
	private TreeSet<Account> account;

	public NewBank() {
		super();
		account=new TreeSet<Account>();
	}
	
	int addAccounts(Account a)
	{
		account.add(a);
		return account.size();
	}
	
	TreeSet<Account> getAccounts()
	{
		return account;
	}
}
