package com.ofs.java.vini.day3;


	import com.ofs.java.vini.day3.Person;
	import com.ofs.java.vini.day3.Student;
	import com.ofs.java.vini.day3.StudentMarkEntity;
	import com.ofs.java.vini.day3.Teacher;
	import com.ofs.java.vini.day3.TeacherSalaryEntity;
	import com.ofs.java.vini.day3.StudentInfo;
	import com.ofs.java.vini.day3.TeacherInfo;

	/**
	 * Main Class
	 * @author blaze1457
	 *
	 */
	public class Demo {

		public static void main(String[] args) {
			
			// TODO Auto-generated method stub
			Person person = new Person();
			person.setName("vinitha");
			person.setAge(22);
			person.setNationality("Indian");
			person.setPhoneNo(984563210);
			
			Student student = new Student();
			student.setName("yuganthi");
			student.setAge(22);
			student.setNationality("Indian");
			student.setPhoneNo(812222145);
			student.setClassName("B.Tech");
			student.setSection("CSE");
			student.setRollno(1455);
			student.setRank(8);
			
			Teacher teacher = new Teacher();
			teacher.setName("Harish");
			teacher.setAge(23);
			teacher.setNationality("Indian");
			teacher.setPhoneNo(965553355);
			teacher.setEmpId(1565);
			teacher.setQualification("B.E");
			teacher.setSubject("jQuery");
			
			StudentInfo studentInfo = new StudentInfo();
			studentInfo.printBasicInfo(person);
			studentInfo.printStudentInfo(student);
			System.out.println("Attendance Percentage is "+studentInfo.calculateAttendacePercent(10, 20));
			
			StudentMarkEntity marks = new StudentMarkEntity();
			marks.setChemistry(69);
			marks.setPhysics(80);
			marks.setMaths(90);
			
			studentInfo.calculateMark(marks);
			
			TeacherInfo teacherInfo = new TeacherInfo();
			teacherInfo.printTeacherInfo(teacher);
			System.out.println("Attendance Percentage is"+teacherInfo.calculateAttendacePercent(10, 30));
			
			TeacherSalaryEntity salary = new TeacherSalaryEntity();
			salary.setBasicPay(100000);
			salary.setGrossSalary(65000);
			salary.setHraAllowance(9000);
			salary.setPf(1500);
			teacherInfo.calculateMark(salary);
		}

	}


