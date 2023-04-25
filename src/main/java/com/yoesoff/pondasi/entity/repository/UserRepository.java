package com.yoesoff.pondasi.entity.repository;

import com.yoesoff.pondasi.entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface UserRepository  extends CrudRepository<User, Integer> {
    @Query("SELECT u FROM User u WHERE u.username = :username")
    public User getUserByUsername(@Param("username") String username);
}
