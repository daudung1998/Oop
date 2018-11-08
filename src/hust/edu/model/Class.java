package hust.edu.model;

import java.util.ArrayList;
import java.util.List;

public class Class {
	private String classId;
	private Teacher teacher;
	private Course course;
	private List<Student> students = new ArrayList<Student>();
	private static DataModel dataModel = new DataModel();

	public Class(String classId, String courseId, String teacherId) {
		this.classId = classId;
		this.setCourse(courseId);
		this.setTeacher(teacherId);
	}

	public String getClassId() {
		return classId;
	}
	public void setClassId(String classId) {
		this.classId = classId;
	}

	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public void setTeacher(String teacherId){
		this.teacher = dataModel.getTeacher(teacherId);
	}

	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	public void addStudent(Student student){
		if (!students.contains(student))
			students.add(student);
	}
	public void printStudent(){
		System.out.println("Danh sach lop " + this.getClassId() + " la: ");
		for (Student student: students)
			System.out.println("ID sinh vien: " + student.getIdNumber() + "; Ten sinh vien: " + student.getFullName());
	}

	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public void setCourse(String courseId){
		this.course = dataModel.getCourse(courseId);
	}
}