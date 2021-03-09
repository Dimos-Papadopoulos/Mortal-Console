package Application;
import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void entry(){
        System.out.println("Welcome to Mortal Engines");
        System.out.println("How many players do you wish to have?");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        
        getUserNames(num,scanner);
    }
    public static ArrayList<String> getUserNames(int num, Scanner scanner){
        //Scanner scanner =  new Scanner(System.in);
        ArrayList<String> userNames = new ArrayList<String>();
        for(int i=1;i<=num;i++){
            System.out.println("Enter Username");
            userNames.add(scanner.nextLine());
        } 
        //scanner.close();
        return userNames;
    }

    
    public static void main(String[] args) throws Exception {
        entry();
        
    }
}
