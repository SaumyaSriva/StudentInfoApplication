package com.ata.entity;

public class Grade {
	
	private int serialnumber;
	private int rollNo;
	private String performance;
	private String section;

	
	public Grade() {
	}

	public Grade(int serialnumber, int rollNo, String performance, String section) {
		this.serialnumber = serialnumber;
		this.rollNo = rollNo;
		this.performance = performance;
		this.section = section;
	}

	public int getSerialnumber() {
		return serialnumber;
	}

	public void setSerialnumber(int serialnumber) {
		this.serialnumber = serialnumber;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getPerformance() {
		return performance;
	}

	public void setPerformance(String performance) {
		this.performance = performance;
	}

	@Override
	public String toString() {
		return "Grade{" + "serialnumber=" + serialnumber + ", rollNo=" + rollNo + ", performance='" + performance + '\''
				+ ", section='" + section + '\'' + '}';
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

}
