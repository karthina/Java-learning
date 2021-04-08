package com.cportal.interview;


public class Test {
	public static void main(String[] args) {
	String Str = "Hello";
	String Str1 = new String( "world");
	String Str3 = new String("my name is Arthi");
	
	char str[] = {'a', 'b','c','d'};
	String s = new String(str);
	
//	System.out.println(Str);
//	System.out.println(Str1);
//	System.out.println(Str3);
//	System.out.println(str);
	
	
	int sum, i=10;
	String n="100";
	String n2 = "-50";
	int num = Integer.parseInt(n);
	int num2= Integer.valueOf(n2);
	sum= num +num2;
	System.out.println(sum);
	String add = String.valueOf(sum);
	String add1 = Integer.toString(i);
} 
}
