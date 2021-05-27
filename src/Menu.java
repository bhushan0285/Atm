import java.io.IOException;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map.Entry;
import java.text.DecimalFormat;


public class Menu extends Account{
   Scanner menuInput = new Scanner(System.in);
	   DecimalFormat moneyFormat =new DecimalFormat("'$'###,##0.00");
       HashMap<Integer,Integer> data= new HashMap<Integer,Integer>();
       public void getlogin()throws IOException{ 
    	   int x =1;
    	   do {
    		   try {
    			   data.put(123456, 123);
    			   data.put(212212, 212);
    			   System.out.println("welcome the ATM project");
    			   System.out.println("Enter your customer Number");
    			  setCustomerNumber(menuInput.nextInt());
    			   System.out.println("Enter your pin number");
    			   setPinNumber(menuInput.nextInt());
    			   
    		   }catch(Exception e) {
    			System.out.println("invalid character,Enter only Number"+"\n");
    			x=2;
    		   }
    		   for(Entry<Integer,Integer> entry:data.entrySet()) {
    			   if(entry.getKey()==getCustomerNumber() && entry.getValue()==getPinNumber())
    			   {
    				 getAccountType();
    			   }
    		   }
    		   System.out.println("wrong customer numbe or id"+"\n");
    	   }while(x==1);
      
	}
		int selection;
        //disply account type menu
        public void getAccountType() {
        	System.out.println("select the Account you want to access");
        	System.out.println("type 1: checking Account");
        	System.out.println("type 2:saving Account");
        	System.out.println("type 3 Exit");
        	System.out.println("choice :");
        	selection = menuInput.nextInt();
        	switch(selection) { 
        	case 1:
        		getChecking();
        		break;
        	case 2:
        		getsaving();
        		break;
        	case 3:
        		System.out.println("thank you for using this atm,Bye ");
        	    break;
        	    
        	    default:
        	    	System.out.println("Invalid choice"+"\n");
        	    	getAccountType();
        	} 	
        }
        //checking Account menu with selection  
        public void getChecking() {
        	System.out.println("checking Account");
        	System.out.println("type 1:view Balance");
        	System.out.println("type 2:withdraw funds");
        	System.out.println("type 3:Deposite funds");
        	System.out.println("type 4: Exit");
        	System.out.println("choice:"+"\n");
        	selection = menuInput.nextInt();
        	switch(selection) {
        	case 1:
        		System.out.println("checking Account Balance"+ moneyFormat.format(getCheckingBalance()));
        		getAccountType();
        		break;
        	case 2:
        		getCheckingWithdrawalInput();
        		getAccountType();
        		break;
        	case 3:
        		getCheckingDepositInput();
        		getAccountType();
        		break;
            default:
            	System.out.println("\n"+"invalid choice"+"\n");
            	getChecking();
        	}
        }
        
        //saving account menu with selection
        public void getsaving() 
        {
        	System.out.println("saving Account");
        	System.out.println("type 1:view Balance");
        	System.out.println("type 2:withdraw funds");
        	System.out.println("type 3:Deposite funds");
        	System.out.println("type 4: Exit");
        	System.out.println("choice:"+"\n");
        	selection = menuInput.nextInt();
        	switch(selection){
        	case 1:
        		System.out.println("saving Account Balance"+ moneyFormat.format(getSavingBalance()));
        		getAccountType();
        		break;
        	case 2:
        		getSavingWithdrawalInput();
        		getAccountType();
        		break;
        	case 3:
        		getSavingDepositInput();
        		getAccountType();
        		break;
            default:
            	System.out.println("\n"+"invalid choice"+"\n");
            	getsaving();
        	}
        }
		
}			
		
       

