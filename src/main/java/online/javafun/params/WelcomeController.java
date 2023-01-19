package online.javafun.params;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WelcomeController {

    @RequestMapping(path = "/hello", method = RequestMethod.GET)
    @ResponseBody
    String hello() {
        return "Hello Stranger";
    }
}