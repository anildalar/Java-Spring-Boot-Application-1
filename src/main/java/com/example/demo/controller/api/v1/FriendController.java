package com.example.demo.controller.api.v1;

import com.example.demo.entity.Friend;
import com.example.demo.service.v1.FriendService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FriendController {

    private final FriendService friendService;
    public FriendController(FriendService friendService) {
        this.friendService = friendService;
    }

    @GetMapping("/friends")
    public List<Friend> getFriends() {
        return friendService.getAllFriends();
    }
}
