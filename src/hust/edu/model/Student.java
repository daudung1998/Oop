package hust.edu.model;

public class Student extends HustPerson {
	private String major = "CNTT";
	private String program = "KSTN";
	private static DataModel dataModel = new DataModel();

	public Student(String fullName, String studentId, String major, String program) {
		super(fullName, studentId);
		this.program = program;
		this.major = major;
	}
	
	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getProgram() {
		return program;
	}

	public void setProgram(String program) {
		this.program = program;
	}

	public void printClass(){
		System.out.println("Danh sach lop sinh vien " + this.getIdNumber() + " hoc la: ");
		for (Class classs : dataModel.getClassList())
			for ( Student student : classs.getStudents())
				if (student.getIdNumber().equals(this.getIdNumber())){
					System.out.println("ID lop: " + classs.getClassId() + "; Ten mon hoc: " + classs.getCourse().getCourseName());
					break;
				}
	}
}