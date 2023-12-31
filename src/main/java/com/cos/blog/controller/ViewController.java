package com.cos.blog.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

    @GetMapping("/showResult")
    public String showResult(Model model) {
        AIController aiController = new AIController();
        String result = aiController.getGPT3Response();
        model.addAttribute("result", result);
        return "result";
    }
    
    @GetMapping("/showTour")
    public String showTour() {
        return "/tour/tour";
    }
    
}