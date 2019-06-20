package com.shubham.oauth.data.repos;

import org.springframework.data.repository.CrudRepository;

import com.shubham.oauth.data.entities.User;
import java.lang.String;

public interface UserRepository extends CrudRepository<User, Integer> {

	User findByName(String name);

}
