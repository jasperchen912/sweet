package com.mumu.sweet.controller.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jiajunch
 */
@RestController(value = "/webUserController")
@RequestMapping(value = {"/users"})
public class UserController {

    @RequestMapping(value = {"/login"}, method = {RequestMethod.POST})
    public String login(@RequestParam(value = "username") String username, @RequestParam(value = "password") String password) {
        System.out.println("username: " + username + ", password: " + password);
        return "okok";
    }
}
