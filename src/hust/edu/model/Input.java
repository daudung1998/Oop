package hust.edu.model;

import java.util.Scanner;

public class Input {
    private static DataModel dataModel = new DataModel();
    Scanner sc = new Scanner(System.in);

    public Course inputCourse(){
        String courseId;
        String courseName;
        int credit;
        System.out.println("Nhap ID mon hoc: ");
        courseId = sc.nextLine();
        System.out.println("Nhap ten mon hoc: ");
        courseName = sc.nextLine();
        System.out.println("Nhap so tin chi: ");
        credit = sc.nextInt();
        Course course = new Course(courseId,courseName,credit);
        dataModel.addCourse(course);
        return course;
    }

    public Teacher inputTeacher(){
        String fullName;
        String teacherId;
        String department;
        System.out.println("Nhap ID giao vien: ");
        teacherId = sc.nextLine();
        System.out.println("Nhap ten giao vien: ");
        fullName = sc.nextLine();
        System.out.println("Nhap ten vien: ");
        department = sc.nextLine();
        Teacher teacher = new Teacher(fullName,teacherId,department);
        dataModel.addTeacher(teacher);
        return teacher;
    }

    public Student inputStudent(){
        String fullName;
        String studentId;
        String major;
        String program;
        System.out.println("Nhap ID sinh vien: ");
        studentId = sc.nextLine();
        System.out.println("Nhap ten sinh vien: ");
        fullName = sc.nextLine();
        System.out.println("Nhap ten he dao tao: ");
        major = sc.nextLine();
        System.out.println("Nhap ten chuong trinh hoc: ");
        program = sc.nextLine();
        Student student = new Student(fullName,studentId,major,program);
        dataModel.addStudent(student);
        return student;
    }

    public Class inputClass(){
        String classId;
        String courseId;
        String teacherId;
        System.out.println("Nhap ID lop hoc: ");
        classId = sc.nextLine();
        System.out.println("Nhap ID mon hoc: ");
        courseId = sc.nextLine();
        System.out.println("Nhap ID giao vien: ");
        teacherId = sc.nextLine();
        Class classs = new Class(classId,courseId,teacherId);
        dataModel.addClass(classs);
        return classs;
    }

    public void studentToClass(){
        String classId;
        String studentId;
        System.out.println("Nhap ID sinh vien: ");
        studentId = sc.nextLine();
        System.out.println("Nhap ID lop hoc: ");
        classId = sc.nextLine();
        dataModel.addStudentToClass(studentId,classId);
    }

    public void initData(){
        //Course
        dataModel.addCourse("0","a",1);
        dataModel.addCourse("1","b",2);
        dataModel.addCourse("2","c",3);
        dataModel.addCourse("3","d",4);
        dataModel.addCourse("4","e",5);
        dataModel.addCourse("5","f",4);
        dataModel.addCourse("6","g",4);
        dataModel.addCourse("7","h",2);
        dataModel.addCourse("8","i",1);
        dataModel.addCourse("9","j",2);

        //Teacher
        dataModel.addTeacher("A","10","CNTT");
        dataModel.addTeacher("B","11","CNTT");
        dataModel.addTeacher("C","12","CNTT");
        dataModel.addTeacher("D","13","CNTT");
        dataModel.addTeacher("E","14","CNTT");
        dataModel.addTeacher("F","15","CNTT");
        dataModel.addTeacher("G","16","CNTT");
        dataModel.addTeacher("H","17","CNTT");
        dataModel.addTeacher("I","18","CNTT");
        dataModel.addTeacher("J","19","CNTT");

        //Student
        dataModel.addStudent("A A","1000","KSTN","CNTT");
        dataModel.addStudent("A B","1001","KSTN","CNTT");
        dataModel.addStudent("A C","1002","KSTN","CNTT");
        dataModel.addStudent("A D","1003","KSTN","CNTT");
        dataModel.addStudent("A E","1004","KSTN","CNTT");
        dataModel.addStudent("A F","1005","KSTN","CNTT");
        dataModel.addStudent("A G","1006","KSTN","CNTT");
        dataModel.addStudent("A H","1007","KSTN","CNTT");
        dataModel.addStudent("A I","1008","KSTN","CNTT");
        dataModel.addStudent("A J","1009","KSTN","CNTT");
        dataModel.addStudent("A K","1010","KSTN","CNTT");
        dataModel.addStudent("A L","1011","KSTN","CNTT");
        dataModel.addStudent("A M","1012","KSTN","CNTT");
        dataModel.addStudent("A N","1013","KSTN","CNTT");
        dataModel.addStudent("A O","1014","KSTN","CNTT");
        dataModel.addStudent("A P","1015","KSTN","CNTT");
        dataModel.addStudent("A Q","1016","KSTN","CNTT");
        dataModel.addStudent("A S","1017","KSTN","CNTT");
        dataModel.addStudent("A T","1018","KSTN","CNTT");
        dataModel.addStudent("A U","1019","KSTN","CNTT");
        dataModel.addStudent("A V","1020","KSTN","CNTT");
        dataModel.addStudent("A W","1021","KSTN","CNTT");
        dataModel.addStudent("A X","1022","KSTN","CNTT");
        dataModel.addStudent("A Y","1023","KSTN","CNTT");
        dataModel.addStudent("A Z","1024","KSTN","CNTT");
        dataModel.addStudent("B A","1025","KSTN","CNTT");
        dataModel.addStudent("B B","1026","KSTN","CNTT");
        dataModel.addStudent("B C","1027","KSTN","CNTT");
        dataModel.addStudent("B D","1028","KSTN","CNTT");
        dataModel.addStudent("B E","1029","KSTN","CNTT");
        dataModel.addStudent("B F","1030","KSTN","CNTT");
        dataModel.addStudent("B G","1031","KSTN","CNTT");
        dataModel.addStudent("B H","1032","KSTN","CNTT");
        dataModel.addStudent("B I","1033","KSTN","CNTT");
        dataModel.addStudent("B J","1034","KSTN","CNTT");
        dataModel.addStudent("B K","1035","KSTN","CNTT");
        dataModel.addStudent("B L","1036","KSTN","CNTT");
        dataModel.addStudent("B M","1037","KSTN","CNTT");
        dataModel.addStudent("B N","1038","KSTN","CNTT");
        dataModel.addStudent("B O","1039","KSTN","CNTT");
        dataModel.addStudent("B P","1040","KSTN","CNTT");
        dataModel.addStudent("B Q","1041","KSTN","CNTT");
        dataModel.addStudent("B R","1042","KSTN","CNTT");
        dataModel.addStudent("B S","1043","KSTN","CNTT");
        dataModel.addStudent("B T","1044","KSTN","CNTT");
        dataModel.addStudent("B U","1045","KSTN","CNTT");
        dataModel.addStudent("B V","1046","KSTN","CNTT");
        dataModel.addStudent("B W","1047","KSTN","CNTT");
        dataModel.addStudent("B X","1048","KSTN","CNTT");
        dataModel.addStudent("B Y","1049","KSTN","CNTT");

        //Class
        dataModel.addClass("100","0","10");
        dataModel.addClass("101","1","11");
        dataModel.addClass("102","2","12");
        dataModel.addClass("103","3","13");
        dataModel.addClass("104","4","14");
        dataModel.addClass("105","5","15");
        dataModel.addClass("106","6","16");
        dataModel.addClass("107","7","17");
        dataModel.addClass("108","8","18");
        dataModel.addClass("109","9","19");
        dataModel.addClass("110","0","10");
        dataModel.addClass("111","1","11");
        dataModel.addClass("112","2","12");
        dataModel.addClass("113","3","13");
        dataModel.addClass("114","4","14");

        //Add Student to Class
        dataModel.addStudentToClass("1000","100");
        dataModel.addStudentToClass("1001","101");
        dataModel.addStudentToClass("1002","102");
        dataModel.addStudentToClass("1003","103");
        dataModel.addStudentToClass("1004","104");
        dataModel.addStudentToClass("1005","105");
        dataModel.addStudentToClass("1006","106");
        dataModel.addStudentToClass("1007","107");
        dataModel.addStudentToClass("1008","108");
        dataModel.addStudentToClass("1009","109");
        dataModel.addStudentToClass("1010","110");
        dataModel.addStudentToClass("1011","111");
        dataModel.addStudentToClass("1012","112");
        dataModel.addStudentToClass("1013","113");
        dataModel.addStudentToClass("1014","114");
        dataModel.addStudentToClass("1015","100");
        dataModel.addStudentToClass("1016","101");
        dataModel.addStudentToClass("1017","102");
        dataModel.addStudentToClass("1018","103");
        dataModel.addStudentToClass("1019","104");
        dataModel.addStudentToClass("1020","105");
        dataModel.addStudentToClass("1021","106");
        dataModel.addStudentToClass("1022","107");
        dataModel.addStudentToClass("1023","108");
        dataModel.addStudentToClass("1024","109");
        dataModel.addStudentToClass("1025","110");
        dataModel.addStudentToClass("1026","111");
        dataModel.addStudentToClass("1027","112");
        dataModel.addStudentToClass("1028","113");
        dataModel.addStudentToClass("1029","114");
        dataModel.addStudentToClass("1030","100");
        dataModel.addStudentToClass("1031","101");
        dataModel.addStudentToClass("1032","102");
        dataModel.addStudentToClass("1033","103");
        dataModel.addStudentToClass("1034","104");
        dataModel.addStudentToClass("1035","105");
        dataModel.addStudentToClass("1036","106");
        dataModel.addStudentToClass("1037","107");
        dataModel.addStudentToClass("1038","108");
        dataModel.addStudentToClass("1039","109");
        dataModel.addStudentToClass("1040","110");
        dataModel.addStudentToClass("1041","111");
        dataModel.addStudentToClass("1042","112");
        dataModel.addStudentToClass("1043","113");
        dataModel.addStudentToClass("1044","114");
        dataModel.addStudentToClass("1045","100");
        dataModel.addStudentToClass("1046","101");
        dataModel.addStudentToClass("1047","102");
        dataModel.addStudentToClass("1048","103");
        dataModel.addStudentToClass("1049","104");
    }

    public void inputData(){
        while (1>0){
            System.out.println();
            System.out.println("Danh sach cac lua chon: ");
            System.out.println("0. Them mon hoc");
            System.out.println("1. Them giao vien");
            System.out.println("2. Them sinh vien");
            System.out.println("3. Them lop hoc");
            System.out.println("4. Them sinh vien(ID) vao lop hoc(ID)");
            System.out.println("5. Quay lai");
            String flag = sc.nextLine();
            System.out.println();
            if (flag.equals("0"))
                inputCourse();
            if (flag.equals("1"))
                inputTeacher();
            if (flag.equals("2"))
                inputStudent();
            if (flag.equals("3"))
                inputClass();
            if (flag.equals("4"))
                studentToClass();
            if (flag.equals("5"))
                break;
        }
    }

    public void printData(){
        while (1>0){
            System.out.println();
            System.out.println("Danh sach cac lua chon: ");
            System.out.println("0. Danh sach mon hoc");
            System.out.println("1. Danh sach giao vien");
            System.out.println("2. Danh sach sinh vien");
            System.out.println("3. Danh sach lop hoc");
            System.out.println("4. Quay lai");
            String flag = sc.nextLine();
            System.out.println();
            if (flag.equals("0"))
                dataModel.printCourse();
            if (flag.equals("1"))
                dataModel.printTeacher();
            if (flag.equals("2"))
                dataModel.printStudent();
            if (flag.equals("3"))
                dataModel.printClass();
            if (flag.equals("4"))
                break;
        }
    }

    public void printQuery(){
        while (1>0){
            System.out.println();
            System.out.println("Danh sach cac lua chon: ");
            System.out.println("0. Danh sach lop hoc ma sinh vien(ID) dang ky");
            System.out.println("1. Danh sach lop hoc ma giao vien(ID) giang day");
            System.out.println("2. Danh sach sinh vien ma giao vien(ID) giang day");
            System.out.println("3. Danh sach sinh vien cua lop hoc(ID)");
            System.out.println("4. Danh sach giao vien cua mon hoc(ID)");
            System.out.println("5. Quay lai");
            String flag = sc.nextLine();
            System.out.println();
            if (flag.equals("0")){
                System.out.println("Nhap ma sinh vien");
                String id = sc.nextLine();
                dataModel.getStudent(id).printClass();
            }
            if (flag.equals("1")){
                System.out.println("Nhap ma giao vien");
                String id = sc.nextLine();
                dataModel.getTeacher(id).printClass();
            }

            if (flag.equals("2")){
                System.out.println("Nhap ma giao vien");
                String id = sc.nextLine();
                dataModel.getTeacher(id).printStudent();
            }

            if (flag.equals("3")){
                System.out.println("Nhap ma lop hoc");
                String id = sc.nextLine();
                dataModel.getClass(id).printStudent();
            }
            if (flag.equals("4")){
                System.out.println("Nhap ma mon hoc");
                String id = sc.nextLine();
                dataModel.getCourse(id).printTeacher();
            }

            if (flag.equals("5"))
                break;
        }
    }
}
