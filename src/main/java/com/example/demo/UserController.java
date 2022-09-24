package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserRepository userRepository;

    @PostMapping("/user")
    public ResponseEntity<?> postUser(@RequestBody User user){

        User save = userRepository.save(user);
        return ResponseEntity.ok(save);
    }
    @GetMapping("/user")
    public ResponseEntity<?> test(){
        Map<String,String> test = new HashMap<>();
        test.put("문주성","테스트입니다");
        return ResponseEntity.ok(test);
    }
}
