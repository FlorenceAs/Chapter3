import java.util.Scanner;
public class Multiplication{
  
	public static void main (String [] args){
	int num1, num2;
	Scanner in = new Scanner (System.in);
	int result =0;
	
	System.out.print ("Enter first number");
	num1 = in.nextInt();
	
	System.out.print ("Enter second number");
	num2 = in.nextInt();

	result = num1 * num2;
	System.out.printf ("Multiplication is %d%n", result);
	}
}

	