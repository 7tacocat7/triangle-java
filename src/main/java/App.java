import models.Triangle;
import sun.tools.java.ScannerInputReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * Created by Guest on 7/31/17.
 */





public class App {
    public static void main(String[] args){

        boolean programRunning = true;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        while (programRunning)
        try {
            System.out.println("Do you want to 'Run' the program or 'Exit'?");
            String navigationChoice = bufferedReader.readLine();
            if (navigationChoice.equals("Run")) {
                System.out.println("Welcome to our Triangle app! Please enter the length of your first side.");
                int userSide1 = Integer.parseInt(bufferedReader.readLine());
                //        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Please enter the length of your second side.");
                int userSide2 = Integer.parseInt(bufferedReader.readLine());
                //        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Please enter the length of your third side.");
                int userSide3 = Integer.parseInt(bufferedReader.readLine());

                if (userSide1 == userSide2 && userSide2 == userSide3) {
                    System.out.println("Equilateral");
                } else if ((userSide1 == userSide2) || (userSide2 == userSide3) || (userSide1 == userSide3)) {
                    System.out.println("Isosceles");
                } else if ((userSide1 != userSide2) && (userSide2 != userSide3) && (userSide1 != userSide3)) {
                    System.out.println("Scalene");
                } else {
                    System.out.println("I'm sorry, we don't recognize your input");
                }
            } else if (navigationChoice.equals("Exit")) {
                System.out.println("Goodbye!");
                programRunning = false;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}