/**
 *
 * This program uses a recursive function to multiply a given positive number by the same number minus one, until the number is 0.  
 * 
 */


import java.util.Scanner;

public class factorial

{
	public static Scanner scan = new Scanner(System.in);


	public static void main(String[] args)
	{

		System.out.println("Enter a positive number to find its factorial: ");

		String factorial = scan.nextLine();
		
		int factorialNum = Integer.parseInt(factorial);

		System.out.println(factorialOp(factorialNum));

	}
	
	public static int factorialOp(int number)
	{

		if (number == 0)
		{
			return 1;
		}
		return number * factorialOp(number - 1);
	}
}
