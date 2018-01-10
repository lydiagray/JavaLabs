import java.util.*;

public class NumberSwap {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y, z;
		
		System.out.println("Enter value for x ");
		x = sc.nextInt();
		System.out.println("Enter value for y ");
		y = sc.nextInt();
		
		z = x;
		x = y;
		y = z;
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}
	
}
