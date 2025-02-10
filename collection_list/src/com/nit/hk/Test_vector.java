package com.nit.hk;

import java.util.Vector;

public class Test_vector {
public static void main(String[] args) {
	Vector< Object> v1= new Vector<Object>();
	v1.add(10);
	v1.add(20.0f);
	v1.add(30.0);
	v1.add("hari");
	v1.add('h');
	v1.add(true);
	v1.add(false);
	v1.add("hyd");
	v1.add(1000);
	
	System.out.println("v1 values ::"+v1);
	System.out.println(" total size::"+v1.size());
	v1.add(10);
	v1.add(20.0f);
	System.out.println("v1 values ::"+v1);
	System.out.println(" total size::"+v1.size());
	System.out.println("v1.contains(30.0)::"+v1.contains(30.0));
	System.out.println("v1.get(4)"+v1.get(4));
	System.out.println("v1.getFirst()::"+v1.getFirst());
    System.out.println("v1.getLast()::"+v1.getLast());
    System.out.println("v1.isEmpty()::"+v1.isEmpty());
    System.out.println("v1.capacity()::"+v1.capacity());
    System.out.println("v1.size()::"+v1.size());
    System.out.println(v1.isEmpty());
    System.out.println(v1.lastElement()); 
    System.out.println();
    
  
}
}
