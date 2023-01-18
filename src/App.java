import java.util.Scanner;

/**
 * Created by kobis on 18 Jan, 2023
 */
public class App {

    private static Scanner scanner;

    public static void main(String[] args) {
       start();
       yalla();
       end();
    }

    public static void addTwoNumbers(){
        System.out.println("pls insert 1st num");
        int a = scanner.nextInt();
        System.out.println("pls insert 2nd num");
        int b = scanner.nextInt();
        System.out.println("a+b="+(a+b));
    }

    public static void subTwoNumbers(){
        System.out.println("pls insert 1st num");
        int a = scanner.nextInt();
        System.out.println("pls insert 2nd num");
        int b = scanner.nextInt();
        System.out.println("a-b="+(a-b));
    }














    public static void showMenu(){
        System.out.println("Press 1 - x+y");
        System.out.println("Press 2 - x-y");
        System.out.println("Press 3 - x*y");
        System.out.println("Press 4 - x/y");
        System.out.println("Press 5 - x^y");
        System.out.println("Press 9 - Exit");
    }


    public static int input(){
        showMenu();
        System.out.println("Enter Your chose");
        return scanner.nextInt();
    }

    public static void yalla(){
       int action = input();
       while (action!=9){
           switch (action){
               case 1:
                   addTwoNumbers();
                   break;
               case 2:
                   subTwoNumbers();
                   break;
               case 3:
                   System.out.println("3...");
                   break;
               case 4:
                   System.out.println("4...");
                   break;
               case 5:
                   System.out.println("5...");
                   break;
               default:
                   System.out.println("Unsupported...");

           }

           action = input();

       }
    }



    public static void start(){
        System.out.println("Welcome to Kobis App");
        scanner = new Scanner(System.in);
    }

    public static void end(){
        System.out.println("Thank you and good bye");
        scanner.close();
    }
}
