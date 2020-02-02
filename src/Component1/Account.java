package Component1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account
{
	Scanner input =new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
	
	public int setCustomerNumber(int customerNumber)
	{
		this.customerNumber= customerNumber;
		return customerNumber;
	}
	public int getCustomerNumber()
	{      return customerNumber;    }
	
	public int setPinNumber(int pinNumber)
	{
		this.pinNumber= pinNumber;
		return pinNumber;
	}
	public int getPinNumber()
	{   return pinNumber;       }
	
	public double getCheckingBalance()
	{
		return checkingBalance;
	}
	public double getSavingBalance()
	{
		return savingBalance;
	}
	
	public double calcCheckingWithdraw(double amount)
	{
		checkingBalance = (checkingBalance - amount);
		return checkingBalance;
	}
	public double calcSavingWithdraw(double amount)
	{
		savingBalance = (savingBalance - amount);
		return savingBalance;
	}
	public double calcCheckingDeposit(double amount)
	{
		checkingBalance=(checkingBalance + amount);
		return checkingBalance;
	}
	public double calcSavingDeposit(double amount)
	{
		savingBalance=(savingBalance + amount);
		return savingBalance;
	}
	
	public void getCheckingWithdrawInput()
	{
	System.out.println("Checking Account Balance: " + moneyFormat.format(checkingBalance));
	System.out.print("Amount you want to withdraw from checking Account: ");
	double amount = input.nextDouble();
	
	if((checkingBalance-amount)>=0)
	{
		calcCheckingWithdraw(amount);
		System.out.println("New checking account balance: "+ moneyFormat.format(checkingBalance));
	}
	else
	{
		System.out.println("Balance can not be negative." + "\n");
	}
}
	
	public void getSavingWithdrawInput()
	{
		System.out.println("Saving Account Balance: "+ moneyFormat.format(savingBalance));
		System.out.println("Amount you want to withdraw from saving Account:");
		double amount = input.nextDouble();
		
		if((savingBalance - amount)>=0)
		{
			calcSavingWithdraw(amount);
			System.out.println("New Saving account balance: "+ savingBalance +"\n");
		}
		else
		{
			System.out.println("Balance can not be negative." + "\n");
		}
	}
	

	public void getCheckingDepositInput()
	{
		System.out.println("Checking Account Balance: "+ moneyFormat.format(checkingBalance));
		System.out.println("Amount you want to deposit from checking Account:");
		double amount = input.nextDouble();
		
		if((checkingBalance+amount)>=0)
		{
			calcCheckingDeposit(amount);
			System.out.println("New checking account balance: "+ moneyFormat.format(checkingBalance));
		}
		else
		{
			System.out.println("Balance can not be negative." + "\n");
		}
	}
	
	public void getSavingDepositInput()
	{
		System.out.println("Checking Saving Account Balance: "+ moneyFormat.format(savingBalance));
		System.out.println("Amount you want to deposit from checking Account:");
		double amount = input.nextDouble();
		
		if((savingBalance+amount)>=0)
		{
			calcSavingDeposit(amount);
			System.out.println("New checking account balance: "+ moneyFormat.format(savingBalance));
		}
		else
		{
			System.out.println("Balance can not be negative." + "\n");
		}
	}
	
	
	private int customerNumber;
	private int pinNumber;
	private double checkingBalance=0;
	private double savingBalance=0;
	
}