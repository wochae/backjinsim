package com.jinsim.back.user.entity;

import com.jinsim.back.letters.entity.Letter;
import jakarta.persistence.*;
import java.util.List;
import lombok.Data;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String kakaoId;

    private String username;
    private String profileImageUrl;

    @OneToMany(mappedBy = "recipient")
    private List<Letter> receivedLetters;

    @OneToMany(mappedBy = "author")
    private List<Letter> authoredLetters;

    // Getters and Setters
}