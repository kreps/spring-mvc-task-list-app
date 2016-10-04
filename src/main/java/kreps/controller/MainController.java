package kreps.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("title", "Task manager application");
        model.addAttribute("summary", "Info sisu ja muud asjad");
        model.addAttribute("page","info");
        return "index";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String showLoginPage(Model model){
        model.addAttribute("page","login");
        return "index";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String submitLoginForm(Model model){
        model.addAttribute("page","task/list");
        return "index";
    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String showLogoutPage(Model model){
        model.addAttribute("page","logout");
        return "index";
    }


}