import java.util.*;
class parent
{
	void display1()
	{
		System.out.println("This is Parent Class");
	}
}
class child extends parent
{
	void display2()
	{
		System.out.println("This is Child Class");
	}
}
public class assesment1 
{
	public static void main(String[] args)
	{
		parent obj = new parent();
		child sc = new child();
		obj.display1();
		sc.display2();
	}
}
