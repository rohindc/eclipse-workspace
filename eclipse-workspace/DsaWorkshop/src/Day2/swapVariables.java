package Day2;

import java.util.Scanner;

public class swapVariables {
	static int x, y;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values of x and y : ");
		x = sc.nextInt();
		y = sc.nextInt();
		System.out.println("Before swaping x is " +x +" y is " +y +"\n");
		swap(x, y);
		System.out.println("After swaping x is " +x +" y is " +y);
	}

	static void swap(int n1, int n2) {
		x = n2;
		y = n1;
	}
}
