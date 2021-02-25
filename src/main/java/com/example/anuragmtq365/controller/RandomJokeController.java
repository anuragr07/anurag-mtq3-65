package com.example.anuragmtq365.controller;

import com.example.anuragmtq365.service.RandomJokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RandomJokeController {

    private RandomJokeService randomJokeService;

    @Autowired
    public RandomJokeController(RandomJokeService randomJokeService) {
        this.randomJokeService = randomJokeService;
    }

    @RequestMapping("/")
//    @ResponseBody
    public String myController(Model model){

        model.addAttribute("joke", randomJokeService.getRandomQuote());
        return "index";
    }

}
