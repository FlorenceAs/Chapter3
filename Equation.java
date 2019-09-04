import java.util.Scanner;
public class Equation{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("solve the equation for y=ax^3 +7");
		System.out.print("Enter the value for a:");
		int a= input.nextInt();
		System.out.print("Enter the value for x:");
		int x = input.nextInt();
		int y = a*(x*x*x)+7;
		System.out.printf("value of y = %d",y);
		
  }
}  