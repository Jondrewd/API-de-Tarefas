package com.jondrewd.todo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.jondrewd.todo.entities.Todo;
import com.jondrewd.todo.repository.TodoRepository;

@Service
public class TodoServices {
    
    @Autowired
    private TodoRepository repository;
    
    public List<Todo> createTodo(Todo todo){
        repository.save(todo);
        return listTodo();
    }
    public List<Todo> updateTodo(Todo todo){
        repository.save(todo);
        return listTodo();
    }
    public List<Todo> listTodo(){
       Sort ordem = Sort.by("priority").descending().and(Sort.by("name").ascending());
        return repository.findAll(ordem);
    }
    public List<Todo> deleteTodo(Long id){
        repository.deleteById(id);
        return listTodo();
    }

}
