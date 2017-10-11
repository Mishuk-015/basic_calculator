import java.util.Scanner;

public class CALCULATOR1 {

	public static void main(String[] args)
	{
		Funcholder1 op =new Funcholder1();
		System.out.print("Enter 1 for addition,2 for subtraction,3 for division,4 for multiplication,5 for aquare of a number:");
		Scanner in=new Scanner(System.in);
		int operation=in.nextInt();
		System.out.println("Enter 2 numbers:");
		float a=in.nextFloat();
		float b=in.nextFloat();
		if(operation==1)
		{
			System.out.println("Result of addition:"+op.add(a,b));
		}
		else if(operation==2)
		{
			System.out.println("Result of subtraction:"+op.sub(a,b));
		}
		else if(operation==3)
		{
			System.out.println("Result of division:"+op.div(a,b));
		}
		else if(operation==4)
		{
			System.out.println("Result of multiplication:"+op.mul(a,b));
		}
		else if(operation==5)
		{
			System.out.println("Result of square of number 1:"+op.sqr(a));
			System.out.println("Result of square of number 2:"+op.sqr(b));
		}
		else {
			{
				System.out.println("Not valid option");
			}
		}
	}

}
