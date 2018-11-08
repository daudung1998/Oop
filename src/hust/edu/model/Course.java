package hust.edu.model;

public class Course {
	private String courseId;
	private String courseName; 
	private int credit;
	private static DataModel dataModel = new DataModel();

	public Course(String courseId, String courseName, int credit) {
		this.courseId = courseId;
		this.courseName = courseName;
		this.credit = credit;
	}

	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}

	public void printTeacher(){
		for (Class classs : dataModel.getClassList())
			if (classs.getCourse().getCourseId().equals(this.getCourseId())) {
				System.out.println(classs.getTeacher().getIdNumber() + " " + classs.getTeacher().getFullName());
			}
	}
}
