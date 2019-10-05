package com;

public class BankDemo {
	public static void main(String args[])
	{
		Bank b1=new Bank();
		SavingAccount sv1=new SavingAccount(1,1,100);
		SavingAccount sv2=new SavingAccount(2,2,100);
		SavingAccount sv3=new SavingAccount(3,3,100);
		b1.addAccount(sv1);
		b1.addAccount(sv2);
		b1.addAccount(sv3);
		
		System.out.println(b1.deposit(1, 10));
		
		try 
		{
			System.out.println(b1.withdraw(2, 100));
			System.out.println(b1.withdraw(2, 10));
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		System.out.println(b1.getUniqueCustomerIds());
		System.out.println(b1.getAccountHashMap());
		
		SavingAccount sv4=new SavingAccount(3,4,100);
		
		System.out.println(b1.addAccount(sv4));
		
		NewBank nb= new NewBank();
		
		nb.addAccounts(sv1);
		nb.addAccounts(sv4);
		nb.addAccounts(sv2);
		nb.addAccounts(sv3);
		
		System.out.println();		
	}
}
