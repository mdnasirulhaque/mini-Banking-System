package com;

public class OutOfBlanceException extends Exception {
	private static final long serialVersionUID = 1L;
	private double currentBalance;
	private double withDrawAmount;
	
	public OutOfBlanceException(double currentBalance, double withDrawAmount) {
		super();
		this.currentBalance = currentBalance;
		this.withDrawAmount = withDrawAmount;
	}
	
	@Override
	public String getMessage()
	{
		return String.valueOf(currentBalance-withDrawAmount);
	}

}
