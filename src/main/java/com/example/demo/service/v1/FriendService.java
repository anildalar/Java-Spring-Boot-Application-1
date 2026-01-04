package com.example.demo.service.v1;

import com.example.demo.entity.Friend;
import com.example.demo.repository.FriendRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FriendService {

    private final FriendRepository repository;

    public FriendService(FriendRepository repository) {
        this.repository = repository;
    }

    public List<Friend> getAllFriends() {
        return repository.findAll();
    }
}
