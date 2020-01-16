package com.OnlineExam.deloitte.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.OnlineExam.deloitte.dao.OnlineExamDAO;
import com.OnlineExam.deloitte.model.Question;

@Service
public class OnlineExamServiceImpl implements OnlineExamService {
	
	@Autowired
	OnlineExamDAO onlineExamDAO;

	@Override
	public void addQuestion(Question question) {
		onlineExamDAO.save(question);
		
	}
}