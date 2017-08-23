package com.ofs.java.kannan;

import com.ofs.java.binu.day2.inheritance.MathDemo;
import com.ofs.java.binu.day2.inheritance.MathDemo1;
import com.ofs.java.binu.day2.inheritance.MathDemo2;

/**
 * 
 * Day 2 task main class;
 * 
 * @author binurajk
 *
 */
public class Day2Demo {

	public static void main(String args[]) {

		MethodDemo methodDemo = new MethodDemo();
		// call method one;
		methodDemo.add(5, 6);
		// call method two and print the return value;
		System.out.println(methodDemo.addReturns(10, 20));

		MethodOverLoadDemo methodOverLoadDemo = new MethodOverLoadDemo();
		// call lhs and rhs and compare the value;
		

		MathDemo mathDemo = new MathDemo();
		// call methods and print the result;
		MathDemo1 mathDemo1 = new MathDemo1();
		// call methods and print the result;
		MathDemo2 mathDemo2 = new MathDemo2();

	}
}
