package Methods;

public class Example2 
{
	public static void main(String[] args)
	{
		car();
		yellow();
		
		System.out.println("..........................");
		
		Example2 ex = new Example2();
		ex.panipuri();
		ex.mobile();


	}
	
	// static method
	
		public static void car()
		{
			System.out.println("This is my car");
		}
		
		public static void yellow ()
		{
			System.out.println("my fev colour yellow ");
		}
		
		// Non-static method
		
		public void panipuri()
		{
			System.out.println("I like panipuri");
		}
		
		public void mobile()
		{
			System.out.println("My moblie is redmi ");
		}
		
		

}

