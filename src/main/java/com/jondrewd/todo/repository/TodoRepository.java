package com.jondrewd.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jondrewd.todo.entities.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long>{
    
}
