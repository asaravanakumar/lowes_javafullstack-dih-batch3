package com.examples.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Ordered list of items. Underlying data structure is Array.
 * Faster for random access. Better for frequent reads.
 */
public class ArrayListEx {
	
	public static void main(String[] args) {
		
		ArrayList skills = new ArrayList();
		skills.add("Java");
		skills.add("Python");
		skills.add(".Net");
		skills.add("Java");
		
		System.out.println(skills);

//		System.out.println(skills.contains("Java"));
//
//		System.out.println(skills.get(1));
//		skills.set(2, "Node JS");
//
//		//skills.add(2, "Node JS");
//
//		System.out.println(skills);
//
//		skills.remove(2);
//
//		System.out.println(skills);
		
//		List synSkills = Collections.synchronizedList(skills);
//
//		System.out.println(synSkills);
//
//		System.out.println(Collections.binarySearch(skills, "Python"));
//
//		Collections.sort(skills);
//
//		System.out.println(skills);

		ArrayList<Number> skills1 = new ArrayList<>();
		skills1.add(10);
		skills1.add(20);



		ArrayList<Number> skills2  = new ArrayList<>();
		skills2.add(100);
		skills2.add(200);

		Collections.copy(skills1, skills2);

//		List<? super String> skill3 = new ArrayList<>();

		System.out.println(skills2);

	}

}
