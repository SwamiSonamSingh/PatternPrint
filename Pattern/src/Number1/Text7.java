package Number1;
public class Text7 
{
	public static void space(int p)
	{
		for(int j=1;j<=p;j++)
		{
			System.out.print(" ");
		}
		return;
	}
	public static void star(int q,int i)
	{
		for(int k=1;k<=q;k++)
		{
			System.out.print(i);
		}
		return;
	}
	public static void main(String[] ar)
	{
		for(int i=1;i<=5;i++)
		{
			space(5-i);
			star(2*i-1,i);
			System.out.println();	
		}
	}
}
