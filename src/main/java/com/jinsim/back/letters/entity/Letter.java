package com.jinsim.back.letters.entity;


import com.jinsim.back.user.User;
import jakarta.persistence.*;
import java.util.Date;
import lombok.Data;

@Entity
@Data
public class Letter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private User author;

    @ManyToOne
    @JoinColumn(name = "recipient_id")
    private User recipient;

    private String content;
    private boolean isPublic = true;
    private boolean isDraft = false;
    private String purpose;
    private String tone;
    private String keywords;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt = new Date();

    // Getters and Setters
}