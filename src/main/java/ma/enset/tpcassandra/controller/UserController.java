package ma.enset.tpcassandra.controller;

import ma.enset.tpcassandra.entities.User;
import ma.enset.tpcassandra.services.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/users")
public class UserController {
    private UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }
    @PostMapping
    public String saveUser(@RequestParam String fname, @RequestParam String lname, @RequestParam int age){

        userService.createUser(fname, lname, age);
        return "User created successfully";

    }
    @GetMapping(path="/{id}")
    public User getUserById(@PathVariable UUID id){
        return userService.getUserById(id);
    }

}
