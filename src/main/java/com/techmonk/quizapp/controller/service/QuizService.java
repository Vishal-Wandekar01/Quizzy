package com.techmonk.quizapp.controller.service;

import com.techmonk.quizapp.controller.dao.QuizDao;
import com.techmonk.quizapp.dao.QuestionDao;
import com.techmonk.quizapp.model.Question;
import com.techmonk.quizapp.model.Quiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizService {

    @Autowired
    QuizDao quizDao;
    @Autowired
    QuestionDao questionDao;

    public ResponseEntity<String> createQuiz(String category, int numOfQue, String title) {

        List<Question> questions = questionDao.findRandomQuestionsByCategory(category, numOfQue);

        //this is what will create quiz
        Quiz quiz = new Quiz();
        quiz.setTitle(title);
        quiz.setQuestions(questions);
        quizDao.save(quiz);
        return new ResponseEntity<>("Success", HttpStatus.CREATED);
    }
}
