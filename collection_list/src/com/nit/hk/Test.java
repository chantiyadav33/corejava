package com.nit.hk;

import java.util.ArrayList;

public class Test {
public static void main(String[] args) {
	
	//any object data
	ArrayList<Object> a1= new ArrayList<Object>();
	a1.add("hari");//String
	a1.add('h');//char
	a1.add(12);//int
	a1.add(10.0);//decimal
	a1.add(20.0f);//float
	System.out.println("a1::"+a1);
	                              //noof records avalabile
	System.out.println("size::"+a1.size());
	//re-enter data 
	a1.add(" hari");
	a1.add('h');
	a1.add(12);
	a1.add(10.0);
	a1.add(20.0f);
	a1.add(a1);
	System.out.println("after re-enter data size::"+a1.size());
	System.out.println("a1 re- enter data::"+a1);
	System.out.println("a1.get(3)::"+a1.get(3));
	System.out.println(a1.getFirst());
	System.out.println(a1.getLast());
	System.out.println(a1.contains("hari"));
	System.out.println(a1.contains(null));
   // System.out.println(a1.get(11));	


	//only String data
	 ArrayList< String> a2= new ArrayList<String>();
	 a2.add("hari");
	 //a2.add(12);
	 //a2.add('h');
	a2.add("krishna");
	//System.out.println("a2::"+a2);
	
}
}
