package basic;
import java.util.Scanner;
public class FactorialOfNUmber {
	public static void main(String[] args) {
		int fact,i,num,value,n;
		System.out.println("enter to calculate factorial number");
		Scanner scan=new Scanner(System.in);
		num=scan.nextInt();
	    value= fact(num);
		System.out.println("The factorial value="+value);
	}
	static int fact (int n)
	{
		int output;
		if(n==1)
		{	return 1;
		}
		else
		{
		output=fact(n-1)*n;
		return output;
		}
		}
}