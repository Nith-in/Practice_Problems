package basic.problems;

import java.util.Scanner;

public class MultiplyFloatNums {

	public static void main(String[] args) {
		float product;
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter two numbers to multiply");
			float i1 = sc.nextFloat();
			float i2 = sc.nextFloat();

			product = i1 + i2;
			System.out.println("The multiplication of two float numbers entered is " + product);
		} catch (Exception e) {
			System.out.println("Enter valid float numbers");
		}
	}
}
