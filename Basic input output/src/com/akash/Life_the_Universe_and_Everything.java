package com.akash;
// https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/life-the-universe-and-everything/
import java.util.Scanner;

/*

Problem
Your program is to use the brute-force approach in order to find the Answer to Life, the Universe, and Everything. More precisely... rewrite small numbers from input to output. Stop processing input after reading in the number 42. All numbers at input are integers of one or two digits.

Sample Input
1
2
88
42
99

Sample Output
1
2
88

 */
public class Life_the_Universe_and_Everything {
	public static void main(String[] args) {
		int n; //declaration
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        while(flag){
            n = sc.nextInt();
            if(n == 42){
                break;
            }
            System.out.println(n);
        }
	}
}
