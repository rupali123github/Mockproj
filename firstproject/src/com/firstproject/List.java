package com.firstproject;

import java.util.ArrayList;
import java.util.Iterator;

public class List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("Rupali");
		list.add("Karule");
		
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		

	}

}
