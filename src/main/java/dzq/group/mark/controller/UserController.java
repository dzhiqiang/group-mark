package dzq.group.mark.controller;

import dzq.group.mark.domain.RegisterUser;
import dzq.group.mark.vaild.RegisterUserValid;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private RegisterUserValid registerUserValid;

    public static final Logger logger = Logger.getLogger(UserController.class);

    @RequestMapping(value = "/login", produces = "text/html;charset=UTF-8", method = RequestMethod.POST)
    @ResponseBody
    public String login(@RequestParam String mobilePhone
            , @RequestParam String password) {
        logger.info("mobilePhone:" + mobilePhone + "login");

        System.out.println("121");
        return "{name:123}";
    }

    @RequestMapping(value = "/register", produces = "text/html;charset=UTF-8", method = RequestMethod.POST)
    @ResponseBody
    public String register(RegisterUser registerUser) {

        registerUserValid.vaild(registerUser);

        return "";
    }

    @RequestMapping(value = "/register", produces = "text/html;charset=UTF-8", method = RequestMethod.POST)
    @ResponseBody
    public String searchUser(@RequestParam String mobilePhone) {
        return "";
    }


}
