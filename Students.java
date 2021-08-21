package Org.student;

public class Students {
	public void getStudentInfo() {
	int Id= 001;
	System.out.println("Student Id of method1:"+Id);
	}

public void getStudentInfo( int Id ,String name )
{
	System.out.println("Student Info of method2:"+ Id );
	System.out.println("Student Info of method2:"+ name);
	
}
public void getStudentInfo(String mailId ,int phoneNumber)
{ 
  System.out.println("Student Info of method3:"+mailId);
  System.out.println("Student Info of method3:"+ phoneNumber);
		

}
	public static void main(String[] args) {
		Students stObj= new Students();
		stObj.getStudentInfo();
		stObj.getStudentInfo(002,"Jan");
		stObj.getStudentInfo("abcd@gmail.com",124356897);
		// TODO Auto-generated method stub

	}

}
