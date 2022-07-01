import java.util.Arrays;
import java.util.Scanner;

public class SnackMachine{

    //A static object to assign the price to it after the user chooses an option
    //because the price is a local variable, b here is used as a static object to be used inside and outside the methods
    static Snack b = Snack.getInstance();
    static double cash;
    //scanner object to monitor user input throughout the program
    static Scanner keypad = new Scanner(System.in);
    //filling each row with 5 different snacks
    //each name is a number inside the array and each name represents a column with five similar items to choose the quantity after choosing the item
    static String arr1[] = new String[]{"snickers","pringles","Reeses","milkyway","Twix"};//A
    static String arr2[] = new String[]{"Lays","Popchips","Kettles","Flakes","Crunchies"};//B
    static String arr3[] = new String[]{"M&M's","Nuts","Popcorn","Walnuts","cheesepops"};//C
    static String arr4[] = new String[]{"Buggles","Doritos","Stax","Ruffles","Munchos"};//D
    static String arr5[] = new String[]{"Chixmix","Latejuly","Nettle","Organichips","Bounty"};//E

//All the methods are static to be referenced from a static context and to be applied to the class directly
    public static void displayChoices(Snack b){
        //assuming rows are distributed based on price
        System.out.println("A.        $1.25 ");
        System.out.println("B.        $1.75 ");
        System.out.println("C.        $2.00 ");
        System.out.println("D.        $1.55 ");
        System.out.println("E.        $0.75 ");
        
        System.out.println();
        System.out.println("Please type a letter(each letter points to a row)");
        String choice = keypad.next().toUpperCase();
        //choosing the row Based on letters from A to E and then assigning the price to the object
        if(choice.equals("A")){
            System.out.println("You have chosen the price category (A) with price of $1.25");
            System.out.println(Arrays.toString(arr1));
            Snack.setPrice(1.25);

        }else if(choice.equals("B")){
            System.out.println("You have chosen the price category (B) with price of $1.75");
            System.out.println(Arrays.toString(arr2));
            Snack.setPrice(1.75);

        }else if(choice.equals("C")){
            System.out.println("You have chosen the price category (C) with price of $2.00");
            System.out.println(Arrays.toString(arr3));
            Snack.setPrice(2);

        }else if(choice.equals("D")){
            System.out.println("You have chosen the price category (D) with price of $1.55");
            System.out.println(Arrays.toString(arr4));
            Snack.setPrice(1.55);

        }else if(choice.equals("E")){
            System.out.println("You have chosen the price category (E) with price of $0.75");
            System.out.println(Arrays.toString(arr5));
            Snack.setPrice(0.75);

        }else{
            System.out.println("Please enter a valid letter next time! ");
            System.exit(0);
        }
            //choosing the column based on numbers from 1 to 5
            System.out.println("Please type a number to choose from this list(each number points to a column from 1-5)");
            int num = keypad.nextInt();
            if( num > 5){
                throw new ArithmeticException("The number must be from 1 to 5");
            }else if(  num <= 0){
                throw new RuntimeException("the number must be a positive value");
            }
        
            //assigning the choice to the chosen option and displaying the final item.
        if(choice.equals("A")){
            switch(num){
            case 1:
            System.out.printf("You have chosen %s" , arr1[0]);
            Snack.setName(arr1[0]);
            break;
            case 2:
            System.out.printf("You have chosen %s" , arr1[1]);
            Snack.setName(arr1[1]);
            break;
            case 3:
            System.out.printf("You have chosen %s" , arr1[2]);
            Snack.setName(arr1[2]);
            break;
            case 4:
            System.out.printf("You have chosen %s" , arr1[3]);
            Snack.setName(arr1[3]);
            break;
            case 5:
            System.out.printf("You have chosen %s" , arr1[4]);
            Snack.setName(arr1[4]);
            break;
            default:
            System.out.printf("The number must be from 1 to 5");
            break;
            }
            
        }else if(choice.equals("B")){
            switch(num){
                case 1:
                System.out.printf("You have chosen %s" , arr2[0]);
                Snack.setName(arr2[0]);
                break;
                case 2:
                System.out.printf("You have chosen %s" , arr2[1]);
                Snack.setName(arr2[1]);
                break;
                case 3:
                System.out.printf("You have chosen %s" , arr2[2]);
                Snack.setName(arr2[2]);
                break;
                case 4:
                System.out.printf("You have chosen %s" , arr2[3]);
                Snack.setName(arr2[3]);
                break;
                case 5:
                System.out.printf("You have chosen %s" , arr2[4]);
                Snack.setName(arr2[4]);
                break;
                default:
                System.out.printf("The number must be from 1 to 5");
                break;
                }
        }else if(choice.equals("C")){
            switch(num){
                case 1:
                System.out.printf("You have chosen %s" , arr3[0]);
                Snack.setName(arr3[0]);
               break;
                case 2:
                System.out.printf("You have chosen %s" , arr3[1]);
                Snack.setName(arr3[1]);
                break;
                case 3:
                System.out.printf("You have chosen %s" , arr3[2]);
                Snack.setName(arr3[2]);
                break;
                case 4:
                System.out.printf("You have chosen %s" , arr3[3]);
                Snack.setName(arr3[3]);
                break;
                case 5:
                System.out.printf("You have chosen %s" , arr3[4]);
                Snack.setName(arr3[4]);
               break;
                default:
                System.out.printf("The number must be from 1 to 5");
                break;
                }
            }else if(choice.equals("D")){
                switch(num){
                    case 1:
                    System.out.printf("You have chosen %s" , arr4[0]);
                    Snack.setName(arr4[0]);
                    break;
                    case 2:
                    System.out.printf("You have chosen %s" , arr4[1]);
                    Snack.setName(arr4[1]);
                    break;
                    case 3:
                    System.out.printf("You have chosen %s" , arr4[2]);
                    Snack.setName(arr4[2]);
                    break;
                    case 4:
                    System.out.printf("You have chosen %s" , arr4[3]);
                    Snack.setName(arr4[3]);
                    break;
                    case 5:
                    System.out.printf("You have chosen %s" , arr4[4]);
                    Snack.setName(arr4[4]);
                    break;
                    default:
                    System.out.printf("The number must be from 1 to 5");
                    break;
                    }
                }else if(choice.equals("E")){
                    switch(num){
                        case 1:
                        System.out.printf("You have chosen %s" , arr5[0]);
                        Snack.setName(arr5[0]);
                        break;
                        case 2:
                        System.out.printf("You have chosen %s" , arr5[1]);
                        Snack.setName(arr5[1]);
                        break;
                        case 3:
                        System.out.printf("You have chosen %s" , arr5[2]);
                        Snack.setName(arr5[2]);
                        break;
                        case 4:
                        System.out.printf("You have chosen %s" , arr5[3]);
                        Snack.setName(arr5[3]);
                        break;
                        case 5:
                        System.out.printf("You have chosen %s" , arr5[4]);
                        Snack.setName(arr5[4]);
                        break;
                        default:
                        System.out.printf("The number must be from 1 to 5");
                        break;
                        }
                    }
    }

    //calculate the last cost after inserting quantity and obtaining the snack cost
    public static double calculateTotal(int quantity , Snack b){
        return  quantity * b.price;
    }



/*methods for testing*/
    //for validating the inserted cash it is called in the SnackMachineTest class
    public static double getInsertedCashNumber(double moneyInserted){
        return moneyInserted;
    }
    //for validating the returned change it is called in the SnackMachineTest class
    public static double calculateChange(double moneyInserted , double cost){
        return moneyInserted - cost;

    }
    //method overloaded for testing purposes
    public static boolean dispense(double moneyInserted , double cost , int quantity){
        if(moneyInserted > 0 && cost > 0 && quantity > 0){
            return true;
        }else{
            return false;
        }
        
    }
/*methods for testing*/
    


    //Method to calculate and print the change in addition to printing the receipt if wanted
    public static void dispense(double moneyInserted , double cost , Snack b , int quantity){
        if(moneyInserted > cost){
            System.out.println("vending.....");
            double change = moneyInserted - cost;
            System.out.printf("Here is you change $%.2f\n", change);
            //printing the receipt
            System.out.println("Would you like a receipt answer with (y/n)");
            String answer = keypad.next();
            if(answer.equals("y")){
                System.out.printf("You have purchased %s\n ", b.name);
                System.out.printf("One item price %.2f\n ", b.price);
                System.out.printf("The quantity is %d \n ", quantity);
                System.out.printf("You have payed %.2f \n ", moneyInserted);
                System.out.printf("The total cost was %.2f \n ", cost);
                System.out.printf("The returned change is %.2f\n ", change);
                System.out.println("Come back soon, Thank you for the purchase");
            }else if(answer.equals("n")){
                System.out.println("Come back soon, Thank you for the purchase");
                System.exit(0);
            }else{
                System.out.println("Follow the instructions properly next time, no receipt for you");
                System.exit(0);
            }

        }else{
            System.out.println("Sorry not enough money! your money is " + moneyInserted + " and the snack costs " + cost);
        }
    }

    //The main method to begin the program.
    public static void main(String[] args){

        // Welcome statement to the vending snack machine
	    System.out.println("Welcome to the SnackMachine");
	    System.out.println("We have the best snacks in town");
        
        //intialize this method to begin displaying options for the user
        displayChoices(b);

	    //prompt & Store User information
        System.out.println();
	    System.out.println("Please insert the quantity from 1 to 5");
        int quantity = keypad.nextInt();
        if(quantity <= 0){
            throw new ArithmeticException("quantity must be a positive value");
        }else if(quantity > 5){
            throw new RuntimeException("Maximum number of items in one column is 5");
        }
        double total = calculateTotal(quantity , b);

        System.out.println();
        
        //accumulating and adding money from the user in addition to validations
        while(true ){
            System.out.println("please enter cash or press 0 if you are done");
            Scanner input_number = new Scanner(System.in);
            double currentNum = input_number.nextDouble();
            cash += currentNum;
            if( currentNum == 0){
                break;
            }else if(  currentNum  != 0.1 && currentNum  != 0.2 && currentNum  != 0.5 && currentNum  != 1 && currentNum  != 20 && currentNum  != 50){
                throw new RuntimeException("Sorry but the only supported amounts are:0.1c, 0.2c, 0.5c, 1, 20, 50 Here is your cash back");
        }
    }
        System.out.printf("The total cash is %.2f \n",cash);
        if(cash < 0){
            throw new ArithmeticException("The cash must be a positive value");
        }else if(cash < 0.75){
            
        throw new RuntimeException("You don't have enough money to purchase anything you must have at least 0.75 here is your money back");
        }
        double cost = total;
	    
        //calculate change and print receipt
	    dispense(cash , cost , b , quantity);
    }
}