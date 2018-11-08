package hust.edu.model;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends HustPerson {
	private String department;
	private static DataModel dataModel = new DataModel();

	public Teacher(String fullName, String teacherId, String department) {
		super(fullName, teacherId);
		this.department = department;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public void printClass(){
		System.out.println("Danh sach lop giao vien " + this.getFullName()+ " day la: ");
		for (Class classs : dataModel.getClassList())
			if (classs.getTeacher().getIdNumber().equals(this.getIdNumber())) {
				System.out.println("ID lop: "+ classs.getClassId() + "; Ten mon hoc: " + classs.getCourse().getCourseName());
			}
	}

	public void printStudent(){
		List<Student> studentList = new ArrayList<Student>();
		System.out.println("Danh sach sinh vien giao vien " + this.getFullName()+ " day la: ");
		for (Class classs : dataModel.getClassList())
			if (classs.getTeacher().getIdNumber().equals(this.getIdNumber())) {
				for (Student student : classs.getStudents())
					if ( !studentList.contains(student))
						studentList.add(student);
			}

		for (Student student : studentList)
			System.out.println("ID sinh vien: " + student.getIdNumber() + "; Ten sinh vien: " + student.getFullName());
	}
}
