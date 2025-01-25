package com.question.serivces;

import java.util.List;

import com.question.entity.Question;


public interface QuestionService {

Question add(Question question);
	
	List<Question> getQuestion();
	
	Question get(Long id);
	
	List<Question> findByQuizId(Long quizId);
	
}
