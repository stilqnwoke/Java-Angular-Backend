package com.stk.rest.webservices.restfulwebservices.todo;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class TodoHardcodedService {

    private static List<Todo> todos = new ArrayList();
    private static long idCounter = 0;

    static {
        todos.add(new Todo(++idCounter, "stkwe",
                "Learn to dance",
                new Date(), false));
        todos.add(new Todo(++idCounter, "stkwe",
                "Learn about IT",
                new Date(), false));
        todos.add(new Todo(++idCounter, "stkwe",
                "Learn about JAVA",
                new Date(), false));
    }

    public List<Todo> findAll() {
        return todos;
    }

    public Todo save(Todo todo) {
        if(todo.getId() == -1) {
            todo.setId(++idCounter);
            todos.add(todo);
        } else {
            deleteByID(todo.getId());
            todos.add(todo);
        }

        return todo;
    }

    public Todo deleteByID(long id) {
        Todo todo = findById(id);

        if(todo == null) return null;

        if(todos.remove(todo));{
            return todo;
        }
    }

    public Todo findById(long id) {
        for(Todo todo: todos) {
            if(todo.getId() == id) {
                return todo;
            }
        }

        return null;
    }
}
