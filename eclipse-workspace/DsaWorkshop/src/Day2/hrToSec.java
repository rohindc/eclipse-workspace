package Day2;

import java.util.Scanner;

public class hrToSec {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the total hours : ");
		System.out.println(convertToSec(sc.nextInt()) + " sec");
	}

	static int convertToSec(int h) {

		return h * 3600;
	}
}
