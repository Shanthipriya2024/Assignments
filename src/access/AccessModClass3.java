package access;

public class AccessModClass3 {
	public static void main(String[] args) {
		AccessModClass1 obj = new AccessModClass1();
		System.out.println("Employee Name: " + obj.getName());
		System.out.println("Employee ID: " + obj.empId());
		obj.setName("Arun");
	}

}


