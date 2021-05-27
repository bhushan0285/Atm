import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Account {
	Scanner input = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
	private int customerNumber;
	private int pinNumber;
	private double checkingBalance;
	private double savingBalance;
	
	//set the customerNumber
	
	public int setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
		return customerNumber;
	}
	public int setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
		return pinNumber;
	}
    public int getCustomerNumber() {
    	return customerNumber;
    }
    public int getPinNumber() {
    	return pinNumber;
    }
    public double getCheckingBalance() {
    	return checkingBalance;
    }
    public double getSavingBalance() {
    	return savingBalance;
}
    //calculate checking account withdawal
    public double calcCheckingWithdrawal(double amount) {
    	checkingBalance =(checkingBalance-amount);
    	return checkingBalance;
    }
    public double calcSavingWithdrawal(double amount) {
    	savingBalance =(savingBalance-amount);
    	return savingBalance;
    }
    //calculate checking account deposit
    public double calcCheckingDeposit(double amount) {
    	checkingBalance =(checkingBalance+amount);
    	return checkingBalance;
    }
    public double calcSavingDeposit(double amount) {
    	savingBalance =(savingBalance+amount);
    	return savingBalance;
    }
    //customer checking account withdrawal input
    public void getCheckingWithdrawalInput() {
		System.out.println("checking account Balance"+moneyFormat.format(checkingBalance));
    	System.out.println("Amount you want to withdraw from checking Account");
    	double amount= input.nextDouble();
    	if((checkingBalance-amount)>=0) {
    		calcCheckingWithdrawal(amount);
    		System.out.println("New checking accont Balance"+ moneyFormat.format(checkingBalance));
    	}else {
    		System.out.println("balance can not be negative"+"\n");
    	  }
    	}
    
    //customer saving acconut withdraw input
    	 public void getSavingWithdrawalInput() {
    			System.out.println("saving account Balance"+moneyFormat.format(savingBalance));
    	    	System.out.println("Amount you want to withdraw from saving Account");
    	    	double amount= input.nextDouble();
    	    	if((savingBalance-amount)>=0) {
    	    		calcSavingWithdrawal(amount);
    	    		System.out.println("New saving accont Balance"+ moneyFormat.format(savingBalance));
    	    	}else {
    	    		System.out.println("balance can not be negative"+"\n");	
    	    	}
    	 }
    	 
    	 //customer checking account deposit input
    	 public void getCheckingDepositInput() {
    			System.out.println("checking account Balance"+moneyFormat.format(checkingBalance));
    	    	System.out.println("Amount you want to deposit from checking Account");
    	    	double amount= input.nextDouble();
    	    	if((checkingBalance-amount)>=0) {
    	    		calcCheckingDeposit(amount);
    	    		System.out.println("New checking accont Balance"+ moneyFormat.format(checkingBalance));
    	    	}else {
    	    		System.out.println("balance can not be negative"+"\n");	
    	    	}
    	 }
    	 //customer saving account deposit input
    	 public void getSavingDepositInput() {
 			System.out.println("saving account Balance"+moneyFormat.format(savingBalance));
 	    	System.out.println("Amount you want to Deposit from saving Account");
 	    	double amount= input.nextDouble();
 	    	if((savingBalance+amount)>=0) {
 	    		calcSavingDeposit (amount);
 	    		System.out.println("New saving accont Balance"+ moneyFormat.format(savingBalance));
 	    	}else {
 	    		System.out.println("balance can not be negative"+"\n");	
 	    	}
    	 }
    }    