package Main;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AccountTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void Account() throws InsufficientFundsException {
		Account account = new Account(1122,20000);
		account.setInterest(4.5);
		account.withdraw(2500);
		account.deposit(3000);
		System.out.println("Balance: " + account.getBalance());
		System.out.println("Monthly Interest: " + account.getMonthlyInterestRate());
		System.out.println("Date: " + account.getDate());
		account.setBalance(0);
		account.withdraw(100);
	}

}
