package com.java.basic;

public class DeleteSpaces {

	public static void main(String[] args) {
       String s = "Bright IT Career";//"B",12/12/1989
       String [] a1;
       a1=s.split(" ");
       System.out.println(a1.length);
       s=a1[0].concat(a1[1]).concat(a1[2]);
       System.out.println("!@#$%^&*()"+s);
	}
}