package com.att.data.api;

import java.util.Arrays;
import java.util.List;

public class ToDoServiceStub implements ToDoService{

	public List<String> retrieveToDos(String user) {
		// TODO Auto-generated method stub
		
		return Arrays.asList("DO Spring Interview","DO Spring Interview","Discuss and Decide on Spring Interview","Pay for Guitar Class");
	}

}
