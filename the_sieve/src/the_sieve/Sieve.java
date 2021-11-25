package the_sieve;

import java.util.ArrayList;
import java.util.Scanner;

public class Sieve {

	public static void main(String args[]) {

		// Create input
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"Enter a number between 2 and 100 and you'll receive the prime numbers less than or equal to it:");

		int inputted_number = sc.nextInt();

		// Check input
		if (inputted_number < 2 || inputted_number > 100) {
			System.out.println("You failed to follow directions. Goodbye.");
			sc.close();
			System.exit(0);
		};

		// Fetch prime numbers
		ArrayList<Integer> prime_numbers = new ArrayList<Integer>();
		for (int i = 2; i <= inputted_number; i++) {
			if (isPrime(i)) {
				prime_numbers.add(i);

			}
		}

		// Print prime numbers
		System.out.println(prime_numbers);
		sc.close();
		System.exit(0);
	}

	// Source for this function:
	// https://codereview.stackexchange.com/questions/24704/efficiently-determining-if-a-number-is-prime
	public static boolean isPrime(int n) {

		if ((n > 2 && n % 2 == 0) || n == 1) {
			return false;
		}

		for (int i = 3; i <= (int) Math.sqrt(n); i += 2) {

			if (n % i == 0) {
				return false;
			}
		}

		return true;
	}

}
