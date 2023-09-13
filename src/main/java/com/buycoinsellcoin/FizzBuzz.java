package com.buycoinsellcoin;

/**
 * Standard "FizzBuzz" problem made famous on the Internet by someone who
 * claimed 50% of programmers coming to coding interviews are unable to complete
 * this simple problem!!
 * 
 * I know this is not you, ENJOY!!
 */
public class FizzBuzz {
	public static void main(String[] args) {
		Integer i = 900;
		System.out.println(
				isDivisibleBy15(i) ? "FizzBuzz" : isDivisibleBy5(i) ? "Fizz" : isDivisibleBy3(i) ? "Buzz" : "NADA");
	}

	private static boolean isDivisibleBy3(Integer i) {
		return i % 3 == 0;
	}

	private static boolean isDivisibleBy5(Integer i) {
		return i % 5 == 0;
	}

	private static boolean isDivisibleBy15(Integer i) {
		return i % 15 == 0;
	}
}
