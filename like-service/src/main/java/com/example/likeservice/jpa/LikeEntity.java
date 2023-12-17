package com.example.likeservice.jpa;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@Table(name = "likes")
public class LikeEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 120, unique = true)
    private String productId;
    @Column(nullable = false)
    private String rstName;
    @Column(nullable = false)
    private String location;
    @Column(nullable = false)
    private Integer stars;

    @Column(nullable = false)
    private String userId;
}
