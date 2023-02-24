package com.in28Minutes.todoApp.Services;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    public boolean authenticate(String name, String Password){
        return name.equalsIgnoreCase("Mausumi") && Password.equals("abcd");
    }
}
