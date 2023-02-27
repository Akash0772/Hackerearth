package com.akash;
/*
Problem
Generate the pattern:

* * * * * * * * * * * * * * * * * * * * * * * * * 
  *           *   *           *   *           *   
    *       *       *       *       *       *     
      *   *           *   *           *   *       
        *               *               *         
      *   *           *   *           *   *       
    *       *       *       *       *       *     
  *           *   *           *   *           *   
* * * * * * * * * * * * * * * * * * * * * * * * * 

 */
public class Pattern {
	public static void main(String args[] ) throws Exception {
	       int n = 9;
	        int m = 25;
	        for(int i = 1; i <= 9; i++){
	            for(int j = 1; j <= m; j++){
	                if(i == 1 || i == n || j == i || i == (n - j + 1 ) || i == (j - n + 1 ) || i == (n * 2  - j) || i == (j - n - 7) || i == (n * 3 - j - 1)){
	                    System.out.print("* ");
	                }else{
	                    System.out.print("  ");
	                }
	            }
	            System.out.println();
	        }
	  }
}
