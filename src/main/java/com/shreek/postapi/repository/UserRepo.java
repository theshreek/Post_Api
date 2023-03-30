package com.shreek.postapi.repository;

import com.shreek.postapi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface UserRepo extends JpaRepository<User, Integer> {
//    @Query(value = "select * from user_tbl", nativeQuery = true)
//    List<User> getAllUser();
//    @Query(value = "select * from user_tbl where id = ?1", nativeQuery = true)
//    Optional<User> getUserById(int id);
//    @Query(value = "select * from user_tbl where id = ?1", nativeQuery = true)
//    Optional<User> findUserById(int id);
//    @Query(value="DELETE FROM user_tbl WHERE id = ?1", nativeQuery=true)
//    void deleteUserById(int id);
}
