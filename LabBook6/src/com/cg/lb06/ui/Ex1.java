package com.cg.lb06.ui;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Ex1 {
	 public static List<String> getValues(HashMap<String, String> ee) {
		 List<String> mm=new ArrayList<>();
		 Collection<String> list=ee.values();
		 mm.addAll(list);
		 Collections.sort(mm);
		 return mm;
 }

	 public static void main(String[] args) {
		 HashMap<String, String> ee = new HashMap<>();
		 ee.put("siri", "21");
		 ee.put("chinni", "20");
		 ee.put("vicky", "6");
		 ee.put("lucky", "11");
		 System.out.println(getValues(ee));
	 }
 }

