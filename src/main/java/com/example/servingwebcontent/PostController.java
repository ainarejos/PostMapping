package com.example.servingwebcontent;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PostController {
    String name;
    String password;

    public PostController() {
    }

    @GetMapping("/login")
    public String login(String name, String password) {

        return "login";
    }

    @PostMapping("/login")
        public String postLogin(String name, String password, Model model){
        model.addAttribute("name", name);
        model.addAttribute("password", password);
            return "Sout";
        }



    }
