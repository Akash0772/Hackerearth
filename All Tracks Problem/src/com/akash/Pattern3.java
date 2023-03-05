package com.akash;

public class Pattern3 {
	public static void main(String[] args) {
		String str = "COMPUTER";
		int size = str.length()-1;
		char ch[] = new char[size + 1];
		for(int i = 0; i <= size; i++) {
			ch[i] = str.charAt(i);
		}
		for(char c: ch) {
			System.out.print(c);
		}
		System.out.println();
		for(int i = size; i >= 0; i--) {
			for(int j = 0; j <= i; j++) {
				System.out.print(ch);
			}
			System.out.println();
		}
	}
}
