package com.demoStudent.studentDetails;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RestController
@RequestMapping
public class StudentController {
	
	static List<Student> studentList=new ArrayList<Student>();

	//Requestbody required to get data from ui
	@RequestMapping(value="/student/{id}", method=RequestMethod.POST)
	public @ResponseBody Student getStudentDetails(@ModelAttribute Student student) {
		System.out.println(student.toString());
		
		student.add
		
		return student;
	}
	
	@GetMapping("/getStudents")
	public ModelAttribute getStudents() {
		return ModelAttribute;
	}
}
