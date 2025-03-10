package simpleBankSystem;

import java.util.ArrayList;
import java.util.List;

public abstract class Customer{
	private final long CUSTOMER_ID;
	private final long INCREMENT_CONST = 7;
	private static long nextCustomerId = 2_000_000;
	private String name;
	private String address;
	private List<Account> accounts;
	
	public Customer(String name, String address) { //constructor, customer name and address should be set
		this.CUSTOMER_ID = nextCustomerId;
		this.nextCustomerId += this.INCREMENT_CONST;
		//could potential add a checker to check if name or address is valid, skip for now!
		this.name = name;
		this.address = address;
		this.accounts = new ArrayList<>();
	}
	
	public void addAccount(Account customerAccount) {
		this.accounts.add(customerAccount);
	}
	
	public void removeAccount(Account customerAccount) {
		if (this.accounts.contains(customerAccount)) {
			this.accounts.remove(customerAccount);
		}
	}
		
	public void chargeAllAccounts(double Amount) {
		if (this.accounts.size() > 0) {
			for (Account account : accounts) {
				account.withdraw(Amount);
			}
		}
	}
	
	public List<Account> getAccounts(){
		return new ArrayList<>(accounts);
	}
	
	public long getCUSTOMER_ID() {
		return this.CUSTOMER_ID;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
}
