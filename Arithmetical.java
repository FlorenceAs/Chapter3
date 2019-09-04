import java.util.Scanner;
public class Arithmetical{
 	public static void main(String [] args){
		int num1, num2, num3, sum, average, product, smallest, largest;
		System.out.print("This is a program that perform the sum, average, product, smallest and largest of three integers");

		Scanner input = new Scanner (System.in);
		System.out.print("Enter first number");
		num1 = input.nextInt();

		System.out.print("Enter second number");
		num2 = input.nextInt();

		System.out.print("Enter third number");
		num3 = input.nextInt();

		sum = num1 + num2 + num3;

		average = sum/3;

		product = num1 * num2* num3;
		
		largest = (num1>num2, num1>num3, num2>num1, num2>num3, num3>num1, num3>num2)

		smallest = (num1<num2, num1<num3, num2<num1, num2<num3, num3<num1, num3<num2)

		if (num1 > num2){
			largest = num1;
		}

		if (num1 > num3){
			largest = num1;
		}

		if (num2 > num1){
			largest = num2;
		}

		if (num2 > num3){
			largest = num2;
		}

		if (num3 > num1){
			largest = num3;
		}

		if (num3 > num2){
			largest = num3;
		}

		if (num1 < num2){
			smallest = num1;
		}

		if (num1 < num3){
			smallest = num1;
		}

		if (num2 < num1){
			smallest = num2;
		}
		
		if (num2 < num3){
			smallest = num2;
		}

		if (num3 < num1){
			smallest = num3;
		}

		if (num3 < num2){
			smallest = num3;
		}

		System.out.printf("The sum of the integers are %d%n", sum);
		System.out.printf("The average number of the integers is %d%n", average);
		System.out.printf("The product result of the integers is %d%n", product);
		System.out.printf("The largest number is %d%n", largest);
		System.out.printf("The smallest number is %d%n", smallest);
	}
}