package simpleBankSystem;

public class SavingsAccount extends Account{
	private double interestRate;
	
	public void addInterest() {
		this.balance = this.balance * (interestRate/100);
	}
	
	public double getInterestRate() {
		return this.interestRate;
	}
	
	public void setInterestRate(double rate) {
		this.interestRate = rate;
	}
	
}	
