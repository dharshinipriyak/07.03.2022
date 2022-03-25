package com.stringMethods;

public class StringFeatures2 {

	public static void main(String[] args) 
	{
		//getBytes
		//returns ASCII numbers
		String sentence="Welcome to Pondicherry";
		System.out.println("getBytes Method");
		byte b1[]=sentence.getBytes();
		for (byte B:b1)
		{
			System.out.println(B);
		}
		System.out.println("**********");
		
		//indexOf(char ch)
		//returns 
		String text="She is a scientist";
		System.out.println("indexOf(char ch) Method");
		System.out.println(text.indexOf('e'));
		System.out.println(text.indexOf('e',7));
		System.out.println("*********");
		
		//indexOf (String)
		String texts="She is a scientist, he is a Doctor";
		System.out.println("indexOf(String str)Method");
		System.out.println(texts.indexOf("is"));
		System.out.println(texts.indexOf("is",15));
		System.out.println("*********");
		
		//intern
		//returns canonical representation of String object
		System.out.println("intern method");
		String S="Welcome to Pondy";
		String S1=S.intern();
		System.out.println(S1);
		System.out.println("***************");
		
		//length
		//returns the length of the string
		//isEmpty
		//returns boolean
		String Str1="Welcome to Pondy";
		String Str2="";
		System.out.println("length and isEmpty Method");
		System.out.println(Str1.length());
		System.out.println(Str1.isEmpty());
		
		System.out.println(Str2.length());
		System.out.println(Str2.isEmpty());
		

	}

}
