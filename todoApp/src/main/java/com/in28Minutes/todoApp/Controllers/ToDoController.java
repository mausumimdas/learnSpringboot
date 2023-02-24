package com.in28Minutes.todoApp.Controllers;

import com.in28Minutes.todoApp.Services.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@SessionAttributes("name")
@Controller
public class ToDoController {
    @Autowired
    private ToDoService toDoServ;
    @RequestMapping("showAllTodos")
    public String showToDos(ModelMap model){
        model.put("toDoDataByUserName", toDoServ.returnToDoByUserName());
        return "toDoPage";
    }
}
