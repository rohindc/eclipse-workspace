package Day2;

import java.util.Scanner;

public class armstrongNum {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number ");
		if (armstrongCheck(sc.nextInt()) == true)
			System.out.println("It is a Armstrong number");
		else
			System.out.println("Not a Armstrong number");
	}

	static boolean armstrongCheck(int n) {
		int num = n, digits = 0, sum = 0;
		while (num > 0) {
			digits++;
			num = num / 10;
		}
		num = n;
		while (num > 0 && digits != 2) {
			sum += Math.pow(num % 10, digits);
			num = num / 10;
		}
		if (sum == n)
			return true;
		return false;
	}

}
