package com.question.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.question.entity.Question;
import com.question.serivces.QuestionService;

@RestController
@RequestMapping("/question")
public class QuestionController {

	@Autowired
	QuestionService questionService;

	@PostMapping
	public Question add(@RequestBody Question question) {
		return questionService.add(question);
	}

	@GetMapping
	public List<Question> getQuestion() {
		return questionService.getQuestion();
	}

	@GetMapping("/{id}")
	public Question get(@PathVariable("id")Long id) {
		return questionService.get(id);
	}
	
	@GetMapping("/quiz/{quizId}")
	public List<Question> getByQuizId(@PathVariable("quizId") Long quizId) {
		return questionService.findByQuizId(quizId);
	}
}
