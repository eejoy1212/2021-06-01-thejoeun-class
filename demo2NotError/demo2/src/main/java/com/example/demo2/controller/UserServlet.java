package com.example.demo2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserServlet {

    @RequestMapping("/user/user")
    public String call_user(Model model)
    {
        model.addAttribute("username", "가나다");
        return "user/user";
    }

    @RequestMapping("/user/bye")
    public String call_bye(Model model)
    {
        model.addAttribute("username", "가나다");
        return "user/user_bye";
    }
}
