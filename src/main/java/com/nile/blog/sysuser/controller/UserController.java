package com.nile.blog.sysuser.controller;

import com.nile.blog.sysuser.dao.UserDo;
import com.nile.blog.sysuser.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/sys")
public class UserController {

    @Autowired
    private UserDo userDo;

    public String login() {
        return "";
    }

    @GetMapping("/sign_up")
    public String signUp() {
        return "/sysuser/index";
    }
    @GetMapping("/sign_in")
    public String signIn() {
        return "/sysuser/login";
    }

    @PostMapping("/reg")
    public String register(@RequestParam("username") String username,
           @RequestParam("password") String password) {
        User user = new User();
        user.setPassword(password);
        user.setUsername(username);
        userDo.save(user);
        return "";
    }
}
