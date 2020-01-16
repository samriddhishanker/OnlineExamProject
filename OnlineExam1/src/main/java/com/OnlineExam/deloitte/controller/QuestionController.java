package com.OnlineExam.deloitte.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.OnlineExam.deloitte.model.Question;
import com.OnlineExam.deloitte.service.OnlineExamService;


@Controller
public class QuestionController {
	
	@Autowired
	OnlineExamService onlineExamService;

	@RequestMapping("question")
	public ModelAndView question() {
		ModelAndView view = new ModelAndView("question");
		view.addObject("question", new Question());
		return view;
	}	
	
	@RequestMapping("saveQuestion")
	public ModelAndView saveProduct(Question question) {
		ModelAndView view = new ModelAndView("redirect:/question");
		view.addObject("question", new Question());
		onlineExamService.addQuestion(question);
		System.out.println(question);
		return view;
	}
	
}
