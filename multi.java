
import java.util.*;
class circle
{
	Scanner sc=new Scanner(System.in);
	void display()
	{
		int r;
		r=sc.nextInt();
		float p=3.14;
		float area=p*r*r;
		System.out.println(area);
	}
}
class rect extends circle
{
	Scanner sc1=new Scanner(System.in);
	void display1()
	{
		int l,b,area1;
		l=sc1.nextInt();
		b=sc1.nextInt();
		area1=l*b;
		System.out.println(area1);
	}
}
class square extends rect
{
	Scanner sc2=new Scanner(System.in);
	void display2()
	{
		int l1,area2;
		l1=sc2.nextInt();
		area2=l1*l1;
		System.out.println(area2);
	}
}
class multi 
{
		public static void main(String[] args)
		{
			square my=new square();
			my.display();
			my.display1();
			my.display2();
		}
}
