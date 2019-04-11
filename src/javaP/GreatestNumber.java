package javaP;

import java.util.Scanner;

public class GreatestNumber 
{

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter first number : " );
		int num1 = sc.nextInt();
		System.out.println("Enter second number : " );
		int num2 = sc.nextInt();
		
		System.out.println(Boolean.valueOf(CheckNums(num1,num2)));
		
	}
		
		public static String CheckNums(int num1, int num2) 
		  { 
		        if(num1==num2)
		        {
		       
		         return "-1";
		        }
		        else if (num2>num1)
				{
		        	
					return "true";
				
				}
				else
				{
				
					return "false";
					
				}
		       
		    
		    
		  } 
	

}
