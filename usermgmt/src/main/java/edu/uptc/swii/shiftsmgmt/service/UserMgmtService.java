package edu.uptc.swii.shiftsmgmt.service;

import java.util.List;

import edu.uptc.swii.shiftsmgmt.domain.User;

public interface UserMgmtService {

    public void saveUser(User user);

    public User findByUserId(String userId);

    public void deleteUser(String userId);

    public List<User> listAllUsers();
}