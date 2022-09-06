package basic.problems;

import java.util.Scanner;

public class AddTwoIntegers {

	public static void main(String[] args) {
		int sum;

		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter two numbers to add");
			int i1 = sc.nextInt();
			int i2 = sc.nextInt();

			sum = i1 + i2;
			System.out.println("The sum of two numbers entered is " + sum);
		} catch (Exception e) {
			System.out.println("Enter valid two Integers");
		}

	}

}
