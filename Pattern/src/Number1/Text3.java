package Number1;
public class Text3 
{
	public static void star(int x)
	{
		for(int p=1;p<=x;p++)
		{
			System.out.print("*");
		}
		return;
	}
	public static void main(String[] ar)
	{
		for(int i=1;i<=5;i++)
		{
			star(6-i);
			System.out.println();
		}
	}
}
