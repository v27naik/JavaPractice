package javaP;

import java.util.Scanner;

public class LargestWord 
{

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter sentens : " );
		String str = sc.nextLine();
	
		String lw="";
	        int s=str.length(),l=0;
	        String words[]=str.split(" ");
	        for(String word:words)
	        {
	               if (word.contains("!"))
	               {
	            	   
	                continue;
	               }
	               else if (word.length()>l)
	                {
	                        lw=word;
	                        l = word.length();
	                }
	        }
	        System.out.println("LONGEST WORD : "+lw);
	
	}

}
