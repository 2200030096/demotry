package com.klu.JFSDS12_SBMVC;

public interface StudentDAO {
	public String insertStudent(Student std);
	public String updateStudent(Student std,int sid);
	public Student getStudentById(int sid);
	public String deleteStudent(int sid);


}
