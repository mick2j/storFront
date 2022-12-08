# storFront
package storeFront;
import java.time.LocalDateTime;
import java.util.*;

public class Main {
	static LocalDateTime date = LocalDateTime.now();
	static Scanner in = new Scanner(System.in);
	static String optionSubMenu;
	static int optionRegisterClient = 0;
	static Client client;
    static boolean isCodeValid = false;
    static int invoice_Number = 0;
	static GereralClothing[] stock = { 
			new GereralClothing("M0001","BLUE JEAN", "L", 18.99f), new GereralClothing("M0002", "BLUE JEAN SHORTS", "M", 15.25f), 
			new GereralClothing("M0003", "ORANGE T-SHIRT", "L", 11.99f), new GereralClothing("M0004", "GREEN T-SHIRT", "XL", 13.99f), 
			new GereralClothing("M0005", "BLACK JACKET", "L", 29.5f), new GereralClothing("M0006", "ORANGE SHORT", "M", 9.99f), 
			new GereralClothing("M0007", "UNDERWEARS SET", "L", 20.99f), new GereralClothing("M0008", "SOCKS SET", "M", 15.5f), 
			new GereralClothing("M0009", "BRONW BELT", "XL", 11.8f), new GereralClothing("M0010", "BLACK BELT", "L", 10.5f),
			};

	static List<GereralClothing> shoppingCar = new ArrayList<>();
	
//***********************************************************************************************//
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String optionMenu;
		boolean isExitPressed = false;
	
		System.out.println("*****************************************************************************");
		System.out.println("*********************WELCOME TO THE SHOPPING CENTER***************************");
		System.out.println("*****************************************************************************");
		System.out.println(" Our store features a variety of items from different departments\n");
	
        while(isExitPressed == false){

            System.out.println("Please, Select an option: ");
            System.out.println("1) Storage SubMenu");
            System.out.println("2) Enter Customer: ");
            System.out.println("3) Enter Sale: ");
            System.out.println("4) View Sale Information: ");
            System.out.println("5) Exit");
            optionMenu = in.nextLine();

            switch (optionMenu) {
                case "1":
                    ShowStorageSubMenu();
                    break;
                case "2":
                	ShowRegisterClientMenu();
                    break;
                case "3":
                	ShowEnterSale();
                    break;
                case "4":
    				if (Objects.equals(client, null))
    					continue;
    				ShowSaleInformation(client, shoppingCar);
    				client = null;
    				shoppingCar.clear();
                    break;
                case "5":
                    isExitPressed = true;
                    System.out.println("See You next Time");
                    break;
                default: System.out.println("Error, You Must Type a Valid Option");

			}
        }
	}
	static void ShowStorageSubMenu(){
        while(!Objects.equals(optionSubMenu, "3")){
            System.out.println("Please, Select an option: \n");
            System.out.println("1) Search by description");
            System.out.println("2) Search by code ");
            System.out.println("3) Exit \n");

            optionSubMenu = in.nextLine();

            switch (optionSubMenu){
                case "1":
                    System.out.println("Type the Description: ");
                    String description_product = in.nextLine().toUpperCase();
                    searchByDescription(description_product);
                    break;
                case "2":
                    System.out.println("Type the Code: ");
                    String code_product = in.nextLine().toUpperCase();
                    searchByCode(code_product);
                    break;
                default:  System.out.println("Option is not valid");
            }
        }
    }
    
	static void searchByDescription(String product_description){

        Boolean productoEncontrado = false;

        for (int i = 0; i < stock.length; i++) {
            if(Objects.equals(product_description, stock[i].getDescription().toUpperCase())){

                System.out.println("Product Found");
                System.out.println("The Code is: " + stock[i].getCode());
                System.out.println("The Size is: " + stock[i].getSize());
                System.out.println("The Price is: $" + (float)stock[i].getPrice());
                productoEncontrado = true;
            }
        }
        if (productoEncontrado == false){
            System.out.println("Product Not Found, Please Check The Description Again");
        }
    }
	
    static void searchByCode(String code_product){
    	Boolean productoEncontrado = false;
        for (int i = 0; i < stock.length; i++) {
            if(Objects.equals(code_product, stock[i].getCode().toUpperCase())){
                System.out.println("Product Found");
                System.out.println("The description is: " + stock[i].getDescription());
                System.out.println("The Size is: " + stock[i].getSize());
                System.out.println("The Price is: $" + (float)stock[i].getPrice());
                productoEncontrado = true;
            }
        }
        if (productoEncontrado == false){
            System.out.println("Product Not Found, Please Check The Code Again");
        }
    }
     
    static void ShowRegisterClientMenu(){
    	client = new Client();
        String nameClient, numPhone;
        String genderClient, typeClient;
        int ageClient;
        boolean isNameVerified, isNumberVerified, isAgeVerified, isGenderVerified, isTypeVerified;

        System.out.println("Enter Customer: ");

        do{
			System.out.println("Enter Customer's Phone Number: ");
			numPhone = in.nextLine();
			client.setNumphone(numPhone);

			if (numPhone.length() == 10) {
				isNumberVerified = true;
			} else {
				System.out.println("The Number Must have 10 digits");
				isNumberVerified = false;
			}
        }while (isNumberVerified == false);


        do{
            System.out.println("Enter Customer's Name: ");
            nameClient = in.nextLine();
            client.setName(nameClient);

            if(nameClient.length() > 2 && nameClient.length() < 25){
                isNameVerified = true;
            }
            else
            {
                System.out.println("Name length must be between 2 and 25 character");
                isNameVerified = false;
            }
        }while (isNameVerified == false);

        do{
            System.out.println("Enter Customer's Age: ");
            ageClient = in.nextInt();
            client.setAge(ageClient);

            if(ageClient > 0 && ageClient < 99){
                isAgeVerified = true;
            }else{
                System.out.println("Age Must Have Two Positives Digits");
                isAgeVerified = false;
            }
        }while (isAgeVerified == false);

        do{
        	System.out.println("Enter Customer's Gender: ");
            genderClient = in.nextLine().toUpperCase();
            client.setGender(genderClient);

            if(Objects.equals(genderClient, "F") || Objects.equals(genderClient, "M") || Objects.equals(genderClient, "X")){
                isGenderVerified = true;
            }else
            {
                System.out.println("You Must Type F if is Female, M if is Male, X if is different to F and M");
                isGenderVerified = false;
            }
        }while (!isGenderVerified);
        do{
        	System.out.println("Enter Customer's Type: ");
            typeClient = in.nextLine().toUpperCase();
            client.setTypeClient(typeClient);

            if(Objects.equals(typeClient, "F") || Objects.equals(typeClient, "V") || Objects.equals(typeClient, "N")){
                isTypeVerified = true;
            }else{
                System.out.println("You Must Type F, V or N");
                isTypeVerified = false;
            }

        }while (isTypeVerified == false);
        System.out.println("Custumer has been successfully created!!!\n");
    }
    
	static void ShowEnterSale() {

		String optionEnterSale;

		do {
			System.out.println("Please, Select an option: \n");
			System.out.println("1) Type Code");
			System.out.println("2) Exit");
			optionEnterSale = in.next();

			if (Objects.equals(optionEnterSale, "1")) {

				do {
					System.out.println("Type Products' Code");
					String code = in.next().toUpperCase();

					addClothingToCar(code);

				} while (isCodeValid == false);

			} else {
				System.out.println("Type a Valid Code");
			}

		} while (!Objects.equals(optionEnterSale, "2"));

	}
	
	
	
	static void ShowSaleInformation(Client client, List<GereralClothing> clothings) {
		final int TAX = 19;

		System.out.printf("#######################################################%n");
		System.out.printf("# %-10s # SALE    # N° %06d #%n", date.toString(), invoice_Number);
		System.out.printf("#######################################################%n");

		System.out.printf("# %-20s %-19s %-8s #%n", "Client", "Phone Number", "TypeClient");
		System.out.printf("# %-20s %-19s %-9s  #%n", client.getName(), client.getNumphone(), client.getTypeClient());
		System.out.printf("#######################################################%n");

		System.out.printf("# %-7s %-23s %-6s %-12s #%n", "Code", "Discount", "Size", "Price");

		for (int i = 0; i < clothings.size(); i++) {
			System.out.printf("# %-7s %-23s %-6s %-12.2f #%n", clothings.get(i).getCode(),
					clothings.get(i).getDescription(), clothings.get(i).getSize(), clothings.get(i).getPrice());
		}
		System.out.printf("#######################################################%n");

		float subTotal = 0;
		for (int i = 0; i < clothings.size(); i++) {
			subTotal += clothings.get(i).getPrice();
		}

		double amount = subTotal;

		int discountPercentage = 0;

		if (Objects.equals(client.getTypeClient(), "F")) { // if the client is frequently gets 8% discount
			discountPercentage = 8;
			amount = (int) (amount * 0.92);
		} else if (Objects.equals(client.getTypeClient(), "V")) { // if the client is vip gets 12% discount
			discountPercentage = 12;
			amount = (int) (amount * 0.88);
		}
		if (client.getAge() >= 65) { // if the client is 65 years or old gets 4% discount
			discountPercentage += 4;
			amount = (int) (amount * 0.96);
		}

		amount = (amount * 1.19f);

		System.out.printf("# Subtotal :                             %5.2f        #%n", subTotal);
		System.out.printf("# TAX      :                             %-8d     #%n", TAX);
		System.out.printf("# Discount :                             %-8d     #%n", discountPercentage);
		System.out.printf("#######################################################%n");
		System.out.printf("# Total    :                           $ %-8.2f     #%n", amount);
		System.out.printf("#######################################################%n");

		invoice_Number++;

	}

	static void addClothingToCar(String code) {
		isCodeValid = false;
		for (int i = 0; i < stock.length; i++) {
			if (Objects.equals(code, stock[i].getCode())) {
				isCodeValid = true;
				shoppingCar.add(stock[i]);
				return;
			}
		}
		if (isCodeValid == false) {
			System.out.println("Product Not Found, Please Check The Code Again");
		}
	}
}
