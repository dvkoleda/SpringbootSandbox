package by.iba.docker.test.controller;

/**
 * Created by koleda_d on 05.05.2017.
 */
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GreetingController {
    @RequestMapping(value = "/getString", method = RequestMethod.GET)
    @ResponseBody
    public String greeting() {
        return "Hello world!!!";
    }

}
