package me.lim.controller;

import me.lim.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by lim on 2015/8/28.
 */

@Controller
public class UserController {


    @RequestMapping("/example")
    public String example(ModelMap modelMap,HttpServletRequest request){

        User usr = new User();
        usr.setNickname("limeng");

        modelMap.put("usr",usr);

        return "example";
    }
}
