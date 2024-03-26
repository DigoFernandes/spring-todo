package br.com.digofernandes.todolist.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.digofernandes.todolist.entity.Todo;
import br.com.digofernandes.todolist.repository.TodoRepository;

@Service
public class TodoService {
    private TodoRepository todoRepository;
    
    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<Todo> create() {

    }

    public List<Todo> list() {

    }

    public List<Todo> update() {

    }

    public List<Todo> delete() {

    }

   
}
