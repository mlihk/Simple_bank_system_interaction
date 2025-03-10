package simpleBankSystem;
import java.util.ArrayList;
import java.util.List;


public class main {

    public static void main(String[] args) {
    	

        System.out.println("What's good!");
        
        AccountController controller = new AccountController();
        

        
        Customer person = controller.createCustomer("Marcus Liu", "FDM group building, FDM Street, FDM District", "person");
        
        Customer person2 = controller.createCustomer("Bruh", "ABC building, DEF Street, HPO District", "person");
        
        Account savingsAccount = controller.createAccount(person, "savings");
        Account checkingAccount = controller.createAccount(person, "checking");
        
        Account savingsAccount2 = controller.createAccount(person2, "savings");
        
        savingsAccount.deposit(1000);
        
        System.out.println(person.getName());
        System.out.println(person.getAddress());
        System.out.println(person2.getAddress());
        
        System.out.println("");
        System.out.println("Cusomter IDs:");
        System.out.println(person.getCUSTOMER_ID());
        System.out.println(person2.getCUSTOMER_ID());
        System.out.println("");
        
        System.out.println(person.getAccounts());
        System.out.println(savingsAccount.getBalance());
        System.out.println(savingsAccount2.getBalance());
        
        savingsAccount.withdraw(300);
        System.out.println(savingsAccount.getBalance());
        
        
        System.out.println("Setting Balance as a millionare");
        savingsAccount2.correctBalance(1000000);
        
        System.out.println(savingsAccount2.getBalance());
        System.out.println(checkingAccount.getBalance());
        
        Customer company1 = controller.createCustomer("FDM Group", "123 testing street", "company");
        Account companySavingsAccount = controller.createAccount(company1, "savings");
        Account companyCheckingAccount = controller.createAccount(company1, "checking");
        System.out.println(company1.getCUSTOMER_ID());
        System.out.println(company1.getAccounts());
        
        companySavingsAccount .deposit(1000);
        companyCheckingAccount .deposit(1000);
        System.out.println(companySavingsAccount.getBalance());
        System.out.println(companyCheckingAccount.getBalance());
        company1.chargeAllAccounts(500);
        System.out.println(companySavingsAccount.getBalance());
        System.out.println(companyCheckingAccount.getBalance());
        
        System.out.println("Customers before removal:");
        for (Customer customer : controller.getCustomers()) {
            System.out.println(customer.getName());
        }
        
        
        System.out.println("");
        System.out.println("Yo");
        
        controller.removeCustomer(person2);
        System.out.println(person2.getCUSTOMER_ID());
        System.out.println(person2.getCUSTOMER_ID());
        System.out.println(savingsAccount2.getBalance());
        
        System.out.println("Customers after removal:");
        for (Customer customer : controller.getCustomers()) {
            System.out.println(customer.getName());
        }
        
        
    }
}