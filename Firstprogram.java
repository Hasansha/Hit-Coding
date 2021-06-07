package basic;

import java.util.Scanner;

public class Firstprogram {
		public static void main(String[] args) {
		int sum,S,S1;
		System.out.println("Enter the first number");
		Scanner Scan = new Scanner(System.in);
		S = Scan.nextInt();
		System.out.println("the first number is "+S);
		System.out.println("Enter the second value");
		S1 = Scan.nextInt();
		sum = S+S1;
		//String X = (S+S1);
		System.out.println("the sum of the number is "+ sum);
		}
}