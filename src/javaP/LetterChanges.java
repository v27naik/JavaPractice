package javaP;

import java.util.Scanner;

public class LetterChanges 
{

	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter String : " );
		String str = sc.nextLine();
		
		int length = str.length();
		String newStr ="";
		String vov[] = {"a","e","i","o","u"};
			for (int i = length-1 ; i >= 0 ; i--)
				{
					for(int j=0;j<4;j++)
						{
							if(str.contains(vov[j]))
								{
									newStr = str.replace(vov[j], vov[j].toUpperCase());
								}
				
						}
				}
		System.out.println(newStr );
	}
	
	

}
