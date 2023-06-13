package enumerations;

public class ProirityDemo {

	public static void main(String[] args) {
		Priority priority = Priority.HIGH;
		switch(priority) {
		case HIGH:
			System.out.println("High Priority");
			break;
		case MEDIUM:
			System.out.println("Medium priority");
			break;
		case LOW:
			System.out.println("Low Priority");
			break;
		default:
			System.out.println("Choose a priority type");
			
		}
			
		
	}
}
