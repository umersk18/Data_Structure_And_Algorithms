package com.algorithms;

public class InsertionSort {

	public static void main(String[] args) {
		int input[] = {24,39,5,97,31,-77,10};
		
		for(int firstUnsortedIndex = 1; firstUnsortedIndex < input.length; firstUnsortedIndex++) {
			int element = input[firstUnsortedIndex];
			int i = firstUnsortedIndex;
			while(i > 0 && element < input[i-1]) {
				input[i] = input[i-1];
				i--;
			}
			input[i] = element;
		}
		
		for(int a : input) {
			System.out.println(a);
		}
	}
}
