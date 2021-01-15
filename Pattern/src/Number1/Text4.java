package Number1;
public class Text4 
{
	public static void space(int x)
	{
		for(int j=1;j<=x;j++)
		{
			System.out.print(" ");
		}
		return;
	}
	public static void star(int y)
	{
		for(int k=1;k<=y;k++)
		{
			System.out.print("*");
		}
		return;
	}
	public static void space1(int d)
	{
		for(int q=1;q<=d;q++)
		{
			System.out.print(" ");
		}
		return;
	}
	public static void star1(int z)
	{
		for(int p=1;p<=z;p++)
		{
			System.out.print("*");
		}
		return;
	}
	public static void main(String[] ar)
	{
		for(int i=1;i<=5;i++)
		{
			space(5-i);
			star(2*i-1);
			System.out.println();
		}
		for(int f=1;f<=5;f++)
		{
			space1(f);
			star1(9-2*f);
			System.out.println();
		}
	}
}
