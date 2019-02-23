package com.anp.mongo.mongosample.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.anp.mongo.mongosample.model.User;

@Repository
public interface UserRepository  extends MongoRepository<User, String>  {

}
