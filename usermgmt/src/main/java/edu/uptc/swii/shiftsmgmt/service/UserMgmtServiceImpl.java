package edu.uptc.swii.shiftsmgmt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.uptc.swii.shiftsmgmt.domain.User;
import edu.uptc.swii.shiftsmgmt.repo.mongodb.UserRepository;

@Service
public class UserMgmtServiceImpl implements UserMgmtService{
    @Autowired
    UserRepository userRepo;

    @Override
    public void saveUser(User user) {
        userRepo.save(user);
    }

    @Override
    public User findByUserId(String userId) {
        return userRepo.findByUserId(userId);
    }

    @Override
    public void deleteUser(String userId) {
        User user = userRepo.findByUserId(userId);
        userRepo.delete(user);
    }

    @Override
    public List<User> listAllUsers() {
        return userRepo.findAll();
    }
}