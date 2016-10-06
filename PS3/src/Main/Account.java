package Main;

import java.util.Date;

public class Account {
	
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	
	Account(){
		id = 0;
		balance = 0;
		annualInterestRate = 0;
		dateCreated = new Date();
	}
	
	Account(int newID, double initialBalance){
		id = newID;
		balance = initialBalance;
		annualInterestRate = 0;
		dateCreated = new Date();
	}
	
	int getID(){
		return id;
	}
	
	void setID(int x){
		id = x;
	}
	
	double getBalance(){
		return balance;
	}
	
	void setBalance(double x){
		balance = x;
	}
	
	double getInterest(){
		return annualInterestRate;
	}
	
	void setInterest(double x){
		annualInterestRate = x;
	}
	
	Date getDate(){
		return dateCreated;
	}
	
	double getMonthlyInterestRate(){
		return (annualInterestRate/12);
	}
	
	void withdraw(double x) throws InsufficientFundsException{
		if (balance>x){
			balance -= x;
		}
		else throw new InsufficientFundsException(x);
	}
	
	void deposit(double x){
		balance += x;
	}
	
	

}
