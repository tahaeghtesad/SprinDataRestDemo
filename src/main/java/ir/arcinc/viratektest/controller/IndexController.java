package ir.arcinc.viratektest.controller;

import ir.arcinc.viratektest.model.User;
import ir.arcinc.viratektest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class IndexController {

    private UserService userService;

    @Autowired
    public IndexController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "/allUsers")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }
}
