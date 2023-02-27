package com.akash;
/*
 https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/is-zoo-f6f309e7/
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
Problem

You are required to enter a word that consists of x and y that denote the number of Zs and Os respectively. The input word is considered similar to word zoo if 
2 * x = y.

Determine if the entered word is similar to word zoo.

For example, words such as zzoooo and zzzoooooo are similar to word zoo but not the words such as zzooo and zzzooooo.

Input format

     First line: A word that starts with several Zs and continues by several Os.
Note: The maximum length of this word must be 20. 

Output format

Print Yes if the input word can be considered as the string zoo otherwise, print No.

Sample Input
zzzoooooo

Sample Output
Yes

 */
public class Zoos {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name = br.readLine();
//		System.out.println(name);
		String str = name.toLowerCase();
//		System.out.println(str);
		int x = 0;
		int y = 0;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == 'z') {
				x++;
			}
			if(str.charAt(i) == 'o') {
				y++;
			}
		}
//		System.out.println(x);
//		System.out.println(y);
		if((2*x) == y) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
