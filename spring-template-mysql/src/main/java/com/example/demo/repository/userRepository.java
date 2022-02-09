package com.example.demo.repository;

import com.example.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface userRepository extends JpaRepository<User, Integer> {
    // some default methods inherited by JpaRepository interface:
    //    findAll()
    //    getById(ID id)
    //    delete(T entity)
    //    deleteById
    //    findById
    //    save
    // reference: https://docs.spring.io/spring-data/jpa/docs/current/api/org/springframework/data/jpa/repository/JpaRepository.html

}
