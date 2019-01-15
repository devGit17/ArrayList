package com.test;

import java.util.ArrayList;

public class TestArray
{

	public static void main(String[] args) 
	{
		ArrayList<String> list=new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		
		System.out.println(list);
		list.add(3, "insert");
		System.out.println(list);
		list.remove("one");
		System.out.println(list);
		list.remove(1);
		System.out.println(list);
		
		
		ArrayList<String> list2=new ArrayList<String>();
		list2.add("five");
		list2.add("six");
		list2.add("seven");
		list2.add("eight");
		list.add("insert");
		System.out.println("-----------------------------");
		list.addAll(list2);
		System.out.println(list);
		list.addAll(1, list2);
		System.out.println(list);
		
		list.removeAll(list2);
		System.out.println(list);
	}

}
 