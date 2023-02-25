package atm;

import java.util.Scanner;

public class ATM {
    
    // Initialize Variables
    public static int pin_number = 123456, select;
    public static double balance = 1000000, withdraw = 0, deposit;
    
    // Instantiate Scanner
    public static Scanner input = new Scanner(System.in);
    
    public static void greetings() {
        System.out.println("+=========================================+");
        System.out.println("|                                         |");
        System.out.println("|                  WELCOME                |");
        System.out.println("|                    TO                   |");
        System.out.println("|         Automated Teller Machine        |");
        System.out.println("|                                         |");
        System.out.println("+=========================================+");  
    }
    
    public static void enterPinNumber() {
        
        System.out.println();
        System.out.print("Enter you PIN Number: ");
        pin_number = input.nextInt();
        
        if(pin_number == 123456) {
            System.out.println();
            selectTransactions();
        }else{
            System.out.println();
            System.out.println("Incorrect PIN Number!");
            enterPinNumber();
        }
             
    }
     
    public static void selectTransactions() {
        
        System.out.println("|                                         |");
        System.out.println("|           SELECT TRANSACTIONS           |");
        System.out.println("|                                         |");
        System.out.println("|   1. Withdrawal            2. Deposit   |");
        System.out.println("|   3. Check Balance         4. Exit      |");
        System.out.println("|                                         |");
        System.out.println("|                                         |");
        System.out.println();
        System.out.print("Enter: ");
        select = input.nextInt();
        
        // Validations
        if(select == 1) {
            
            System.out.println();
            System.out.println("Your current balance: " + balance);
            System.out.print("How much money do you want to withdraw? ");
            withdraw = input.nextDouble();
            
            
            if(balance > withdraw) {
                
                // Formula
                balance = balance - withdraw;
                
                System.out.println();
                System.out.println("==================RECEIPT==================");
                System.out.println();
                System.out.println("      Balance: " + balance);
                System.out.println("      Money Withdrawn: " + withdraw);
                System.out.println();
                System.out.println("=================THANK YOU!=================");
                System.out.println();
                
            }else if(balance < withdraw) {
                System.out.println();
                System.out.println("Your current balance is " + balance);
                System.out.println("The transaction cannot be processed!");
            }
            
        }else if(select == 2){
            
            System.out.println();
            System.out.println("Your current balance: " + balance);
            System.out.print("How much money do you want to DEPOSIT? ");
            deposit = input.nextDouble();
            
            // Formula for depositing money
            balance = balance + deposit;
            
            System.out.println();
            System.out.println("==================RECEIPT==================");
            System.out.println();
            System.out.println("      Balance: " + balance);
            System.out.println("      Money Deposit: " + deposit);
            System.out.println();
            System.out.println("=================THANK YOU!=================");
            System.out.println();
            
            
            
        }else if(select == 3) {
            
            System.out.println();
            System.out.println("==================RECEIPT==================");
            System.out.println();
            System.out.println("      Your Current Balance: " + balance);
            System.out.println();
            System.out.println("=================THANK YOU!=================");
            System.out.println();
            
        }else if(select == 4) {
            System.out.println();
            System.out.println("=================THANK YOU!=================");
            System.out.println();
            System.exit(0);
        }
        else if(select > 4) {
            System.out.println();
            System.out.println("The transaction cannot be processed!");
            System.out.println("Plese SELECT between 3 options, 1 for Withdrawal, 2 for Deposit 3 for Check Balance and 4 for Exit!");
            System.out.println();
        }
        
    }
    
    public static void main(String[] args) {
        // Automated Teller Machine
        
        greetings();
        enterPinNumber();
        
    }
    
}
