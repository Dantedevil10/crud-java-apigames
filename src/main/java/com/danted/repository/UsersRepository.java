package com.danted.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.danted.model.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users,Long>{
    
}
