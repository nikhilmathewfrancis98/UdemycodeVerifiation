package com.Ken.KenSchool.controller;

//import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;
import org.thymeleaf.exceptions.TemplateInputException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@Controller
public class HomeController {
    // Going to give multiple paths to the method
    // we can use this <mvc:view-controller path="/" view-name="home"/> in config.xml so that any request for / will be
    // redirected to home
//    @RequestMapping(value={"", "/", "home"}) // now we are going to access the page by this
//    public ModelAndView  displayHome(Model model) throws TemplateInputException {
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("home.html");
//        model.addAttribute("username","Nikhil Mathew Francis");
//        model.addAttribute("age",23);
//
//        return modelAndView;
//    } // Actually sir i did this code (Commmented) one it didn't went well so the below code created
	
    @RequestMapping(value={"", "/", "home"})
    public String displayHomePage(Model model) {
	model.addAttribute("username","Nikhil Mathew Francis");
        return "home.html";
    }
}
