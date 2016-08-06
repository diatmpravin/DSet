package com.MSet;

import java.util.HashMap;

public class ASet {
	
	HashMap<String, Boolean> m = new HashMap<String, Boolean>();
	
	// Return size of Set
	public Integer Size(){
		return m.size();
	}

	// Add new item to Set
	public void Add(String str) {
		m.put(str, true);
	}

	// Return requested element is present
	public String Contain(String str) {
		Boolean v = m.get(str);
		if (v != null){
			return str;
		} else {
			return "";
		}
		
	}

	// Remove element from set
	public void Remove(String str) {
		m.remove(str);
	}

	// Clear set
	public void Clear() {
		m.clear();
	}
}
