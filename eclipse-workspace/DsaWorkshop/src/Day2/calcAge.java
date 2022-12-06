package Day2;

import java.time.LocalDate;
import java.util.Scanner;

public class calcAge {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the DoB in yyyy-mm-dd format : ");
		System.out.println(findAge(LocalDate.parse(sc.next())) + " is the age.");

	}

	static int findAge(LocalDate dob) {
		int age = 0;
		age += LocalDate.now().getYear() - dob.getYear();
		if (LocalDate.now().getMonthValue() < dob.getMonthValue())
			age--;
		else if (LocalDate.now().getMonthValue() >= dob.getMonthValue()
				&& LocalDate.now().getDayOfMonth() < dob.getDayOfMonth())
			age--;
		return age;
	}

}
