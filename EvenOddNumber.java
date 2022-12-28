import java.util.*;  
public class EvenOddNumber {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number");
		int a= in.nextInt();  
		if (a%2==0)
		{
			System.out.print("The number is even");
		}
		else
		{
			System.out.print("The Number is odd");
		}
	}
}