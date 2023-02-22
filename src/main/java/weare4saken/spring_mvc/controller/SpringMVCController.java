package weare4saken.spring_mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/weare4saken")
public class SpringMVCController {

    @RequestMapping("/enterInfo")
    public String enterInfo() {
        return "enterInfo";
    }

    @RequestMapping("/showInfo")
    public String showInfo(@RequestParam("country") String country,
                           @RequestParam("capital") String capital,
                           Model model) {
        model.addAttribute("newCountry", country);
        model.addAttribute("newCapital", capital);
        return "showInfo";
    }

}
