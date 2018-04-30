package com.att.business;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.att.data.api.ToDoService;
	
    @RunWith(MockitoJUnitRunner.class)
	public class ToDoServiceBusinessImplMockTest {	

	@Mock	
	ToDoService todoservicemock;
	
	@InjectMocks
	ToDoServiceBusinessImpl todobusinessimpl;
	
	@Captor
	ArgumentCaptor<String> stringArgumentCaptor;
			
	@Test
	public void retrieveToDosRelatedToUser_UsingMock()  {
		
		
		List<String> todos = Arrays.asList("DO Spring Interview","DO Spring Interview","Discuss and Decide on Spring Interview","Pay for Guitar Class");
		
	    when(todoservicemock.retrieveToDos("Sitha")).thenReturn(todos);
		
		//stub(todoservicemock.retrieveToDos("Parameter")),return("Value");
		
		//InjectMocks has reduced this by looking @ the member of Class 		
		//ToDoServiceBusinessImpl todobusinessimpl = new ToDoServiceBusinessImpl(todoservicemock);
		List<String> filteredToDos = todobusinessimpl.retrieveToDosRelatedToUser("Sitha");
		assertEquals(stringArgumentCaptor, filteredToDos.size());
			}

}
