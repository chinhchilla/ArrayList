package datastructures;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListEx {
	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add(1);
		al.add("hi");
		al.add(3.14);
		al.add("hi");
		System.out.println(al);
		System.out.println("Size: " + al.size());
		System.out.println("Contains 1? " + al.contains(1));
		System.out.println("Contains 2? " + al.contains("hi"));
		System.out.println("First element: " + al.get(0));
		System.out.println("First occurence of hi: " + al.indexOf("hi"));
		System.out.println("Last occurence of hi: " + al.lastIndexOf("hi"));
		al.remove(1);
		System.out.println(al);
		
		al.clear();
		System.out.println(al);


	}
}
