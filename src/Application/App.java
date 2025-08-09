package Application;
import java.util.Scanner;
import Bank.Banking;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("||||||||||||||||||||||||||||||||||");
        System.out.println("WELCOME TO THE SYSTEM!");
        System.out.println("----------------------------");
        System.out.println("1. Banking");
        System.out.println("2. Shopping");
        System.out.println("3. Pay bills");
        System.out.println("----------------------------");
        System.out.println("Enter: ");
        int ch1 = scan.nextInt();
            switch(ch1){
                case 1:
                    Banking bApp[] = new Banking[10];
                    bApp[0] = new Banking();
                    int accCount = 0;
                    int again;
                    int size = bApp.length;
                    int ch2;
                    do{
                        System.out.println("||||||||||||||||||||||||||||||||||");
                        System.out.println("1. Register Account");
                        System.out.println("2. Sign Account");
                        System.out.println("3. View All Accounts");
                        System.out.println("||||||||||||||||||||||||||||||||||");
                        System.out.println("Enter: ");
                        ch2 = scan.nextInt();
                            switch(ch2){
                                case 1:
                                    do{
                                        if (accCount >= bApp.length){
                                            System.out.println("Account limit reached!");
                                            break;
                                        }
                                    bApp[accCount] = new Banking();
                                    System.out.println("Enter Account No.: ");
                                    bApp[accCount].setAccNo1(scan.nextInt());
                                    System.out.println("Set Pin: ");
                                    bApp[accCount].setPin1(scan.nextInt());
                                    accCount++;
                                    System.out.println("Would you like to create an account again? 1-yes/0-no: ");
                                    again = scan.nextInt();
                                    
                                    }while(again == 1);
                                break;
                            case 2:
                                int attempt = 3;
                                int accIndex = -1;
                                while(attempt > 0){
                                    System.out.println("Enter Account No.: ");
                                    int account = scan.nextInt();
                                    System.out.println("Enter Pin No.: ");
                                    int pin = scan.nextInt();
                                    for (int i = 0; i< accCount; i++){
                                        if(bApp[i].verifyAccount(account, pin))
                                            accIndex = i;
                                        }
                                    
                                if(accIndex != -1){
                                    System.out.println("Success!");
                                    System.out.println("Welcome! "+bApp[accIndex].getAccNo1());
                                    Banking currAccount = bApp[accIndex];
                                    Boolean loggedIn = true;
                                    while(loggedIn){
                                        System.out.println("||||||||||||||||||||||||||||||||||");
                                        System.out.println("------ Banking Menu ------");
                                        System.out.println("1. Deposit");
                                        System.out.println("2. Withdraw");
                                        System.out.println("3. Check Balance");
                                        System.out.println("4. Logout");
                                        System.out.println("||||||||||||||||||||||||||||||||||");
                                        System.out.print("Enter option: ");
                                        int option = scan.nextInt();
                                        switch(option){
                                            case 1:
                                                System.out.print("Enter deposit amount: ");
                                                float depAmount = scan.nextFloat();
                                                currAccount.deposit(depAmount);
                                                break;
                                            case 2:
                                                System.out.print("Enter withdraw amount: ");
                                                float witAmount = scan.nextFloat();
                                                currAccount.withdraw(witAmount);
                                                break;
                                            case 3:
                                                System.out.println("Current balance: " + currAccount.getBalance1());
                                                break;
                                            case 4:
                                                System.out.println("Logging out...");
                                                loggedIn = false;
                                                break;
                                            default:
                                                System.out.println("Invalid Option");
                                                break;
                                        }
                                    }
                                    break;
                                }else{
                                    attempt--;
                                    System.out.println("Invalid Account");
                                    System.out.println("Attempts Left: "+attempt);
                                    if(attempt == 0){
                                        System.out.println("Attempt limit reached");
                                        break;
                                    }
                                }
                                }
                                
                                break;
                            case 3:
                                if(accCount == 0){
                                    System.out.println("No Accounts Registered Yet");
                                }else{
                                    System.out.println("Registered Accounts:");
                                    for(int i = 0; i < accCount; i++){
                                         System.out.println("- Account No: " + bApp[i].getAccNo1());
                                    }
                                }
                                break;
                            
                        } //second switch
                    }while(ch2 != 0);

            } //first switch
    } //psvm
}//class