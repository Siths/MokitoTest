package com.att.business;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.att.data.api.ToDoService;

	public class ToDoServiceBusinessImplInjectMockitoTest {	

	@Test
	public void retrieveToDosRelatedToUser_UsingMock()  {
		
		
		ToDoService todoservicemock = mock(ToDoService.class);
		
		List<String> todos = Arrays.asList("DO Spring Interview","DO Spring Interview","Discuss and Decide on Spring Interview","Pay for Guitar Class");
		
	    when(todoservicemock.retrieveToDos("Sitha")).thenReturn(todos);
		
		//stub(todoservicemock.retrieveToDos("Parameter")),return("Value");
		
				
		ToDoServiceBusinessImpl todobusinessimpl = new ToDoServiceBusinessImpl(todoservicemock);
		List<String> filteredToDos = todobusinessimpl.retrieveToDosRelatedToUser("Sitha");
		assertEquals(3, filteredToDos.size());
			}

}
