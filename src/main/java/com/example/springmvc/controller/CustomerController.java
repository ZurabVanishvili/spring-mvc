package com.example.springmvc.controller;

import com.example.springmvc.model.Customer;
import jakarta.validation.Valid;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    //add an initBinder to convert trim input strings and resolve issue for validation
    @InitBinder
    public void initBinder(WebDataBinder dataBinder) {

        StringTrimmerEditor editor = new StringTrimmerEditor(true);

        dataBinder.registerCustomEditor(String.class, editor);
    }

    @RequestMapping("/showForm")
    public String showForm(Model theModel) {

        theModel.addAttribute("customer", new Customer());

        return "customer-form";

    }

    @RequestMapping("/processForm")
    public String processForm(@Valid @ModelAttribute("customer")
                              Customer theCustomer, BindingResult bindingResult) {

//        System.out.println(bindingResult + "\n");
        if (bindingResult.hasErrors()) {
            return "customer-form";
        }
        return "customer-confrimation";
    }


}
