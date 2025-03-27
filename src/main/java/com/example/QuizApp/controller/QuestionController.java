package com.example.QuizApp.controller;

import com.example.QuizApp.entity.Question;
import com.example.QuizApp.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {

    @Autowired
    private QuestionService questionService;


    @GetMapping("/allQuestions")
    public List<Question> getAllQuestions(){
        return questionService.getAllQuestions();

    }

    @PostMapping("/save")
    public Question saveQuestion(@RequestBody Question question){
        return questionService.saveQuestion(question);

    }

    @DeleteMapping("/{id}")
    public void deleteQuestion(@PathVariable Question id) {
        questionService.deleteQuestion(id);
         return new ResponseEntity<> HttpStatus.NO_CONTENT;
    }
}
