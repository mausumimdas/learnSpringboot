package com.in28Minutes.todoApp.Controllers;

import com.in28Minutes.todoApp.Services.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
@SessionAttributes("name")
public class LoginController {

    @Autowired
    private AuthenticationService auth;

    @RequestMapping(value="/login", method = RequestMethod.GET)
    public String login(){
        return "login";
    }

    @RequestMapping(value="/login", method=RequestMethod.POST)
    public String goToWelcomePage(@RequestParam String name, @RequestParam String password, ModelMap model){
        if(auth.authenticate(name,password)) {
            model.put("name", name);
            return "welcome";
        } else {
            return "login";
        }
    }
}
