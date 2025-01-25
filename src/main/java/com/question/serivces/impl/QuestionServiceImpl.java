package com.question.serivces.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.question.entity.Question;
import com.question.repository.QuestionRepo;
import com.question.serivces.QuestionService;

@Service
public class QuestionServiceImpl implements QuestionService {

	@Autowired
	private QuestionRepo questionRepo;

	@Override
	public Question add(Question question) {
		// TODO Auto-generated method stub

		return questionRepo.save(question);
	}

	@Override
	public List<Question> getQuestion() {
		// TODO Auto-generated method stub
		return questionRepo.findAll();
	}

	@Override
	public Question get(Long id) {
		// TODO Auto-generated method stub
		return questionRepo.findById(id).orElseThrow(()->new RuntimeException("Question Not Found!!"));
	}

	@Override
	public List<Question> findByQuizId(Long quizId) {
		// TODO Auto-generated method stub
		return questionRepo.findByQuizId(quizId);
	}

	
}
