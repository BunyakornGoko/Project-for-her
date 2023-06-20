package forher.drink;

import java.util.Scanner;

public class ProgramDiary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Manage user = new Manage("Joko&Drink");
        int option = 0;
        String Day , Feels , Synopsis;
        User account;
        while (option != 4) {
                try{
                    if(option > 4){
                        throw new Exception("Error By Joko");
                    }
                }catch (Exception e){
                    throw new RuntimeException(e);
                }
            System.out.println();
            System.out.println("Main Menu");
            System.out.println("1. All Day");
            System.out.println("2. Add Day");
            System.out.println("3. Delete Day");
            System.out.println("4. Exit");
            System.out.println();
            System.out.print("Enter your choice: ");
            option = scanner.nextInt();
            scanner.nextLine();
            System.out.println();

            switch (option) {
                case 1:
                    user.allDay();
                    break;
                case 2 :
                    System.out.print("Enter your Day: ");
                    Day = scanner.nextLine();
                    System.out.print("Enter your Feels: ");
                    Feels = scanner.nextLine();
                    System.out.print("Enter your Synopsis: ");
                    Synopsis = scanner.nextLine();
                    account = new User(Day,Feels,Synopsis);
                    user.addDay(account);
                    break;
                case 3 :
                    System.out.print("Enter your Day for delete: ");
                    Day = scanner.nextLine();
                    user.deleteDay(Day);
                    System.out.println("Day is Deleted");
                    break;
            }
        }
    }
}
