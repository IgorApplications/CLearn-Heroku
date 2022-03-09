package com.iapp.clearn.clearn.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CourseController {

    @RequestMapping("/course")
    public String course(Model model) {
        return "course";
    }
}
