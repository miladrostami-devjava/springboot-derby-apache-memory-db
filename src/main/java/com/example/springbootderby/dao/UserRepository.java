package com.example.springbootderby.dao;

import com.example.springbootderby.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User,Long> {
    User findUserByName(String name);
}
