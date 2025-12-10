package assignment3;

public class Employees {
	
	String [] employeeName = {"Bharath", "John", "Aarav"};
	int [] employeeId = {1234, 1235, 1236};


	public static void main(String[] args) {
		
		Employees obj = new Employees();
		System.out.println("Employee name :"+ obj.employeeName[0]+" ,"+"Employee Id :"+obj.employeeId[0]);
		System.out.println("Employee name :"+ obj.employeeName[1]+" ,"+"Employee Id :"+obj.employeeId[1]);
		System.out.println("Employee name :"+ obj.employeeName[2]+" ,"+"Employee Id :"+obj.employeeId[2]);
		

	}
}
