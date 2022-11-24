package javaone;

import java.util.Scanner;

/*
 * input:
 * 		enter the number of array:4
 * 		Numbers :2 7 11 15
 * 		enter the target :9
 * Output:
 * 		true
 * 		indices :[0,1]
 * 
 */

public class AddtwoInteger {
	public static boolean arr(int[] arr1, int n) {
		int num = arr1.length;
		for (int i = 0; i < num; i++) {
			for (int j = i + 1; j < num; j++) {
				if (arr1[i] + arr1[j] == n) {
					return true;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("enter the array size");
		int n = in.nextInt();
		System.out.println("enter the target");
		int target = in.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = in.nextInt();
		}

		System.out.println(arr(array, target));
	}

}
