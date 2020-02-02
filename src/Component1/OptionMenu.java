package Component1;

import java.io.IOException;
import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Scanner; 
import java.text.DecimalFormat;

public class OptionMenu extends Account
{
	Scanner menuInput = new Scanner(System.in);
	DecimalFormat moneyFormat=new DecimalFormat("'$'###,##0.00");
    HashMap<Integer, Integer> data=new HashMap<Integer,Integer>();

    public void getLogin() throws IOException
    {
    	int x=1;
    	do 
    	{
    	   try
    	   {
    		   data.put(1234567,1234);
    		   data.put(2345678,2345);
    		   
    		   System.out.println("Welcome to the ATM");
    		   
    		   System.out.print("Enter Your Customer ID:");
    		   setCustomerNumber(menuInput.nextInt());
    		 
    		   System.out.print("Enter Your PIN:");
    		   setPinNumber(menuInput.nextInt());
    	   }
    	   catch(Exception e)
    	   {
    		   System.out.println("\n"+ "Invalid Character(s). Enter Only Numbers."+"\n");
    		   x=2;
    	   }
    	   for(java.util.Map.Entry<Integer, Integer> entry : data.entrySet() )
    	   {
    		   if(entry.getKey() == getCustomerNumber() && entry.getValue()==getPinNumber())
               getAccountType();
    	   }
    	   System.out.println(" \n"+ "Wrong Customer ID or Pin Number."+"\n");
    	}
    	while(x==1);
    }
    
    public void getAccountType()
    {
    	System.out.println("Select the Account you want to access:");
    	System.out.println("Type 1 - Checking Account");
    	System.out.println("Type 2 - Saving Account");
    	System.out.println("Type 3 - Exit");
    	System.out.print("Choice : ");
    	
    	selection = menuInput.nextInt();
    	
    	switch(selection) 
    	{
    	case 1:
    		getChecking();
    		break;
    	case 2:
    		getSaving();
    		break;
    	case 3:
    		System.out.println("Thankyou for using this ATM");
    		break;
    
    	default:
    		System.out.println("\n"+"Invalid Choice"+"\n");
    		getAccountType();
    	}
    }
    public void getChecking()
    {
    	System.out.println("Checking Account: ");
    	System.out.println("Type 1 - View Balance");
    	System.out.println("Type 2 - Withdraw Funds");
    	System.out.println("Type 3 - Deposit Funds");
    	System.out.println("Type 4 - Exit");
    	System.out.print("Choice : ");
    	
    	selection = menuInput.nextInt();
    	
    	switch(selection) 
    	{
    	case 1:
    		System.out.println("Checking Account Balance: " + moneyFormat.format( getCheckingBalance() ));
    		getAccountType();
    		break;
    	case 2:
    		getCheckingWithdrawInput();
    		getAccountType();
    		break;
    	case 3:
    		getCheckingDepositInput();
    		getAccountType();
    		break;
    	case 4:
    		System.out.println("Thank you for using ATM");
    		break;
    	default:
    		System.out.println("\n"+"Invalid Choice"+"\n");
    		getChecking();
    	}
    }
    public void getSaving()
    {
    	System.out.println("Saving Account: ");
    	System.out.println("Type 1 - View Balance");
    	System.out.println("Type 2 - Withdraw Funds");
    	System.out.println("Type 3 - Deposit Funds");
    	System.out.println("Type 4 - Exit");
    	System.out.print("Choice : ");
    	
    	selection = menuInput.nextInt();
    	
    	switch(selection) 
    	{
    	case 1:
    		System.out.println("Saving Account Balance: " + moneyFormat.format(getSavingBalance()));
    		getAccountType();
    		break;
    	case 2:
    		getSavingWithdrawInput();
    		getAccountType();
    		break;
    	case 3:
    		getSavingDepositInput();
    		getAccountType();
    		break;
    	case 4:
    		System.out.println("Thank you for using ATM");
    		break;
    	default:
    		System.out.println("\n"+"Invalid Choice"+"\n");
    		getSaving();
    	}
    }
    int selection;
}