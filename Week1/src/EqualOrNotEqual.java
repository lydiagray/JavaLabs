import java.util.Scanner;

public class EqualOrNotEqual {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numberA, numberB;
		
		System.out.println("Please enter your first number");
		numberA = sc.nextInt();
		System.out.println("Please enter your second number");
		numberB = sc.nextInt();
		
		if (numberA == numberB) {
			System.out.println("NUMBERS ARE EQUAL");
		}
			
		else {
			System.out.println("NUMBERS ARE NOT EQUAL");
		}
		
	}

}
