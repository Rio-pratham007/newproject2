package Methods;

public class Example1 
{
	public static void main(String[] args)
	{
		m1();
		
		System.out.println("........................");
		
		Example1 ex = new Example1();
		ex.m2();


	}
	
	// Regular static method
	
	public static void m1()
	{
		System.out.println("Running regular static method");
	}	
	
	// Regular Non-Static method
	
	public void m2()
	{
		System.out.println("Running regular non-static method");
	}

}
