package console;

import java.util.Scanner;

public class Operation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System.in);
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		int i=s.nextInt();
		System.out.println("Enter first number");
		int a=s.nextInt();
		System.out.println("enter second number");
		int b=s.nextInt();
		int result = 0;
	
	switch(i)
	{
	case 1:
		result=a+b;
		break;
	case 2:
		result=a-b;
		break;
	case 3:
		result=a*b;
		break;
	case 4:
		if(b==0)
		{
			System.out.println("no division");
			break;
		}
			else
				result=a/b;
		default:
		System.out.println("wrong enter");
	}
	System.out.println(" "+result);
}
}
