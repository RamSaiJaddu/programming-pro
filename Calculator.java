package inher;

import java.util.Scanner;

public class Calculator 
{
	Scanner ss = new Scanner(System.in);
	double amount;
   // double GstPercentage;
    int choice;
	
//	Calculator(double amount)
//	{
//			this.amount = amount;
//	}
	public void calculate()
	{
		if(amount>=0)
		{
		// double d = amount*(GstPercentage/100);
		
			System.out.println("select GST percentage : ");
			System.out.println("press 1 for 5 percentage :");
			System.out.println("press 2 for 12 percntge :");
			System.out.println("press 3 for 18 percentage :");
			System.out.println("press 4 for 28 percentage :");
			//  c1.GstPercentage = sc.nextDouble();
			choice = ss.nextInt();	
			
		switch(choice)
		{
		case 1 :
		double d1 = amount*0.05;
		double k1 = d1+amount;
		System.out.println("GST amount : "+d1);
		System.out.println("Total Amount :"+k1);
		break;
		
		case 2 :
		double d2 = amount*0.12;
		double k2 = d2+amount;
		System.out.println("GST amount : "+d2);
		System.out.println("Total Amount :"+k2);
		break;
		
		case 3 :
		double d3 = amount*0.18;
		double k3 = d3+amount;
		System.out.println("GST amount : "+d3);
		System.out.println("Total Amount :"+k3);
		break;
		
		case 4 :
		double d4 = amount*0.28;
		double k4 = d4+amount;
		System.out.println("GST amount : "+d4);
		System.out.println("Total Amount :"+k4);
		break;
		
		default:
		System.out.println("invalid choice...!");
		}
			// System.out.println("please enter valid amount..");
		}
		else
		{
			 System.out.println("Not a valid Amoount...");
		}
	}
}
