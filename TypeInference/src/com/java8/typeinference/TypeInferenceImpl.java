package com.java8.typeinference;


public class TypeInferenceImpl 
{
	public static void main( String[] args)
	{
	// type inference, < > left it blank, compiler will infer type
	TypeInferenceExample <String, Integer> ex1 = new TypeInferenceExample<String, Integer>("Demo1", 30);
	System.out.println("Text : "+ex1.getFirst());
	System.out.println("Integer value is : "+ex1.getSecond());
	// type inference, < > left it blank, compiler will infer type
	TypeInferenceExample <Integer, Integer> ex2 = new TypeInferenceExample< >(35, 40);
	System.out.println("Integer value is : "+ex2.getFirst());
	System.out.println("Integer value is : "+ex2.getSecond());
	// type inference, < > left it blank, compiler will infer type
	TypeInferenceExample <Integer, String> ex3 = new TypeInferenceExample< >(15,"Demo2");
	System.out.println("Integer value is : "+ex3.getFirst());
	System.out.println("Text : "+ex3.getSecond());
	}
}
