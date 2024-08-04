package com.akkitech.SCM_SpringBoot.dao;

import com.akkitech.SCM_SpringBoot.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
