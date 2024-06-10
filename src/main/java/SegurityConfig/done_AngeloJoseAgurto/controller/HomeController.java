package SegurityConfig.done_AngeloJoseAgurto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        return "menu"; // Nombre del archivo HTML de la página principal
    }
}
