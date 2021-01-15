package Number1;

//printing pattern using function
public class Text1
{
	
	//a function is decleared and it have no return type
	public static void star( int t)
	{
		
		//according to requirement form loop
		//& print the pattern
		for(int j=1;j<=t;j++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	public static void main(String[] ar)
	{
		for(int i=1;i<=5;i++)
		{
			
			//function defination
			star(i);
		}
	}
}
