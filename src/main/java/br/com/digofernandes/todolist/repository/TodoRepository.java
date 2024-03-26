package br.com.digofernandes.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.digofernandes.todolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {
    
}
