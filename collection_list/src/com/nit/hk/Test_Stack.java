package com.nit.hk;

import java.util.Stack;

public class Test_Stack {
public static void main(String[] args) {
	Stack<Object> stack = new Stack<Object>();
	stack.push("a");
	stack.push("b");
	stack.push("c");
	stack.push("d");
	stack.push("e");
	stack.push("f");
	stack.push("g");
	System.out.println(stack);
	System.out.println(stack.empty());
	System.out.println(stack.contains("a"));
	System.out.println(stack.pop());//last one :: g
	System.out.println(stack.peek());//last butone::f
}
}
