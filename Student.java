package Org.student;

import Org.department.Department;

public class Student extends Department
{
private static Student stObj;

public void studentName()
{ System.out.println("StudentName:Jan");}
public void studentDept()
{ System.out.println("StudentDept:MBA");

}
public void studentId()
{ System.out.println("StudentId:0491");
}

	public static void main(String[] args) {
		Student.stObj= new Student();
		stObj.studentDept();
		stObj.studentId();
		stObj.studentName();
		stObj.depName();
		stObj.collegeCode();
		stObj.collegeName();
		stObj.collegeRank();
		// TODO Auto-generated method stub

	}

}
