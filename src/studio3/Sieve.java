package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Find all the prime numbers up to: ");
		int numberOfPrimeNumbers = in.nextInt();
		int[] numberArray = new int [numberOfPrimeNumbers+1];

		for (int i = 0; i <= numberOfPrimeNumbers; i++) {
			numberArray[i] = i;
			System.out.print(numberArray[i] + " ");
		}
		System.out.print("\n");
		for (int i = 2; i <= numberOfPrimeNumbers; i++) {
			numberArray[0] = 0;
			numberArray[1] = 0;
			for (i = 4; i <= numberOfPrimeNumbers; i++) {
				numberArray[i] = 0;
				i++;
			}
			for (i = 9; i <= numberOfPrimeNumbers; i++) {
				numberArray[i] = 0;
				i = i + 2;
			}
			for (i = 25; i <= numberOfPrimeNumbers; i++) {
				numberArray[i] = 0;
				i = i + 4;
			}
		}
		for (int i = 0; i <= numberOfPrimeNumbers; i++) {
			System.out.print(numberArray[i] + " ");
		}
	}
}
