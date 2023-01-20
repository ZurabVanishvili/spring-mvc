package com.example.springmvc;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HomeController {

    @RequestMapping("/books")
    public String viewBooks() {
        return   ("view-books");
    }
}
