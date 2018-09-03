import java.util.Scanner;
class animal
{
	 String breed="german";
	String color="black";
	void speak()
	{
		System.out.println("overrideen");
	}
	
	
}
class dog extends animal
{
	void speak()
	{
		System.out.println("override speak fxn of animal class");
		
	}
	
}
class cat extends animal
{
	void speak()
	{
	System.out.print("overriding the animal fxn");}
	
}

class main
{
	public static void main(String[] args)
	{
		animal s=new dog();
		s.speak();
		animal z=new cat();
		z.speak();
		
		
	}
	
}