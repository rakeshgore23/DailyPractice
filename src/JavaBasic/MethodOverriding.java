package JavaBasic;

class Addtion
{
	void add(int a,int b)
	{
		int x,y;
		x=a;
		y=b;
		System.out.println("Addtion of two number is "+(x+y));
	}
}
class Second extends Addtion
{
	void add(int a,int b,int c)
	{
		int x,y,z;
		x=a;
		y=b;
		z=c;
		super.add(x, y);
		System.out.println("Addtion of three number "+(x+y+z));
	}
}


public class MethodOverriding {

	public static void main(String[] args) {
		Second s=new Second();
		s.add(10, 20,30);
		
		
	}

}
