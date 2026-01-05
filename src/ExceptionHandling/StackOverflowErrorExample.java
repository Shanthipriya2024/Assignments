package ExceptionHandling;

public class StackOverflowErrorExample {
	public static void printName() {
		printName();
	}

	public static void main(String[] args) {
		printName();
	}

}


