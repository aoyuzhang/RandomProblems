/*
 * Implement an algorithm to determine if a string has all unique characters.
 * What if you cannot use additional data structure?
 */
import java.util.Scanner;
public class IsUnique 
{

	public static void main(String[] args) 
	{
		Scanner scanner= new Scanner(System.in);
		String input= scanner.nextLine();
		if(input.length()>128)
		{
			System.out.println("The string does not have all unique characters as its length is greater than the number of characters");
			System.out.println("Thank you!");
			System.exit(0);
		}
		boolean[] charCount= new boolean[255];
		for(int i=0;i<input.length();i++)
		{
			if(charCount[input.charAt(i)]==true)
			{
				System.out.println("The string does not have all unique characters");
				System.out.println("Thank you!");
				System.exit(0);
			}
			if(charCount[input.charAt(i)]==false)
				charCount[input.charAt(i)]=true;
		}
		// TODO Auto-generated method stub
		System.out.println("The string has all unique characters");
	}

}
