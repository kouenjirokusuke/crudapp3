package com.kouenjirokusuke.crudapp.controller;

import com.kouenjirokusuke.crudapp.entity.User;
import com.kouenjirokusuke.crudapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public String showAllUsers(Model model) {
        model.addAttribute("users", userService.getAllUsers());

        return "users";
    }

    @RequestMapping("/add")
    public String addNewUser(Model model) {
        model.addAttribute("user", new User());

        return "user-info";
    }

    @RequestMapping("/save")
    public String saveUser(@ModelAttribute("user") User user) {
        userService.saveUser(user);

        return "redirect:/";
    }

    @RequestMapping("/updateInfo")
    public String updateUser (@RequestParam("userId") long id, Model model) {
        model.addAttribute("user", userService.getUser(id));

        return "user-info";
    }
    @RequestMapping("/deleteUser")
    public String deleteUser (@RequestParam("userId") long id) {
        userService.deleteUser(id);

        return "redirect:/";
    }

}
