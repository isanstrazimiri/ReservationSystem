import java.util.Scanner;
public class ResClass {
	private static Scanner input;

	public static void main(String[] args) {
		System.out.println("Please enter the number of people who are ready to flight");
		input = new Scanner(System.in);
		int res;
		res=input.nextInt();
		if (res<=50) {
			for (int n=0;n<res;n++) {
			System.out.println("Enter the name");
			String names=input.next();
			System.out.println("Enter the surname");
			String surname=input.next();
			System.out.println("Enter the id");
			int id=input.nextInt();
			System.out.println("Mr/Mrs " + names + surname);
			System.out.println("With the ID:" + id + "is ready to board the plane");
			System.out.println("Please the next one on the line !");
					
		  }
		int seats=50-res; 
		if (seats==0) System.out.println("The plane is full");
		else System.out.println("There are still " + seats + "left");
	
		}
		else 
			System.out.println("The number of people is greater than seats available. Please contact the agency for another flight");
	}

}
