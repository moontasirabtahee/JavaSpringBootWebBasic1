package com.abtahee.springbootwebbasic1;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class homeController {


    @RequestMapping("/")
    public String home() {
        System.out.println("home method called");
        return "index";
    }

//    @RequestMapping("/add")
//    public String add(HttpServletRequest req , HttpSession session) {
//        int num1 = Integer.parseInt(req.getParameter("num1"));
//        int num2 = Integer.parseInt(req.getParameter("num2"));
//
//        int result = num1 + num2;
//
//        session.setAttribute("result", result);
//        return "result.jsp";
//    }

//    @RequestMapping("add")
//    public String add(@RequestParam("num1") int num1, @RequestParam("num2") int num2 , Model model) {
//
//        int result = num1+num2;
//        model.addAttribute("result", result);
//
//        return "result.jsp";
//    }

    @RequestMapping("add")
    public ModelAndView add(int num1 , int num2 , ModelAndView model) {

        int result = num1 + num2;
        model.addObject("result", result);
        model.setViewName("result");

        return model;
    }


    @ModelAttribute("course")
    public String course() {
        return "Java";
    }

    @RequestMapping("/addAlien")
    public ModelAndView addAlien(@ModelAttribute Alien alien) {
        ModelAndView model = new ModelAndView();
        model.addObject("alien", alien);
        model.setViewName("result");
        return model;
    }

}
