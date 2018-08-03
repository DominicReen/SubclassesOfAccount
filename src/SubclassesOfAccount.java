// I'm reusing my code for 9.7 and making the changes specified.
// This is showing the power of modularized code!
public class SubclassesOfAccount {

	public static void main(String[] args) {
		// create account
		Account Account = new Account();
		
		// set values
		Account.setBalance(20000);
		Account.setId(1122);
		Account.setAnnualInterestRate(4.5);
		
		// print Id and initial balance
		System.out.println("Account Id: " + Account.getId());
		System.out.println("Initial balance: $" + Account.getBalance());
		
		// withdraw money
		Account.withdraw(2500);
		System.out.print("Withdrawing $2,500");
		
		// simulate thinking (I did this for fun)
		think();
		
		// print balance
		System.out.println("New balance: $" + Account.getBalance());
		
		// deposit money
		Account.deposit(3000);
		System.out.print("Depositing $3,000");
		
		// simulate thinking again
		think();
		
		// print balance, monthly interest, and date of Account
		System.out.println("New balance: $" + Account.getBalance());
		System.out.println("Monthly Interest: $" + Account.getMonthlyInterest());
		System.out.println("Date: " + Account.getDateCreated());
		
		
		// Explain what's happening
		System.out.print("Creating Checking Account (Withdraw amount limit is $10,000)");
		// simulate thinking
		think();
		
		// create CheckingAccount
		CheckingAccount CheckingAccount = new CheckingAccount();
		
		// set values
		CheckingAccount.setBalance(30000);
		CheckingAccount.setId(1123);
		CheckingAccount.setAnnualInterestRate(5.0);
		
		// print Id and initial balance
		System.out.println("Checking account Id: " + CheckingAccount.getId());
		System.out.println("Initial balance: $" + CheckingAccount.getBalance());
		
		// withdraw money
		CheckingAccount.withdraw(3000);
		System.out.print("Withdrawing $3,000");
				
		// simulate thinking
		think();
		
		// print balance
		System.out.println("New balance: $" + CheckingAccount.getBalance());
		
		// deposit money
		CheckingAccount.deposit(5000);
		System.out.print("Depositing $5,000");
		
		// simulate thinking again
		think();
		
		// print balance, monthly interest, and date of Account
		System.out.println("New balance: $" + CheckingAccount.getBalance());
		System.out.println("Monthly Interest: $" + CheckingAccount.getMonthlyInterest());
		System.out.println("Date: " + CheckingAccount.getDateCreated());
		
		// Test out the limit to withdraw money
		System.out.println("Now let's withdraw too much!");
		System.out.print("Withdrawing $12,000");
		// simulate thinking
		think();
		CheckingAccount.withdraw(12000);
		
		// Print account balance after that attempt
		System.out.println("Account Balance: $" + CheckingAccount.getBalance());
		
		
		// Create Savings Account
		// Explain what's happening
		System.out.print("Creating Savings Account (No withdraw amount limit)");
		think();
		SavingsAccount SavingsAccount = new SavingsAccount();
		
		// set values
		SavingsAccount.setBalance(50000);
		SavingsAccount.setId(1124);
		SavingsAccount.setAnnualInterestRate(3.0);
		
		// print Id and initial balance
		System.out.println("Savings account Id: " + SavingsAccount.getId());
		System.out.println("Initial balance: $" + SavingsAccount.getBalance());
		
		// withdraw money
		SavingsAccount.withdraw(5000);
		System.out.print("Withdrawing $5,000");
						
		// simulate thinking
		think();
		
		// print balance
		System.out.println("New balance: $" + SavingsAccount.getBalance());
				
		// deposit money
		SavingsAccount.deposit(2000);
		System.out.print("Depositing $2,000");
				
		// simulate thinking again
		think();
			
		// print balance, monthly interest, and date of Account
		System.out.println("New balance: $" + SavingsAccount.getBalance());
		System.out.println("Monthly Interest: $" + SavingsAccount.getMonthlyInterest());
		System.out.println("Date: " + SavingsAccount.getDateCreated());
		
		// Check to see if there's a limit for withdrawing money
		System.out.println("Now let's withdraw a lot of money, and see if there's a limit!");
		System.out.print("Withdrawing $45,000");
		// simulate thinking
		think();
		SavingsAccount.withdraw(45000);
		
		// Print out balance after withdrawing the huge amount
		System.out.print("Account Balance: $" + SavingsAccount.getBalance());
		
	}
	
	// I created a think method, since I'm using this piece of code so often
	public static void think() {
		try {
		    Thread.sleep(1000);
		    System.out.print(".");
		    Thread.sleep(1000);
		    System.out.print(".");
		    Thread.sleep(1000);
		    System.out.println(".");
		} catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}
	}
	
}

