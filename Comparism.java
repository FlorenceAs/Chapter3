import java.util. Scanner;
public class Comparism{
	public static void main (String [] args){
		Scanner input = new Scanner (System.in);
		
		int biggerNumber =0;
		int first;
		int second;
		
		System.out.println("enter first number");
		first= input.nextInt();
		
		System.out.println("enter second number");
		second= input.nextInt();
		
		/*System.out.printf("%d%n", first+second);
		System.out.printf("%d%n", first-second);
		System.out.printf("%d%n", first*second);
		System.out.printf("%d%n", first/second);*/



		if (first > second){
			System.out.printf("%d is larger", first);		
		}
		

		if (first < second){
			System.out.printf("%d is larger", second);
		}
				
		if (first == second){
			System.out.println("These numbers are equal");
		}
		
	}
}