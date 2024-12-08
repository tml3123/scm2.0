package com.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PageController {

    @RequestMapping("/home")
    public String home(Model model) {
        System.out.println("Home page handler");
        model.addAttribute("name", "Substring Technologies");
        model.addAttribute("Youtube", "learn with taran");
        model.addAttribute("GithubRepo", "https://github.com/tml3123");

        return "home";
    }

    // about
    @RequestMapping("/about")
    public String aboutPage(Model model) {
        model.addAttribute("islogin", false);
        System.out.println("About page loading");
        return "about";
    }

    @RequestMapping("/services")
    public String servicesPage() {
        System.out.println("Services loading");
        return "services";
    }
}
