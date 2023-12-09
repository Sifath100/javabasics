/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
		Integer a = 5;
		Integer b = 5;
		System.out.println(a == b); // because of interning concept, a and b point to same memory
		
		a = 400; // out of limit, a and b point to their own objects, so the references are pointing to different memory 
		b = 400;
		System.out.println(a == b);
		
		// for always true equality check, on object always use .equals() and use == only for primitives. This is a best practice to avoid such bugs
		System.out.println(a.equals(b));
		
		Integer c = 100;
		print(c);
		Integer d = null;
		print(d);
	}
	
	private static void print(int num) { // c.intValue() gets called and int variable is passed. It is called behind the scenes. 
	    System.out.println(num);
	}
}
