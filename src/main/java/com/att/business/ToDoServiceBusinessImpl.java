package com.att.business;

import java.util.ArrayList;
import java.util.List;

import com.att.data.api.ToDoService;

public class ToDoServiceBusinessImpl {
	
	private ToDoService todoservice;

	public ToDoServiceBusinessImpl(ToDoService todoservice) {
		super();
		this.todoservice = todoservice;
	}

	
	public List<String> retrieveToDosRelatedToUser(String user){
		
		List<String> filteredToDos = new ArrayList<String>() ;
	    List<String> todos=todoservice.retrieveToDos(user);	
	    for(String todo:todos)
	    {
	    	if (todo.contains("Spring")){
	    		filteredToDos.add(todo);
	    	}
	    }
		return filteredToDos;
		
	   }
	}
