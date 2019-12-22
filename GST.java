package inher;

import java.util.Scanner;

public class GST {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the amount :");
		Calculator c1 = new Calculator();
		c1.amount = sc.nextDouble();
//		System.out.println("select GST percentage : ");
//		System.out.println("press 1 for 5 percentage :");
//		System.out.println("press 2 for 12 percntge :");
//		System.out.println("press 3 for 18 percentage :");
//		System.out.println("press 4 for 28 percentage :");
//		//  c1.GstPercentage = sc.nextDouble();
//		c1.choice = sc.nextInt();
		c1.calculate();
	}

}
