package com.DSet;

public class Set {
	
	String items[] = new String[10];
	Boolean empty = true;
	Integer size = 0;

	public Boolean empty() {
		return size == 0;
	}

	public void add(String value) {
		if (contain(value)){return;}
		items[size++] = value;
	}

	public int size() {
		return size;
	}

	public Boolean contain(String value) {
		for( int i = 0; i < size; i++)
		{
		    if(items[i].equals(value)){
		    	return true;
		    }
		}
		return false;
	}

}
