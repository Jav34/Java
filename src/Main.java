import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner class: use it when you want to get user input. Scanner class is part of the java.util
        Scanner scanner = new Scanner(System.in);

        // nextLine() method pauses the program until the user types something and confirms with enter
        System.out.println("What is your name?");
        String name = scanner.nextLine();

        System.out.println("How old are you?");
        int age = scanner.nextInt();

        System.out.println("Hi " + name + "! You are " + age + " years old.");
    }
}