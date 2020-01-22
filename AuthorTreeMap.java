package com.Map.practice;

import java.util.Set;
import java.util.TreeMap;

public class AuthorTreeMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String,Author> author=new TreeMap<String,Author>();
		author.put("Book1", new Author(101,"Author 1","Address 1"));
		author.put("Book2", new Author(102,"Author 2","Address 2"));
		author.put("Book3", new Author(103,"Author 3","Address 3"));

		
		System.out.println(author);
		System.out.println();
		
		Set<String> keys=author.keySet();
		//Author a=author.get(keys);
		//String name1=a.getName();
		//System.out.println(name1);
		for(String i:keys)
		{
			Author a1=author.get(i);
			System.out.println(i+" written by "+a1.getName()+" residing at "+a1.getAddress());
		}
		
		
		
		

	}

}
