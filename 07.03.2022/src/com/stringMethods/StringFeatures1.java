package com.stringMethods;

public class StringFeatures1 {

	public static void main(String[] args) 
	{	//charAt()
		//returns character

		String text="Java is Object Oriented";
		System.out.println("charAt Method");
		System.out.println(text.charAt(8));
		System.out.println(text.charAt(12));
		System.out.println(text.charAt(3));
		System.out.println("**********");

		//compareTo
		//returns int
		String text1="Keshava";
		String text2="Devi";
		String text3="keshava";
		String text4="Devi";
		System.out.println("compareTo method");
		System.out.println(text1.compareTo(text2));
		System.out.println(text2.compareTo(text4));
		System.out.println(text2.compareTo(text1));
		System.out.println("************");

		//compareToIgnoreCase
		//returns int value
		System.out.println("compareTOIgnoreCase method");
		System.out.println(text1.compareToIgnoreCase(text3));
		System.out.println("**********");

		//concat
		//returns character
		String Fname="Priya ";
		String Lname="Dharshni";
		System.out.println("Concat method");
		System.out.println(Fname.concat(Lname));
		System.out.println("*************");

		//contains
		//returns boolean

		String sentence="Arun is a Cricketer";
		System.out.println("contains method");
		System.out.println(sentence.contains("is"));
		System.out.println(sentence.contains("cricketer"));
		System.out.println(sentence.contains("Cricket"));
		System.out.println("**********");

		//endsWith
		//returns boolean

		String S="Java is not Pure Object Oriented";
		System.out.println("endsWith method");
		System.out.println(S.endsWith("Oriented"));
		System.out.println(S.endsWith("Pure"));
		System.out.println(S.endsWith("oriented"));
		System.out.println("*********");

		//equals
		//returns boolean
		String A="FullStack";
		String B="Developer";
		String C="FullStack";
		String D="developer";
		System.out.println("equals method");
		System.out.println(A.equals(B));
		System.out.println(A.equals(C));
		System.out.println(B.equals(D));
		System.out.println("*********");
		System.out.println("equalsToIgnoreCase");
		System.out.println(B.equalsIgnoreCase(D));
	}

}
