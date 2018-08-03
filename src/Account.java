
import java.util.Date;

public class Account {
	// Initial variables
	int id = 0;
	double balance = 0;
	double annualInterestRate = 0;
	Date dateCreated;
	
	public Account(){
		// set date
		dateCreated = new Date();
	}
	
	Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
	}

	// getters and setters for the initial variables
	public double getMonthlyInterestRate() {
		return (annualInterestRate / 12) / 100;
	}
	public double getMonthlyInterest() {
		return getBalance() * getMonthlyInterestRate();
	}
	public int getId() {
		return id;
	}
	public void setId(int newId){
		id = newId;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double newBalance){
		balance = newBalance;
	}
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public void setAnnualInterestRate(double newAnnualInterestRate) {
		annualInterestRate = newAnnualInterestRate;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	
	
	
	
	// methods to deposit/withdraw
	public void deposit(double amount) {
		balance += amount;
	}
	public void withdraw(double amount) {
		balance -= amount;
	}
	
}
// CheckingAccount class
class CheckingAccount extends Account {
	
	@Override
	public void withdraw(double amount) {
		if (amount > 10000)
			System.out.println("You can't withdraw that much!!");
		else if (amount <= 0)
			System.out.println("You have to withdraw more than 0 dollars.");
		else
		balance -= amount;
	}
	
}

/* SavingsAccount class (Not used for this assignment, but if there are differences for a savings account,
   such as a different interest rate, this class would contain methods).
*/
class SavingsAccount extends Account {
	
}
