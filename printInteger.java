package basic.problems;

import java.util.InputMismatchException;
import java.util.Scanner;

public class printInteger {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Integer Value");
		try {
			int number = sc.nextInt();
			System.out.println("The integer value entered is " + number);
		} catch (InputMismatchException e) {
			System.out.println("Enter valid Integer number");
		}
	}
}
