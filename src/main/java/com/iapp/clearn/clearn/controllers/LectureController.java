package com.iapp.clearn.clearn.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LectureController {

    @RequestMapping("/lecture1")
    public String goToLecture1(Model model) {
        return "lecture1";
    }

    @RequestMapping("/lecture2")
    public String goToLecture2(Model model) {
        return "lecture2";
    }

    @RequestMapping("/lecture3")
    public String goToLecture3(Model model) {
        return "lecture3";
    }

    @RequestMapping("/lecture4")
    public String goToLecture4(Model model) {
        return "lecture4";
    }

    @RequestMapping("/lecture5")
    public String goToLecture5(Model model) {
        return "lecture5";
    }

    @RequestMapping("/lecture6")
    public String goToLecture6(Model model) {
        return "lecture6";
    }
}


