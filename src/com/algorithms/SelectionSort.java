package com.algorithms;

public class SelectionSort {

	public static void main(String[] args) {
		int input[] = {24,39,5,97,31,-77,10};
		
		for(int lastUnsortedIndex = input.length-1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
			int largest = 0;
			for(int i = 1; i <= lastUnsortedIndex; i++) {
				if(input[largest] < input[i]) {
					largest = i;
				}
			}
			
			int temp = input[largest];
			input[largest] = input[lastUnsortedIndex];
			input[lastUnsortedIndex] = temp;
		}
		
		for(int a : input) {
			System.out.println(a);
		}
	}

}
