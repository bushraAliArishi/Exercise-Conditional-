import java.util.Random;
import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\n----------------question  1---------------------- \n");
//        Write a program that checks the role of the user
//        If the role is admin print "welcome admin"
//        If the role is superuser print "welcome superuser"
//        If the role is user print "welcome user" (tip:
//        use if else)

        System.out.println("Enter your name");
        String name = input.nextLine();
        System.out.println("Enter your Role");
        String role = input.nextLine();

        if (role.contains("admin")){
            System.out.printf("welcome "+name+" you are an admin");
        } else if (role.contains("superuser")) {
            System.out.printf("welcome "+name+" you are a superuser");
        } else System.out.printf("welcome "+name+" you are a user");


        System.out.println("\n----------------question  2----------------------\n");
//        2.Take three numbers from the user and print the greatest number.
//                Test Data
//        Input the 1st number: 25
//        Input the 2nd number: 78
//        Input the 3rd number: 87

        System.out.println("Enter the first number");
        int num = input.nextInt();
        System.out.println("Enter your second number");
        int num2 = input.nextInt();
        System.out.println("Enter your third number");
        int num3 = input.nextInt();
input.next();
        if (num > num2 && num > num3) {
            System.out.println(num);
        } else if (num2 > num && num2 > num3) {
            System.out.println(num2);
        } else {
            System.out.println(num3);
        }

        System.out.println("\n----------------question  3----------------------\n ");
//        3.Write a Java program that generates an integer between 1 and 7
//        and displays the name of the weekday.
        Random rnum = new Random();

        int scase = rnum.nextInt(8);
        switch (scase) {
            case 1:
                System.out.printf("the day number  " + scase + " is sunday");
                break;
            case 2:
                System.out.printf("the day number  " + scase + " is Monday");
                break;
            case 3:
                System.out.printf("the day number  " + scase + " is Tuesday");
                break;
            case 4:
                System.out.printf("the day number  " + scase + " is Wednesday");
                break;
            case 5:
                System.out.printf("the day number  " + scase + " is Thursday");
                break;
            case 6:
                System.out.printf("the day number  " + scase + " is Friday ");
                break;
            case 7:
                System.out.printf("the day number  " + scase + " is Saturday ");
                break;
           }
        System.out.println("\n----------------question  4----------------------\n ");
//        Write a program that takes a numeric score as input and prints
//        the corresponding letter grade using the following grading scale:
//        A: 90-100
//        B: 80-89
//        C: 70-79
//        D: 60-69 F:
//        0-59
//        Enter your numeric score: 85
//        Numeric Score: 85
//        Letter Grade: B
        System.out.println(" Enter your numeric score");
        int score = input.nextInt();

        if (score > 89 && score < 101) {
            System.out.println("Numeric Score: "+score +" Letter Grade: A");}
        else if (score > 79 && score < 90) {
            System.out.println("Numeric Score: "+score +" Letter Grade: B");}
        else if (score > 69 && score < 80) {
                System.out.println("Numeric Score: "+score +" Letter Grade: C");}
        else if (score > 59 && score < 70) {
            System.out.println("Numeric Score: "+score +" Letter Grade: D");}

        else
            System.out.println("Numeric Score: "+score +" Letter Grade: F");

        System.out.println("\n----------------question  5----------------------\n ");
//        5. Write a Java program that takes a person's age as input and
//        categorizes them into one of three age categories: "Child,"
//        "Teenager," or "Adult" using an if statement.
//                use an if statement to categorize the age based on the following criteria:
//                  • If the age is less than 13, categorize them as a "Child."
//                  • If the age is between 13 and 19 (inclusive), categorize them as a
//                       "Teenager."
//                  • If the age is 20 or older, categorize them as an "Adult."
//                      Sample Output:
//                        Enter your age: 25
//                         You are an Adult.
        System.out.println("  Enter your age");
        int age = input.nextInt();

        if (age < 13 ) {
            System.out.println("You are an Child");}
        else if (age >= 13 && age <= 19 ) {
            System.out.println("You are an Teenager");}
        else
            System.out.println("You are an Adult");



    }
}