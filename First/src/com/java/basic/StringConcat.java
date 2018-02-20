package com.java.basic;

public class StringConcat {

	public static void main(String[] args) {
		methodPrint("Anu","Deep","Ram","Raj");

	}
	public static void methodPrint(String name0,String name1,String name2,String name3)
	{
		String one = "Welcome";
		System.out.println(one.concat(name0));
		System.out.println(one.concat(name1));
		System.out.println(one.concat(name2));
		System.out.println(one.concat(name3));

	}

}
