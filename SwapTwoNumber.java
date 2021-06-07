package basic;

public class SwapTwoNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first = 100 , second=200;
		int temporary;
		System.out.println("--Before swap--");
		System.out.println("First number = "+ first);
		System.out.println("First number = "+ second);
		temporary = first;
		first = second;
		second = temporary;
		System.out.println("--After swap--");
		System.out.println("First number = "+ first);
		System.out.println("First number = "+ second);
		
	}

}
