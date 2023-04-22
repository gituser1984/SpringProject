package com.infy.userservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infy.userservice.entity.UserDetail;

@Repository
public interface UserRepository extends JpaRepository<UserDetail, Long>{

}
