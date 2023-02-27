package com.akash;

import java.util.Scanner;

/*

Problem
Given 'n', print the symbol 'Z' spanning n rows using '*' symbol. Value of n>2 and n<=20.

Example:
1) Input : n=3
Output:
***
 *
***

2) Input n=4
Output:
****
  *
 *
****

 */
public class Pattern2 {
	 public static void main(String args[] ) {
	      Scanner sc = new Scanner(System.in);
	      int n = sc.nextInt();
	     // System.out.print(n);
	      //outer loop
	      for(int i = 1; i <=n; i++){
	          //inner loop
	         for(int j = 1; j <= n; j++){
	              if(i == 1 || i == n || (i == (n - j + 1)) ){
	               System.out.print("*");
	          }else{
	               System.out.print(" ");
	          }
	         }
	         System.out.println();
	      }
	    }
}
