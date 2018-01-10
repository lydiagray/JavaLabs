import java.util.*;

public class BabyBoomers {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int birthYear;
		boolean babyBoomer;
		
		System.out.println("What year were you born?");
		birthYear = sc.nextInt();
		
		if (birthYear >= 1945 && birthYear <= 1964) {
			babyBoomer = true;
			System.out.println(babyBoomer + " You are a baby-boomer!");
		}
		
		else {
			babyBoomer = false;
			System.out.println(babyBoomer + " You are not a baby-boomer!");
		}
	}

}
