package question12;
import java.util.Scanner;

public class swapping2numbers {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c;
		c=a;
		a=b;
		b=c;
		System.out.println(+a);
		System.out.println(+b);
		
	}
}
