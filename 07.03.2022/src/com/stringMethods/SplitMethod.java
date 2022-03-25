package com.stringMethods;

public class SplitMethod {

	public static void main(String[] args) {
		//split Method
				String Sentence="Java Fullstack development course";
				String text1[]=Sentence.split("\\s");
				for(String text:text1)
				{
					System.out.println(text);
				}
			

	}

}
