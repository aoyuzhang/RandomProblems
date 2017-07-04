/*
 * Given two strings, write a method to decide if one is a permutation of the other.
 */
import java.util.Scanner;
public class CheckPermutation {

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		String input1= scanner.nextLine();
		String input2= scanner.nextLine();
		if(checkPermutation(input1,input2))
			System.out.println("They are equal!");
		else
			System.out.println("They are not equal!");
		// TODO Auto-generated method stub

	}
	public static String sortString(String str)
	{
		char[] content=str.toCharArray();
		java.util.Arrays.sort(content);
		return new String(content);
	}
	public static boolean checkPermutation(String str1, String str2)
	{
		if(str1.length()!=str2.length())
			return false;
		return sortString(str1).equals(sortString(str2));
	}
	

}
