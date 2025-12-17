package practice;

import java.util.HashMap;
import java.util.Map;

public class Collection {

	public static void main(String[] args) {
		
		Map<String, String> Student1Map = new HashMap<String, String>();
		Student1Map.put("Name", "Jhon Doe");
		Student1Map.put("Age", "20");
		Student1Map.put("Gender", "Male");
		Student1Map.put("Roll Number", "S12345");
		Student1Map.put("Grade", "A");
		Student1Map.put("Major", "Computer Science");
		Student1Map.put("GPA", "3.8");
		Student1Map.put("Email", "john@example.com");
		Student1Map.put("Contact Number", "9999997777");
		Student1Map.put("Address", "123 Elm St");
		System.out.println("Student 1 details :" + Student1Map);

	}

}
