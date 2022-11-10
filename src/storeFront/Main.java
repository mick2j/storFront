package storeFront;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;


public class Main {
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
                  //  ShowRegisterClientMenu();
                    break;
                case "3":
                	//ShowEnterSale();
                    break;
                case "4":
                	/*if(Objects.equals(client, null)){
                        continue;
                    }

                    ShowSaleInformation(client, shoppingCar);*/
                    break;
                case "5":
                    isExitPressed = true;
                    System.out.println("See You next Time");
                    break;
                default: System.out.println("Error, You Must Type a Valid Option")
				
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
                System.out.println("The Price is: " + (float)stock[i].getPrice());
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
                System.out.println("The Price is: " + (float)stock[i].getPrice());
                productoEncontrado = true;
            }
        }
        if (productoEncontrado == false){
            System.out.println("Product Not Found, Please Check The Code Again");
        }
    }
    
    
    
}

