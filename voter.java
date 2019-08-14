import java.util.Scanner;
class Voter
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your name : ");
		String name=sc.nextLine();
		System.out.print("Enter age : ");
		int age=sc.nextInt();
		if(age>=18)
			System.out.printf("Dear %s you can vote ",name);
		else
			System.out.printf("Dear %s you cannot vote",name);
	}
}
