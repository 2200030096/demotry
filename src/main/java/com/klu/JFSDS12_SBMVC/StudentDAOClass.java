package com.klu.JFSDS12_SBMVC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentDAOClass implements StudentDAO {

	@Autowired
	StudentInterface si;
	@Override
	public String insertStudent(Student std) {
		// TODO Auto-generated method stub
		si.save(std);
		return "inserted sucessfully";
	}
	@Override
	public String updateStudent(Student std, int sid) {
		// TODO Auto-generated method stub
		 if (si.existsById(std.getSid())) { // Check if student exists
	            si.save(std); // Update student details
	            return "Student updated successfully";
	        }
	        return "Student not found";

	}
	@Override
	public Student getStudentById(int sid) {
	    return si.findById(sid).orElse(null); // Fetch student if exists, else return null
	}

	@Override
	public String deleteStudent(int sid) {
	    if (si.existsById(sid)) {
	        si.deleteById(sid); // Deletes the student by ID
	        return "Student deleted successfully";
	    } else {
	        return "Student not found";
	    }
	}

   
}
