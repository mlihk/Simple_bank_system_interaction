package simpleBankSystem;

import java.util.ArrayList;
import java.util.List;

public abstract class Account{
	private static long nextAccountId = 1_000; //starting from 1,000
	private final long ACCOUNT_ID;
	private final long INCREMENT_CONST = 5; //increment account id by 5 each time, easy to change if stated as an independent long value
	protected double balance; //so balance can also be access in it's subclasses
	
	public Account(){
		this.ACCOUNT_ID = nextAccountId;
		nextAccountId += INCREMENT_CONST;
		this.balance = 0.0;
	}
	public void deposit(double depositeAmount) {
		if (depositeAmount < 0) {
			throw new IllegalArgumentException("Amount Entered is invalid!");
		}
		this.balance += depositeAmount;
	}
	public double withdraw(double withdrawalAmount) {
		if (withdrawalAmount < 0) {
			throw new IllegalArgumentException("Amount Entered is invalid!");
		}
		this.balance -= withdrawalAmount;
		return withdrawalAmount;
	}
	public void correctBalance(double correctedAmount) {
		this.balance = correctedAmount;
	}
	
	public long getACCOUNT_ID() {
		return this.ACCOUNT_ID;
	}
	
	public double getBalance() {
		return this.balance;
	}
}
