package com.example.springmvc.controller;

import com.example.springmvc.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

    @RequestMapping("/showForm")
    public String showForm(Model theModel){

        //create a student object
        Student theStudent = new Student();

        //add student to the  model attrebute
        theModel.addAttribute("student",theStudent);

        return "student-form";
    }
    @RequestMapping("/processForm")
    public String processForm(@ModelAttribute Student theStudent){
        System.out.println("Student : "+theStudent.getFirstName() + " "+
                theStudent.getLastName());
        return "student-confrimation";
    }


}
