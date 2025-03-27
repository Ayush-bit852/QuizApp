package com.example.QuizApp.service;


import com.example.QuizApp.dao.QuestionDao;
import com.example.QuizApp.entity.Question;
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

    public Question saveQuestion(Question question){
        return questionDao.save(question);
    }

    public void deleteQuestion(Question id) {
        questionDao.delete(id);
    }
}
