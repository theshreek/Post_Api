package com.shreek.postapi.repository;

import com.shreek.postapi.model.Post;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@Repository
public interface PostRepo extends JpaRepository<Post, Integer> {

    /*
        @Modifying
        @Query(value = "insert into post_tbl (title, body, content) values (:title,:body, :content)", nativeQuery = true)
        void insertPost(@Param("title") String title, @Param("body") String body, @Param("content") String content);
    */
    @Modifying
    @Query(nativeQuery = true, value = "INSERT INTO post_tbl (title, body, content) VALUES ('?1', '?2', '?3')")
    @Transactional
    int insertPost(String title, String body, String content);

    @Query(value = "select * from post_tbl", nativeQuery = true)
    List<Post> getAllPost();
//    @Query(value = "select * from post_tbl where id = ?1", nativeQuery = true)
//    Optional<Post> getPostById(int id);
//
//    @Query(value = "select * from post_tbl where id = ?1", nativeQuery = true)
//    Optional<Post> findPostById(int id);
//
//   @Query("update User u set u.firstname = ?1 where u.lastname = ?2")
//    int updatePost(String firstname, String lastname);
//
//    @Query(value="DELETE FROM post_tbl WHERE id = ?1", nativeQuery=true)
//    void deletePostById(int id);


}
