package basic;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 371, orginalNumber, remainder, result = 0;
		orginalNumber = number;
		while(orginalNumber != 0) {
			remainder = orginalNumber % 10;
			Math.pow(remainder,3);
			orginalNumber/=10;
		}
		if(result == number)
			System.out.println(number+ "is a Armstrong number :");
		else
			System.out.println(number+ "is not a Armstrong number");		
	}
}
