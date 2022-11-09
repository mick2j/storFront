package storeFront;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int department = 0;
		
	
		
		System.out.println("*****************************************************************************");
		System.out.println("***********************WELCOME TO OUR STORE**********************************");
		System.out.println("*****************************************************************************");
		System.out.println(" Our store features a variety of items from different departments\n");
		
		
		
			System.out.println(" Which department would you like to enter?");
			System.out.println(" 1 Men's Department\n");
			System.out.println(" 2 Women's Department\n");
			System.out.println(" 3 Home/Technology Department\n");
			System.out.println(" 4 Boys Clothing Department\n");
			System.out.println(" 5 Girls Clothing Department\n");
		 
			department = Integer.parseInt(sc.nextLine());
			
			switch(department) {
			case 1:
				// display department
				System.out.println(" Men's Department");
				System.out.println(" Here are some featured items");
				//display items 
				
				public static void main(String[] args) {
					
					Scanner keyboard = new Scanner (System.in);
					String answer;
					do {
						
					
					System.out.println("Enter the price");
					Double price = keyboard.nextDouble();
					
					System.out.println("Enter the quatity : ");
					int qty = keyboard.nextInt();
					
					double total = price* qty;
					
					System.out.printf("The Total is $%.2f\n", total);
					
					System.out.println("Do you want to calculate another total? Yes or No");
					
					answer  = keyboard.next();
							
				}

					
					while (answer.equalsIgnoreCase("yes"));
					
			}
			}
				
			}
		
	}

}
