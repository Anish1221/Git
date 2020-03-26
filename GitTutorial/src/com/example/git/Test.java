package com.example.git;

public class Test {

	public static void main(String[] args) {
		int[] input = { 10, 9, 8, 7, 6 };
		int sum = 0;
		for (int i : input) {
			System.out.println(i);
			sum += i;
		}
		System.out.println(sum);
	}

}
