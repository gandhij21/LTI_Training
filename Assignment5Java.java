//Assignment5 Java by JAY GANDHI

public class Assignment5Java {

	public static void main(String[] args) {
		
		Account.setBankName("DBS");
		Account a1 = new Account();
		Account a2 = new Account(987654321, 10000.00, "PASS");
		a1.displayAccount();
		a2.displayAccount();
		
	}
	
}

class Account
{
	int accountNo;
	double accountBalance;
	String accountPassword;
	private static String bankName;
	
	static void setBankName(String bankN)
	{
		bankName = bankN;
	}
	
	Account()
	{
		
	}
	Account(int accountNo, double accountBalance, String accountPassword)
	{
		this.accountNo = accountNo;
		this.accountBalance = accountBalance;
		this.accountPassword = accountPassword;
		
	}
	protected void setbankName(String bankName)
	{
		this.bankName = bankName;
	}
	
	protected String getbankName()
	{
		return bankName;
	}
	
	protected int getAccountNo() {
		return accountNo;
	}
	protected void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	protected double getAccountBalance() {
		return accountBalance;
	}
	protected void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	protected String getAccountPassword() {
		return accountPassword;
	}
	protected void setAccountPassword(String accountPassword) {
		this.accountPassword = accountPassword;
	}
	
	void displayAccount()
	{
		System.out.println("------------------WELCOME TO  " + bankName + " ---------------------");
		System.out.println("Account Number is "+ accountNo);
		System.out.println("Account Balance is "+ accountBalance);
	}
	
}