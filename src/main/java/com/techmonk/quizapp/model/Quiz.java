package com.techmonk.quizapp.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data  //create getter and setter
public class Quiz {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;

    @ManyToMany  //quiz with multiple question, that's why this mapping is important
    private List<Question> questions;
}
