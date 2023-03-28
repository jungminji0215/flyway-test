package com.example.flyway;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping("/test")
    public void test(){
        User user = new User();
        user.setName("유저3");


        userRepository.save(user);
    }
}
