package com.techmonk.quizapp.controller.service;

import com.techmonk.quizapp.controller.dao.QuizDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuizService {

    @Autowired
    QuizDao quizDao;

}
