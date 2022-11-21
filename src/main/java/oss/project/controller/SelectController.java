package oss.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SelectController {

    @GetMapping("/tbti-select")
    public String tbti() {
        return "select/Tbti-checkBox";
    }

    @GetMapping("/mbti-select")
    public String mbti() {
        return "select/Mbti-checkBox";
    }

    @GetMapping("/tbti-select/result")
    public String check() {

        return "select/recommend/Tbti-recommend";
    }

    @GetMapping("/mbti-select/result")
    public String create(MBTIForm form) {

        return "select/recommend/Mbti-recommend";
    }

    @PostMapping("/tbti-select/result")
    public String end() {
        return "redirect:/";
    }

    @PostMapping("/mbti-select/result")
    public String create() {
        return "redirect:/";
    }
}
