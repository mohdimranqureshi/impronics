package com.impronics.assesment;

public class HighestCommonFactor {

	public static void main(String[] args) {

		int[] arr = { 13, 19, 38 };
		try {
			System.out.println(highestCommonFactor(arr));
		} catch (ArithmeticException exception) {
			System.out.println("Please provide array" + exception.getMessage());
		}
	}

	static int gcd(int a, int b) {
		if (a == 0) {
			return b;
		} else {
			return gcd(b % a, a);
		}
	}

	static int highestCommonFactor(int[] numbers) {
		int result = 0;
		if (numbers != null && numbers.length > 0) {
			result = numbers[0];
			for (int element : numbers) {
				result = gcd(result, element);
				if (result == 1) {
					return 1;
				}
			}
		} else {
			throw new ArithmeticException("Array can't be null");
		}

		return result;
	}

}
