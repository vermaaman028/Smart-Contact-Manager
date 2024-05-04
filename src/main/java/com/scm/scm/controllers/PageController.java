package com.scm.scm.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;





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

    // contact
   @GetMapping("/contact")
   public String contactPage() {
       return new String("contact");
   }
   
   //login
   @GetMapping("/login")
   public String loginPage() {
       return new String("login");
   }    
    
   //register page

    @GetMapping("register")
   public String registerPage() {
       return new String("register");
   }    
}
