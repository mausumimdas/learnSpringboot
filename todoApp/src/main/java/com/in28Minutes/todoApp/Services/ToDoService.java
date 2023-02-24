package com.in28Minutes.todoApp.Services;

import com.in28Minutes.todoApp.ToDo;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class ToDoService {
    static List<ToDo> allToDos = new ArrayList<>();

    static{
        allToDos.add(new ToDo(1,"Mausumi", "Learn Microservices",
                LocalDate.now().plusDays(15), false));
        allToDos.add(new ToDo(2,"Mausumi", "Learn Angular",
                LocalDate.now().plusDays(20), false));
        allToDos.add(new ToDo(3,"Mausumi", "Learn Java exceptions",
                LocalDate.now().plusDays(25), false));
    }

    public List<ToDo> returnToDoByUserName(){
        return allToDos;
    }
}
