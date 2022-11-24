package javaone;

import java.util.Scanner;
/*
 1.two space separated string s1,s2 ,remove those characters in s1 that 
 are already present in s2?
 	input:information technology
 	ouput:ifrmai
 */

public class RemoveCharacter {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the word : ");
		String str = in.nextLine();
		String st = "";
		String[] s = str.split(" ");
		for (int i = 0; i < s[0].length(); i++) {
			for (int j = 0; j < s[1].length(); j++) {
				if (s[0].charAt(i) == s[1].charAt(j)) {
					break;
				} else if (j == s[1].length() - 1) {
					st += s[0].charAt(i);
				}
			}

		}
		System.out.println(st);
	}
}
