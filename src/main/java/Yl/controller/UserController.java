package Yl.controller;

import Yl.entity.request.AddUserRequest;
import Yl.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import Yl.entity.Messages;

import java.util.List;

/**
 * Created by Ying on 5/23/16.
 */
@RestController
public class UserController {

    private UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    @RequestMapping(method = RequestMethod.GET)
    public List<Messages> findAllUsers() {
        return userRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void addUser (@RequestBody AddUserRequest addUserRequest) {
        Messages user = new Messages();
        user.setName(addUserRequest.getMissionId());
        user.setSurname(addUserRequest.getSeed());
        userRepository.save(user);
    }



}
