package hust.edu.model;


import java.util.ArrayList;
import java.util.List;

public class DataModel {
	private static List<Course> courses = new ArrayList<>();
	private static List<Student> students = new ArrayList<>();
	private static List<Teacher> teachers = new ArrayList<>();
	private static List<Class> classes = new ArrayList<>();

	public void addCourse(String courseId, String courseName, int credit){
		Course course = new Course(courseId,courseName,credit);
		if ( !courses.contains(course))
			courses.add(course);
	}
	public void addCourse(Course course){
		if ( !courses.contains(course))
			courses.add(course);
	}
	public Course getCourse(String courseId){
		for (Course course : courses){
			if (course.getCourseId().equals(courseId)){
				return course;
			}
		}
		System.out.println("ID khong ton tai. Thuc hien lai chuong trinh!");
		System.exit(0);
		return null;
	}
	public List<Course> getCoursesList() {
		return courses;
	}
	public void printCourse(){
		System.out.println("Danh sach toan bo cac mon hoc la: ");
		for (Course course :courses){
			System.out.println("ID mon hoc: "+ course.getCourseId() + "; Ten mon hoc: " + course.getCourseName());
		}
	}

	public void addStudent(String fullName, String studentId, String major, String program){
		Student student = new Student(fullName,studentId,major,program);
		if ( !students.contains(student))
			students.add(student);
	}
	public void addStudent(Student student){
		if ( !students.contains(student))
			students.add(student);
	}
	public Student getStudent(String studentId){
		for (Student student : students){
			if (student.getIdNumber().equals(studentId)){
				return student;
			}
		}
		System.out.println("ID khong ton tai. Thuc hien lai chuong trinh!");
		System.exit(0);
		return null;
	}
	public List<Student> getStudentsList() {
		return students;
	}
	public void removeStudent(String studentId){
		Student student = getStudent(studentId);
		for (Class classs : classes)
			classs.getStudents().remove(student);
		students.remove(student);
	}
	public void printStudent(){
		System.out.println("Danh sach toan bo sinh vien la: ");
		for (Student student : students){
			System.out.println("ID sinh vien: "+ student.getIdNumber() + "; Ten sinh vien: " + student.getFullName());
		}
	}

	public void addTeacher(String fullName, String teacherId, String department){
		Teacher teacher = new Teacher(fullName,teacherId,department);
		if ( !teachers.contains(teacher))
			teachers.add(teacher);
	}
	public void addTeacher(Teacher teacher){
		if ( !teachers.contains(teacher))
			teachers.add(teacher);
	}
	public Teacher getTeacher(String teacherId){
		for (Teacher teacher : teachers){
			if (teacher.getIdNumber().equals(teacherId)){
				return teacher;
			}
		}
		System.out.println("ID khong ton tai. Thuc hien lai chuong trinh!");
		System.exit(0);
		return null;
	}
	public List<Teacher> getTeachersList() {
		return teachers;
	}
	public void printTeacher(){
		System.out.println("Danh sach toan bo giao vien la: ");
		for (Teacher teacher : teachers){
			System.out.println("ID giao vien: "+ teacher.getIdNumber() + "; Ten giao vien: " + teacher.getFullName());
		}
	}

	public void addClass(String classId, String courseId, String teacherId){
		Class classs = new Class(classId,courseId,teacherId);
		if ( !classes.contains(classs))
			classes.add(classs);
	}
	public void addClass(Class classs){
		if ( !classes.contains(classs))
			classes.add(classs);
	}
	public void addStudentToClass(String studentId, String classId){
		Class classs = getClass(classId);
		Student student = getStudent(studentId);
		classs.addStudent(student);
	}
	public Class getClass(String classId) {
		for (Class classs : classes)
			if (classs.getClassId().equals(classId)){
				return classs;
			}
		System.out.println("ID khong ton tai. Thuc hien lai chuong trinh!");
		System.exit(0);
		return null;
	}
	public List<Class> getClassList (){
		return classes;
	}
	public void printClass(){
		System.out.println("Danh sach toan bo lop hoc la: ");
		for (Class classs : classes){
			System.out.println("ID lop: "+ classs.getClassId() + "; Ten mon hoc: " + classs.getCourse().getCourseName());
		}
	}
}
