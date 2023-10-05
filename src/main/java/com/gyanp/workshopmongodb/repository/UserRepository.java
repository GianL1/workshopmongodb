package com.gyanp.workshopmongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.gyanp.workshopmongodb.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
