package edu.uptc.swii.shiftsmgmt.repo.mongodb;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import edu.uptc.swii.shiftsmgmt.domain.User;

public interface UserRepository extends MongoRepository<User, String> {
    @Query("{'userId': 0}")
    public User findByUserId(String userId);
}