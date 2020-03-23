package lemubit.academy;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        final int yes = 1;
        final int no = 0;
        final int not_sure = 2;

        var sc = new Scanner(System.in);
        System.out.println("Was it nice (1 = Yes) (0 = No) (2 = Not sure)");
        var choice = sc.nextInt();

        switch (choice){
            case yes:
                System.out.println("Glad you are happy...");
                break;
            case no:
                System.out.println("How could we help");
                break;
            case not_sure:
                System.out.println("Hmmm... a little more info");
                break;
        }
    }

}
