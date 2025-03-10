package simpleBankSystem;

import java.util.ArrayList;
import java.util.List;

public class AccountController{
	private List<Customer> customers;
	private List<Account> accounts;
	
	public AccountController() {
		this.customers = new ArrayList<>();
		this.accounts = new ArrayList<>();
	}
	
	public Customer createCustomer(String name, String address, String type) {
		Customer customer;
		if (type == "person") {
			customer = new Person(name, address);
		} else if (type == "company") {
			customer = new Company(name, address);
		} else {
			throw new IllegalArgumentException("Invalid Input!");
		}
		customers.add(customer);
		return customer;
	}
	
	public void removeCustomer(Customer customer) {
		customers.remove(customer);
		accounts.removeAll(customer.getAccounts());
	}
	
	public Account createAccount(Customer customer, String type) {
		Account account;
		if (type == "savings") {
			account = new SavingsAccount();
		} else if (type == "checking") {
			account = new CheckingAccount();
		} else {
			throw new IllegalArgumentException("Invalid input!");
		}
		accounts.add(account);
		customer.addAccount(account);
		return account;
	}
		
	public void removeAccount(Account account) {
		accounts.remove(account);
		for (Customer customer : customers) {
			customer.removeAccount(account);
		}
	}
	
	public List<Customer> getCustomers(){
		return new ArrayList<>(customers);
	}
	
	public List<Account> getAccounts(){
		return new ArrayList<>(accounts);
	}
	
	
}