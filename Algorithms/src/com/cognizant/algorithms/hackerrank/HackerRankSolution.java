package com.cognizant.algorithms.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.stream.Collectors;

public class HackerRankSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub0
		//HackerRankSolution.convertTo32BitBinary(4294967295l);
		//HackerRankSolution.minimumProcesses(new int[]{3, 1, 7, 2, 4}, 15);
		//System.out.println(3^3);
		
		List<Integer> capacity = new ArrayList<>();
		capacity.add(1);
		capacity.add(2);
		capacity.add(2);
		capacity.add(2);
		capacity.add(4);
		
		int desiredCapacity = 8; 
		
		long count = 0;
		for(int i = 0; i < capacity.size(); i++) {
			int currentTarget = desiredCapacity - capacity.get(i);
			Set<Integer> existingNums = new HashSet<>();
			for(int j = i + 1; j < capacity.size(); j++) {
				if(existingNums.contains(currentTarget - capacity.get(j))) {
					count++;
				}
				else {
					existingNums.add(capacity.get(j));
				}
			}
		}
		
		System.out.println(count);
		
		
	}
	
	public static void minimumProcesses(int[] array, int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		for(int i : array) {
			pq.add(i);
		}
		int count = 0;
		while(k > 0) {
			int temp = pq.poll();
			k = k - temp;
			count++;
			pq.add((int)Math.floor(temp/2));
		}
		
		System.out.println(count);
		k = 15;
		int countArray = 0;
		
		while(k > 0) {
			Arrays.sort(array);
			int temp = array[array.length - 1];
			k = k - temp;
			countArray++;
			array[array.length  -1]  = (int)Math.floor(temp/2);
		}
		System.out.println(countArray);
		
	}
	
	
	public static void convertTo32BitBinary(long num) {
		long n = num;
		int[] binaryArray = new int[32];
		int i = 0;
		while(n > 0) {
			binaryArray[i] = (int)n % 2;
			n = n / 2;
			i++;
		}
		List<Integer> reverseList = Arrays.stream(binaryArray).boxed().collect(Collectors.toList());
		Collections.reverse(reverseList);
		int[] reverseArray = reverseList.stream().mapToInt(x -> x).toArray();
		for(int j = 0; j < reverseArray.length; j++) {
			if(reverseArray[j] == 0) {
				reverseArray[j] = 1; 
			}
			else if(reverseArray[j] == 1) {
				reverseArray[j] = 0;
			}
		}
		long result = 0;
		int power = 0;
		for(int j = reverseArray.length - 1; j >= 0; j--){
            result = (long)(result + reverseArray[j]*Math.pow(2, power));
            power++;
        }
		
		System.out.println(result);
		
	}
}
