package com.example.springexample.Repo;

import com.example.springexample.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface userRepo extends MongoRepository<User,String> {
}
