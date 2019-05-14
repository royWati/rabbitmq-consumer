package com.eclectics.questiontwo.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "messages")

public class Messages {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "message")
    private String message;
    @Column(name = "created_on")
    private LocalDateTime createdOn;

    @PrePersist
    public void addData(){
        this.createdOn = LocalDateTime.now();
    }

}
