package com.klu.JFSDS12_SBMVC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {
	
	@Autowired
	 private StudentDAO stui;

	@GetMapping("/")
	public String formrender()   // here string is the retiurn type the name of teh jsp file
	{
		return "form";
	}  
	
	@GetMapping("/addstudent")
	 public String test(@ModelAttribute Student student, Model model) {
	 model.addAttribute("student", student);
	 System.out.println(stui.insertStudent(student));
	return "viewdetails";
	}
	@GetMapping("/updateForm/{sid}")
	public String showUpdateForm(@PathVariable("sid") int sid, Model model) {
	    Student student = stui.getStudentById(sid);
	    if (student != null) {
	        model.addAttribute("student", student);
	        return "updateForm"; // View for updating the student details
	    } else {
	        return "studentNotFound"; // Error page if student not found
	    }
	}
	@PostMapping("/updateStudent")
	public String updateStudent(@ModelAttribute Student student, Model model) {
	    stui.updateStudent(student, 8); // Implement the update method in your DAO
	    model.addAttribute("student", student);
	    return "viewdetails"; // Show the updated student details
	}

	@GetMapping("/delete/{sid}")
	public String deleteStudent(@PathVariable("sid") int sid, Model model) {
	    String result = stui.deleteStudent(sid);
	    model.addAttribute("message", result);
	    return "deleted"; // or another page to display the result
	}

}
