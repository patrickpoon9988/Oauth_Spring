package com.example.oauthserver.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.oauthserver.model.User;

public interface UserRepository extends MongoRepository<User, String>{
    
}
