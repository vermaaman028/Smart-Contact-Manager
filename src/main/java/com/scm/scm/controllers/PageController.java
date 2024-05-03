package com.scm.scm.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class PageController {

    @RequestMapping("/home")
    
    public String home(Model model){
        System.out.println("home page handler");   // sending data to view (Dynamic data send )
        model.addAttribute("name", "Aman verma");
        return "home";
    }

    //about
    @RequestMapping("/about")
    public String aboutPage(){
        System.out.println("about page loading...");
        return "about";
    }


    // Services
    @RequestMapping("/services")
    public String servicePage(){
        System.out.println("service page loading...");
        return "services";
    }
}
