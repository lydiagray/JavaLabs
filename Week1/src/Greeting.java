import java.util.*;

public class Greeting {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String name;
		
		System.out.println("Please enter your name:");
		name = sc.nextLine();
		System.out.println("Hello " + name + ", pleased to meet you!");
	}

}
