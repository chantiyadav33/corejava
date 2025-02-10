package com.nit.hk;

import java.util.LinkedList;

public class Test_Linklist {
public static void main(String[] args) {
	LinkedList<Object> l1= new LinkedList<Object>();
	l1.add("hari");
	l1.add(10L);
	l1.add('h');
	l1.add(1000);
	l1.add(true);
	l1.add(false);
	l1.add("bollean");
	System.out.println(l1);
	System.out.println(l1.contains(10l));
	System.out.println(l1.get(3));
	System.out.println(l1.getFirst());
	System.out.println(l1.getLast());
	System.out.println(l1.isEmpty());
	System.out.println(l1.lastIndexOf(l1));
	
}
}
