package kreps.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

    @RequestMapping(value = "/info", method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("title", "Task manager application");
        model.addAttribute("summary", "Info sisu ja muud asjad");
        return "info";
    }

}