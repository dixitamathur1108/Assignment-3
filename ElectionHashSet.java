package com.Set.practice;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ElectionHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<ElectionParties> party=new HashSet<ElectionParties>();
		party.add(new ElectionParties(1,"Party1","District 1","Constituency 1","30.01.20","10.02.20"));
		party.add(new ElectionParties(2,"Party2","District 2","Constituency 2","27.01.20","10.02.20"));
		party.add(new ElectionParties(3,"Party3","District 3","Constituency 3","29.01.20","10.02.20"));
		party.add(new ElectionParties(4,"Party4","District 4","Constituency 4","30.01.20","10.02.20"));
		party.add(new ElectionParties(5,"Party5","District 5","Constituency 5","30.01.20","10.02.20"));
		party.add(new ElectionParties(6,"Party6","District 6","Constituency 6","28.01.20","10.02.20"));
		party.add(new ElectionParties(1,"Party1","District 1","Constituency 1","30.01.20","10.02.20"));
		
		System.out.println(party);
		
		/*ArrayList<String> arrlist = new ArrayList<String>();
		ArrayList<String> commonDate=new ArrayList<String>();
		System.out.println("These are the parties that have same date");*/
		
		
		/*for(ElectionParties e :party)
			{
				if(arrlist.contains(e.getElectionDate()))
				{
					commonDate.add(e.getElectionDate());
				}
				arrlist.add(e.getElectionDate());	
			}
		
	
	for(ElectionParties e1 :party)
	{
		if(commonDate.contains(e1.getElectionDate()))
		{
			System.out.println(e1);
		}
	}*/

	}
}
