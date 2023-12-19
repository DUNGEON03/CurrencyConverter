package converter;

import java. util.*;
//import java.lang.*;

public class CurrencyConverter {

    public static void main(String[] args) {
    	
    	String usrName = "USERNAME";
    	String pass = "User123";
    	
    	System.out.println("Welcome to online currency converter!!");
    
        int attempts = 3;
        String userName = "";
        String passWord = "";
        		
        while (attempts-- > 0 && !pass.equals(passWord) && !usrName.equals(userName)) //compares and then decrements
        {
        	  // Create a Scanner object
        	Scanner myObj = new Scanner(System.in);
       	 System.out.println("Enter username");
             userName = myObj.nextLine();
       	 System.out.println("Enter password");
             passWord = myObj.nextLine();
        	
            
            if (pass.equals(passWord) &&  usrName.equals(userName)) {
            	
                System.out.println("Welcome");
                // take input
                
                System.out.println("1. To view currency rates");
                System.out.println("2. To convert currency in desired currency");
                System.out.println("Choose your selection");
                
                Scanner obj = new Scanner(System.in);
                
                int selection = obj.nextInt();
                
                if(selection == 1)
                {
                	 System.out.println("1 US dollar to Indian Ruppee = 83.18 INR");
                	 System.out.println("1 INR to US Dollar = 0.012 US Dollar");
                	 System.out.println("1 EURO to Indian Ruppee = 90.90 INR");
                	 System.out.println("1 INR to Euro = 0.011 EURO");
                	 System.out.println("1 Dollar to Euro = 0.92 EURO ");
                	 System.out.println("1 Euro to US Dollar = 1.09 US Dollar ");
                }
                
                if(selection == 2) {
                Scanner sc = new Scanner(System.in); 
                System.out.println("1 Ruppe");
                System.out.println("2 Dollar");
                System.out.println("3 Euro");
                System. out.println("Choose the currency");
            	int choice = sc.nextInt();
            	if (choice != 1 && choice!=2 && choice!= 3)
            	{
            		while(true)
            		{
            			System.out.println("Wrong Input!!");
            			System. out.println("Please choose one of the above mentioned currency");
            			choice = sc.nextInt();
            			if (choice == 1 || choice==2||choice== 3)
            				break;
            			else 
            				continue;
            		}
            	}    
                	System.out.println("Enter the amount");
                		while(!sc.hasNextDouble())
                		{
                			System.out.println("Wrong amount!!");
                			System.out.println("Please enter a numeric amount value");
                			sc.next();
                		}
                	double amount = sc.nextDouble();
                	sc.close();
                	// convert the amount
                switch (choice) {
                    case 1:
                        Ruppe_to_other(amount);
                        break;
                    case 2:
                        Dollar_to_other(amount);
                        break;
                    case 3:
                        Euro_to_other(amount);
                        break;
                    default:
                        System.out.println("Invalid choice");
                }

                }
            }
            else 
                System.out.println("Incorrect. Number of attempts remaining: " + attempts);        
        }
        
    	
 
    }

public static void Ruppe_to_other(double amt) {
    System.out.println("1 Ruppe = " + 0.012 + " Dollar");
    System.out.println();

    System.out.println(amt+" Ruppe = " + String.format("%.2f",amt*0.012) + " Dollar");
    System.out.println();

    System.out.println("1 Ruppe = " + 0.011 + " Euro");
    System.out.println();
    System.out.println(amt+" Ruppe = " + String.format("%.2f",amt*0.011) + " Euro");
    System.out.println();

}
    

public static void Dollar_to_other(double amt) {
    System.out.println("1 Dollar = " + 83.22 + " Ruppe");
    System.out.println();
    System.out.println(amt+" Dollar = " + String.format("%.2f",amt*83.22) + " Ruppe");
    System.out.println();

    System.out.println("1 Dollar= " + 0.91 + " Euro");
    System.out.println();

    System.out.println(amt+" Dollar = " + String.format("%.2f",amt*0.91) + " Euro");
}

    

public static void Euro_to_other(double amt){
    System.out.println("1 Euro = " + 90.90 + " Ruppe");
    System.out.println();
    System.out.println(amt+" Euro = " + String.format("%.2f",amt*90.90) + " Ruppe");
    System.out.println();

    System.out.println("1 Euro = " + 1.09 + " Dollar");
    System.out.println();

    System.out.println(amt+" Euro = " + String.format("%.2f",amt*1.09) + " Dollar");
}

}
