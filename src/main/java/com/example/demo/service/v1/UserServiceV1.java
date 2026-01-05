package com.example.demo.service.v1;

import com.example.demo.dto.UserCreateDTO;
import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserServiceV1 {
    //1. Property
    private final UserRepository userRepository;

    //2. Constructor
    public UserServiceV1(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    //3. method(SomeType aa)
    public User create(UserCreateDTO dto) {
        //Create a class object
        //User ceo1 = new ClassName()
        User user = new User();
        user.setName(dto.getName());
        user.setEmail(dto.getEmail());
        return userRepository.save(user);
    }
}
