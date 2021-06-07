package basic;

public class SwapNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first = 120 , second=220;
		int temporary;
		System.out.println("--Before swap--");
		System.out.println("First number = "+ first);
		System.out.println("First number = "+ second);
		first = first - second;
		second = first + second;
		first = second - first;
		System.out.println("--After swap--");
		System.out.println("First number = "+ first);
		System.out.println("First number = "+ second);
		
	}

}
