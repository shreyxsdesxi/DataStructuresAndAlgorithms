package com.cognizant.algorithms.sorting;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Sorting {

	public static void main(String[] args) {

		int[] array = { 100, 9, 30000, -12, Integer.MAX_VALUE, 80, 0, 30, -9876, 780, Integer.MIN_VALUE };
		// Sorting.bubbleSort(array);
		//Sorting.selectionSort(array);
//		Sorting.insertionSort(array);
//		Sorting.printArray(array);
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		int[] array1 = list.stream().mapToInt(i -> i).toArray();
		Collections.min(list);
		Arrays.stream(array).boxed().collect(Collectors.toList());
		
		
		
	}
	
	//Bubble Sort O(N2) complexity
	public static void bubbleSort(int[] array) {
		int length = array.length;
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	}
	
	//Selection Sort O(N2) complexity
	public static void selectionSort(int[] array) {
		int length = array.length;
		for (int i = 0; i < length; i++) {
			int minIndex = i;
			for (int j = i + 1; j < length; j++) {
				if (array[j] < array[minIndex]) {
					minIndex = j;
				}
			}
			if (minIndex != i) {
				int temp = array[minIndex];
				array[minIndex] = array[i];
				array[i] = temp;
			}
		}
	}
	
	public static void insertionSort(int[] array) {
		int length = array.length;
		for(int i = 0; i < length; i++) {
			
		}
	}

	public static void printArray(int[] array) {
		Arrays.stream(array).forEach(x -> {
			System.out.print(x + " ");
		});
	}
	
//	public static BigInteger factorial(int n) {
////		BigInteger i = new BigInteger(1l);
////		return new BigInteger(1);
//	} 
}
