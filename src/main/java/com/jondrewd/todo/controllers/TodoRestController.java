package com.jondrewd.todo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jondrewd.todo.entities.Todo;
import com.jondrewd.todo.services.TodoServices;

@RestController("/todos")
public class TodoRestController {
    @Autowired
    private TodoServices service;
    
    @PostMapping
    List<Todo> createTodo(@RequestBody Todo todo){
        return service.createTodo(todo);
    }
    @PutMapping
    List<Todo> updateTodo(@RequestBody Todo todo){
        return service.updateTodo(todo);
    }
    @DeleteMapping("{id}")
    List<Todo> deleteTodo(@PathVariable Long id){
       return service.deleteTodo(id);
    }
    @GetMapping
    List<Todo> listTodo(Todo todo){
        return service.updateTodo(todo);
    }
}
