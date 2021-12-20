package testing.lexicon;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter your name");
        String aName= sc.nextLine(); //reads a string.
        System.out.println("Hello "+aName);
    }
}
