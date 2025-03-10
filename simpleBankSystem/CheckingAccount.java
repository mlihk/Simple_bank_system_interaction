package simpleBankSystem;

public class CheckingAccount extends Account{
	private static int nextCheckNumber = 1;
	
	public int getNextCheckingNumber() {
		return this.nextCheckNumber++;
	}
}
