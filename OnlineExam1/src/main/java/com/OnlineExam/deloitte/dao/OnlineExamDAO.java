package com.OnlineExam.deloitte.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.OnlineExam.deloitte.model.Question;

public interface OnlineExamDAO extends CrudRepository<Question, String>{
}