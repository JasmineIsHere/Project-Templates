package com.gooman.template.repository;

import com.gooman.template.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface userRepository extends MongoRepository<User, Integer> {
    // some default methods inherited by JpaRepository interface:
    //    findAll()
    //    getById(ID id)
    //    delete(T entity)
    //    deleteById
    //    findById
    //    save
    // reference: https://docs.spring.io/spring-data/jpa/docs/current/api/org/springframework/data/jpa/repository/JpaRepository.html

}
