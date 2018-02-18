package com.fd.recipeproject.controllers;

import com.fd.recipeproject.services.RecipseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
public class IndexController {

    private final RecipseService recipseService;

    public IndexController(RecipseService recipseService) {
        this.recipseService = recipseService;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model model) {
        log.debug("Getting index page");

        model.addAttribute("recipes",recipseService.getRecipes());

        return "index";
    }

}
