package com.Set.practice;

public class ElectionParties {

	public ElectionParties(int electionID, String name, String district, String constituency, String electionDate,
			String countingDate) {
		super();
		this.electionID = electionID;
		this.name = name;
		this.district = district;
		this.constituency = constituency;
		this.electionDate = electionDate;
		this.countingDate = countingDate;
	}
	private int electionID;
	private String name,district,constituency,electionDate,countingDate;
	public int getElectionID() {
		return electionID;
	}
	public void setElectionID(int electionID) {
		this.electionID = electionID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getConstituency() {
		return constituency;
	}
	public void setConstituency(String constituency) {
		this.constituency = constituency;
	}
	public String getElectionDate() {
		return electionDate;
	}
	public void setElectionDate(String electionDate) {
		this.electionDate = electionDate;
	}
	public String getCountingDate() {
		return countingDate;
	}
	public void setCountingDate(String countingDate) {
		this.countingDate = countingDate;
	}
	@Override
	public String toString() {
		return "\n ElectionParties [electionID=" + electionID + ", name=" + name + ", district=" + district
				+ ", constituency=" + constituency + ", electionDate=" + electionDate + ", countingDate=" + countingDate
				+ "]";
	}
	
	public int hashCode()
	{
		int code=0;
		code=electionID*20;
		code+=name.hashCode();
		return name.hashCode();
	}
	
	public boolean equals(Object o)
	{
		boolean flag=false;
		if(o instanceof ElectionParties)
		{
			ElectionParties p=(ElectionParties)o;
			if(p.name.equals(this.name))
				flag=true;
		}
		return flag;
	}
}
