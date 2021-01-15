package Number1;
public class Text6 
{
	public static void space(int x) 
	{
		for(int j=1;j<=x;j++)
		{
			System.out.print(" ");
		}
		return;
	}
	public static void  star(int y)
	{
		for(int k=1;k<=y;k++)
		{
			System.out.print("*");
		}
	}
public static void main(String[] ar)
{
	for(int i=1;i<=5;i++)
	{
		space(i-1);
		star(6-i);
		System.out.println();
	}
}
}
