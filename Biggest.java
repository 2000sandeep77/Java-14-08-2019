import java.util.Scanner;
class  Biggest
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter 3 numbers : ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int g=a>b && a>c? a : b>c ? b: c;
		System.out.println("Biggest is "+g);
	}
}
		