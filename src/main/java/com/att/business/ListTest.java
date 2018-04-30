package com.att.business;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Test;

// Just trying to do something with the dammmmm list
public class ListTest {

	@Test
	public void letsmocklistsizemethod() {
		List  listmock = mock(List.class);
		when(listmock.size()).thenReturn(2);
		assertEquals(2,listmock.size());
}
	

	@Test
	public void letsmocklistsizemethodwithvariousreturn() {
		List  listmock = mock(List.class);
		when(listmock.size()).thenReturn(3).thenReturn(2);
		assertEquals(3,listmock.size());
		assertEquals(2,listmock.size());
}
	@Test(expected=RuntimeException.class)
	public void listsmockget() {
		List  listmock = mock(List.class);
		//when(listmock.get(anyInt())).thenReturn("Mockito");
		when(listmock.get(anyInt())).thenThrow(new RuntimeException("Something"));
	//	assertEquals("Mockito",listmock.get(0));
	// assertEquals("Mockito",listmock.get(1));
		listmock.get(0);
}
	
}
