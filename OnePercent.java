
public class OnePercent {

	public static void main(String[] args) {
		
		double total, tax, interest;
		
		Account acct1 = new Account ("Donald Trump", 20230715, 400);
		Account acct2 = new Account ("Bill Gates", 31558040, 500);
	    Account acct3 = new Account ("Warren Buffet", 44003050, 600);
	    Account acct4 = new Account ("Uncle Same", 999999999);
		
	    System.out.println (acct1);
	    System.out.println (acct2);
	    System.out.println (acct3);
	    System.out.println(acct4);
	    System.out.println();
	    
	    total = acct1.getBalance() + acct2.getBalance() + acct3.getBalance() + acct4.getBalance();
	    System.out.println("Total ammount of money in the bank is $" + (total));
	    System.out.println();
	    
	    tax = acct1.getBalance()*(0.15);
	    acct1.withdraw(tax);
	    acct4.deposit(tax);
	    
	    tax = acct2.getBalance()*(0.15);
	    acct2.withdraw(tax);
	    acct4.deposit(tax);
	    
	    tax = acct3.getBalance()*(0.15);
	    acct3.withdraw(tax);
	    acct4.deposit(tax);
	    
	    System.out.println (acct1);
	    System.out.println (acct2);
	    System.out.println (acct3);
	    System.out.println(acct4);
	    System.out.println();
	    
	    interest = 0.015;
	    acct1.addInterest(interest);
	    acct2.addInterest(interest);
	    acct3.addInterest(interest);
	    acct4.addInterest(interest);
	    
	    System.out.println (acct1);
	    System.out.println (acct2);
	    System.out.println (acct3);
	    System.out.println(acct4);
	    
	}

}
