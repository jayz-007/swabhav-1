package com.techlabs.model;

public class Account {

	private double balance;
	private static int MINIMUM_BALANCE;
	private static int totalNoOfTransactions;

	static {
		totalNoOfTransactions = 0;
	}

	public void deposit(double amt) {
		balance = balance + amt;
		totalNoOfTransactions++;
	}

	public void withdraw(double amt) {
		if (balance - amt > MINIMUM_BALANCE) {
			balance = balance - amt;
			totalNoOfTransactions++;
		}
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public static void setMinimumBalance(int mimBalance) {
		MINIMUM_BALANCE = mimBalance;
	}

	public double getBalance() {
		return balance;
	}

	public static int getTotalTransations() {
		return totalNoOfTransactions;
	}
}
