package online.javafun.params;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WelcomeController {

    @GetMapping("/hello")
    @ResponseBody
    String hello() {
        return "Hello Stranger";
    }
}
