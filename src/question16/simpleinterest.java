package question16;
import java.util.Scanner;
public class simpleinterest {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		int t = sc.nextInt();
		float r = sc.nextFloat();
		float interest = (float)p*(float)t*r;
		float total = interest/100;
		System.out.printf("%.2f",+total);
	}

}
