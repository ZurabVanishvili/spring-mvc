package com.example.springmvc.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HelloWorldController {

    //controller method to show initial HTML form
    @RequestMapping("/showForm")
    public String showForm(){
        return "helloworld-form";
    }

    //controller method to process the HTML form
    @RequestMapping("/processForm")
    public String processForm(){
        return "helloworld";
    }



    @RequestMapping("/processFormVersionTwo")
    public String processFormVersionTwo(HttpServletRequest request, Model model){


        //read the request parameter from the HTML form
        String name = request.getParameter("studentName");

        //convert the data to all uppercase
        name = name.toUpperCase();

        //create the message
        String result = "Hey " + name;

        //add message to the model
        model.addAttribute("message",result);

        return "helloworld";
    }

    @RequestMapping("/processFormVersionThree")
    public String processFormVersionThree(@RequestParam("studentName") String name, Model model){


        //convert the data to all uppercase
        name = name.toUpperCase();

        //create the message
        String result = "Hey My Friend " + name;

        //add message to the model
        model.addAttribute("message",result);

        return "helloworld";
    }

}
