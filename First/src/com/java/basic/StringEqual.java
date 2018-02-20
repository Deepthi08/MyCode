package com.java.basic;

public class StringEqual {

	public static void main(String[] args) {
      one o= new one();
     o.method1();
	}
	

}
class one{
	String S1 = "Anvitha";
    String S2 = "12345";
    String S3 = "Selenium";
	public void method1() {
	      System.out.println(S1.equals(S2));
	      System.out.println(S1.equals(S3));
	      
		
	}
}
