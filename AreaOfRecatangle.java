package basic;

import java.util.Scanner;

public class AreaOfRecatangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length of rectangle:");
		double length = scanner.nextInt();
		System.out.println("Enter the width of the rectangle");
		double width = scanner.nextInt();
		double area = length * width;
		System.out.println("Area of the rectangle is"+area);
	}
}
