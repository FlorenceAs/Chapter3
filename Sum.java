import java.util.Scanner;
public class Sum{
	public static void main (String [] args){
		Scanner input=new Scanner (System.in);
		System.out.println("enter first number");
		int first= input.nextInt();

	
	System.out.println("enter second number");
		int second= input.nextInt();
		
		System.out.println("enter third number");
		int third= input.nextInt();

		int average =(first+ second+third)/3;
		

		System.out.printf("The result of %d+%d+%d = %d%n ",first, second, third, (first+second+third));

		System.out.printf("The average of the three numbers is %d%n", average);
		
		int num1;
		int num2;
		int num3;
		int largest;
		int smallest;


		System.out.println("enter first number:");
		num1 = input.nextInt();

		System.out.println("enter second number:");
		num2 = input.nextInt();
		
		System.out.println("enter third number:");
		num3 = input.nextInt();

		largest = 

		System.out.printf("The largest number is = %d%n", largest);
	}


	
}