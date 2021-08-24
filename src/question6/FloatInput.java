package question6;
import java.util.Scanner;

public class FloatInput {
	public static void main(String[]args) {
		System.out.println("Enter the number");
		float testFloat;
		Scanner sc = new Scanner(System.in);
		testFloat = sc.nextFloat();
		System.out.printf("%.2f",testFloat);
		
		
	}

}
