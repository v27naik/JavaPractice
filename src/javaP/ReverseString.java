package javaP;

import java.util.Scanner;

public class ReverseString 
{

	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter String : " );
		String str = sc.nextLine();
		String reverse="";
		int length = str.length();
	     
	      for (int i = length-1 ; i >= 0 ; i--)
	      {
	         reverse = reverse + str.charAt(i);
	        
	      }
	      System.out.println("Reverse of the string: " + reverse);
	 }
	
}
