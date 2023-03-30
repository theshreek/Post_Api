package com.shreek.postapi.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
@Entity
@Table(name = "comment_tbl")

public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String body;
    private LocalDateTime creationDate;

    @ManyToOne
    @JoinColumn(name = "post_id", referencedColumnName = "id", nullable = false)
    private Post post;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false)
    private User user;
}
