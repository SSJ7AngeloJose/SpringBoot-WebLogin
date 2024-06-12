package SegurityConfig.done_AngeloJoseAgurto.service;


import SegurityConfig.done_AngeloJoseAgurto.model.User;
import SegurityConfig.done_AngeloJoseAgurto.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;


    public void save(User user) {
        user.setEnabled(true);
        userRepository.save(user);

    }

    public void changePassword(String username, String newPassword) {
        User user = userRepository.findByUsername(username);
        if (user != null) {
            user.setPassword(newPassword);
            userRepository.save(user);
        }
    }

}