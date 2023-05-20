package Methods;

public class Example3 
{
	public static void main(String[] args)
	{
		
		add(50,60);
		add(100,200);
		
		System.out.println("...............................");
		
		Example3 ex = new Example3();
		ex.sub(100,50);
		ex.sub(50, 25);
	}

	
	public static void add(int num1, int num2)
	{
		System.out.println(num1+num2);
	}
	
	public void sub(int num3, int num4) 
	{
		System.out.println(num3-num4);
	}

}
