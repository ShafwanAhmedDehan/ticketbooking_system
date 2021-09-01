package Functions;
import java.lang.*;
import java.util.*;
import Vehicle.*;
import Functions.*;
import Passanger.*;

public class Function01 extends Function
{
	public Function01()
	{
		
	}
	public int Payment(int p)
	{
		System.out.print("How much Seat you want to book : ");
		Scanner sc5=new Scanner(System.in);
		int a=sc5.nextInt();
		return p*a;
	}
}