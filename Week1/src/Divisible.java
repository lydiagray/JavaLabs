import java.util.*;

public class Divisible {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean divisible;
		int x, y;
		
		System.out.println("Please enter a whole number");
		x = sc.nextInt();
		System.out.println("Please enter another whole number");
		y = sc.nextInt();
		System.out.println("Does " + y + " divide exactly into " + x + "?");
		
		if (x % y <= 0) {
			divisible = true;
			System.out.println("The answer is " + divisible);
		}
		
		else {
			divisible = false;
			System.out.println("The answer is " + divisible);
		}
	}

}
