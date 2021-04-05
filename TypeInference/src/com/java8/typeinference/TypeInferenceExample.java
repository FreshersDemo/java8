package com.java8.typeinference;

public class TypeInferenceExample <x,y>
{
	private x first;
	private y second;
	public TypeInferenceExample(x a, y b)
	{
		first=a;
		second=b;
	}
	public x getFirst() 
	{
		return first;
	}
	public y getSecond()
	{
		return second;
	}
}
