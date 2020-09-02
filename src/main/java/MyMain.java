import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scan.nextLine();
        System.out.println("hello " + name + ", my name is Kyra!");
        System.out.println("What's your favorite color?");
        String color = scan.nextLine();
        System.out.println("I love the color " + color + " that's my favorite as well!");
        System.out.println("How old are you?");
        String age = scan.nextLine();
        System.out.println("You're " + age + "? I'm fifteen!");
        System.out.println("What grade are you in?");
        String grade = scan.nextLine();
        System.out.println("You're in " + grade + "? I'm a sophomore!");
        System.out.println("Do you like pizza?");
        String likePizza = scan.nextLine();
        System.out.println("I looooooove pizza!");


        scan.close();
    }
}
