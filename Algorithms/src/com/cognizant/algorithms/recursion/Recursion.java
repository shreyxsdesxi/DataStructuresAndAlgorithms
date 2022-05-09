package com.cognizant.algorithms.recursion;

import java.util.Arrays;
import java.util.Scanner;

public class Recursion {

	public static void main(String[] args) {
		
//		int result = Recursion.FibonacciSequence(7);
//		int result = Recursion.SumOfDigits(121);
//		int result = Recursion.PowerFunction(-2, 2);
		//int result = Recursion.GCD(270, 192);
		//System.out.println(result);
		int[] array = {1, 2, 3, 4, 5};
		int result = Recursion.ProductOfArray(array);
		System.out.println(result);
	}

	public static int FibonacciSequence(int index) {
		if (index == 0 || index == 1) {
			return index;
		} else {
			return FibonacciSequence(index - 1) + FibonacciSequence(index - 2);
		}
	}

	public static int SumOfDigits(int number) {
		if (number == 0) {
			return 0;
		} else {
			return (number % 10) + SumOfDigits(number / 10);
		}
	}

	public static int PowerFunction(int base, int exp) {
		if (exp == 1) {
			return base;
		} else if (exp == 0) {
			return 1;
		} else {
			return base * PowerFunction(base, exp - 1);
		}
	}

	public static int GCD(int num1, int num2) {
		if (num2 == 0) {
			return num1;
		} else {
			return GCD(num2, num1 % num2);
		}
	}
	
	public static int ProductOfArray(int[] array) {
		if(array.length == 1) {
			return array[array.length - 1];
		}
		else {
			return array[0]*ProductOfArray(Arrays.copyOf(array, array.length - 2));
		}
	}
	
}
