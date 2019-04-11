package javaP;

public class ConstructorTest 
{
	/*ConstructorTest()
	{
		 System.out.println("Testing constructor using java ");
	}*/
	
	int id;  
	String name;  
	 
	void display()
	{
		System.out.println(id+" "+name);
	}  
	
	public static void main(String[] args)
	{
		ConstructorTest ct = new ConstructorTest();
		ConstructorTest ct1 = new ConstructorTest();
		ct.display();
		ct1.display();
	}

}
