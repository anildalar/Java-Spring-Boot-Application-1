package com.example.demo.controller.web;

import com.example.demo.dto.UserCreateDTO;
import com.example.demo.service.v1.UserServiceV1;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserWebController {

    private final UserServiceV1 userServiceV1;

    UserWebController(UserServiceV1 userServiceV1) {
        this.userServiceV1 = userServiceV1;
    }

    // Show form
    @GetMapping("/users/create")
    public String showCreateForm(Model model) {
        model.addAttribute("user", new UserCreateDTO());
        return "users/create";
    }

    // Handle form submit
    @PostMapping("/users/create")
    public String handleCreate(
            @ModelAttribute("user") UserCreateDTO user,
            BindingResult result,
            Model model
    ) {
        if (result.hasErrors()) {
            return "users/create";
        }
        userServiceV1.create(user);
        model.addAttribute("user", user);
        return "users/success";
    }
}
