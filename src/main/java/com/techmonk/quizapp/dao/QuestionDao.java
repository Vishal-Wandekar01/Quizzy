package com.techmonk.quizapp.dao;

import com.techmonk.quizapp.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionDao extends JpaRepository<Question, Integer>{

    List<Question> findByCategory(String category);

    @Query(value = "SELECT * FROM question q WHERE q.category = :category ORDER BY RAND() LIMIT :numOfQue", nativeQuery = true)
    List<Question> findRandomQuestionsByCategory(@Param("category") String category, @Param("numOfQue") int numOfQue);

}
