package com.techmonk.quizapp.service;

import com.techmonk.quizapp.Question;
import com.techmonk.quizapp.dao.QuestionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    @Autowired
    QuestionDao questionDao;

    public List<Question> getAllQuestions() {
       return questionDao.findAll();

    }
}
