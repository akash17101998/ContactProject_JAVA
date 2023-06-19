package com.example.SmartContact.SmartContact.dao;

import com.example.SmartContact.SmartContact.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {

}
