package com.att.business;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.att.data.api.ToDoService;
import com.att.data.api.ToDoServiceStub;

public class ToDoServiceBusinessImplStubTest {

	@Test
	public void retrieveToDosRelatedToUser_UsingStub() {
		ToDoService todoservicestub = new ToDoServiceStub();
		ToDoServiceBusinessImpl todobusinessimpl = new ToDoServiceBusinessImpl(todoservicestub);
		List<String> filteredToDos = todobusinessimpl.retrieveToDosRelatedToUser("Sitha");
		assertEquals(3, filteredToDos.size());
			}

}
	