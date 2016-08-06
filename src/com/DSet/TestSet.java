package com.DSet;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestSet {
	
	Set empty = new Set();
	Set one = new Set();
	Set many = new Set();
	
	@Before
	public void setup(){
		one.add("1");
		many.add("1");
		many.add("2");
	}
	
	@Test
	public void IsEmptySet(){
		Set empty = new Set();
		Set one = new Set();
		Set many = new Set();
		
		assertEquals(true, empty.empty());
		assertEquals(true, one.empty());
		assertEquals(true, many.empty());
	}
	
	@Test
	public void AddElementToSet(){
		assertEquals(true, empty.empty());
		assertEquals(false, one.empty());
		assertEquals(false, many.empty());
	}
	
	@Test
	public void TestSize(){
		assertEquals(0, empty.size());
		assertEquals(1, one.size());
		assertEquals(true, 1 < many.size());
	}
	
	@Test
	public void TestContain(){
		assertEquals(false, empty.contain("1"));
		assertEquals(true, one.contain("1"));
		assertEquals(true, many.contain("1"));
		assertEquals(true, many.contain("2"));
	}
	
	@Test
	public void noDublicateItem(){
		one.add("1");
		
		assertEquals(1, one.size());
	}
}
