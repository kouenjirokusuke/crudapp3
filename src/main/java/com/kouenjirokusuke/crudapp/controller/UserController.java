package com.kouenjirokusuke.crudapp.controller;

import com.kouenjirokusuke.crudapp.dao.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @Autowired
    private UserDAO userDAO;

    @RequestMapping("/")
    public String showAllUsers(Model model) {
        System.out.println("CONTROLLER IS WORK");
        model.addAttribute("users", userDAO.getAllUsers());

        return "users";
    }

}
