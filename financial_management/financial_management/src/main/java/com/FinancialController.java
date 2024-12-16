package com;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class FinancialController {
    @Autowired
    private FinancialService financialService;
    @GetMapping("/")
    public String homePage(Model model) {
        List<User> users = financialService.getAllUsers();
        model.addAttribute("users", users);
        return "index";  // Return the Thymeleaf template "index.html"
    }
    @PostMapping("/addUser")
    public String addUser(@RequestParam String date,@RequestParam String name,@RequestParam double balance) {
        //TODO: process POST request
        financialService.addUser(date, name, balance);
        return "redirect:/";
    }

    @PostMapping("/deleteUser")
    public String deleteUser(@RequestParam String userDate) {
        //TODO: process POST request
        financialService.deleteUser(userDate);
        return "redirect:/";
    }
    
    
}
