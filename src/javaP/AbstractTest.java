package javaP;

public class AbstractTest extends Bike
{

	void run()
	{
		System.out.println("running safely");
	} 
	public static void main(String[] args) 
	{
		 
		
		 Bike obj = new AbstractTest();  
		 obj.run(); 
	}

}

abstract class Bike
{  
	  abstract void run();  
}  