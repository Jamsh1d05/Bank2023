import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Employee emp1 = new Employee("Jamshid", "Alimzhanov", 17, "male", "123456789", "4390");
        ArrayList<Employee> employees = new ArrayList<Employee>();
        employees.add(emp1);

        Client client1 = new Client("Otabek", "Shadimatov", 18, "male", "123456789", "1111", 1_000_000);
        ArrayList<Client> clients = new ArrayList<Client>();
        Client client2 = new Client("Jasur", "Korganbayev", 17, "male", "987654321", "0000", 100);
        Client client3 = new Client("Elliot", "Alderson", 20, "male", "3034390", "55555", 100);
        clients.add(client1);
        clients.add(client2);

        System.out.println("==========================");
        System.out.println(" ----=== AITU BANK ===----");
        System.out.println("==========================");
        System.out.println("Welcome! Choose one of the options: ");
        System.out.println("1. Login as a Client");
        System.out.println("2. Login as a Employee");
        System.out.print("Enter your choice: ");
        int choose = input.nextInt();
        input.nextLine();

        switch (choose) {
            case 1:
                System.out.print("Enter username: ");
                String username = input.nextLine();
                System.out.print("Enter  password: ");
                String password = input.nextLine();
                Client.login(clients, username, password);
                if (client1.logged) {
                    System.out.println("Welcome " + client1.getName());
                    System.out.println("Choose one of the options: ");
                    System.out.println("1. Transact money to another client");
                    System.out.println("2. Show my balance");
                    System.out.print("Enter your choice: ");
                    int took1 = input.nextInt();
                    switch (took1) {

                        case 1:
                            System.out.println("Enter the money you want to transact :");
                            int transactsum = input.nextInt();
                            client1.makeTransaction(client2, transactsum);
                            System.out.println(transactsum + " tg Successfully transacted!");
                            break;
                        case 2:
                            System.out.println("Your cash are equal to: " + client1.getMoney());
                            break;
                    }
                    break;
                }

                if (client2.logged) {
                    System.out.println("Welcome "+ client2.getName());
                    System.out.println("Choose one of the options: ");
                    System.out.println("1. Transact money to another client");
                    System.out.println("2. Show my balance");
                    System.out.print("Enter your choice: ");
                    int command1 = input.nextInt();
                    switch (command1) {

                        case 1:
                            System.out.println("Enter the money you want to transact :");
                            int transactsum = input.nextInt();
                            client2.makeTransaction(client1, transactsum);
                            System.out.println(transactsum + " tg Successfully transacted!");
                            break;
                        case 2:
                            System.out.println("Your cash are equal to: " + client2.getMoney());

                    }

                }

                else {
                        System.out.println("Welcome " + client3.getName());
                        System.out.println("Choose one of the options: ");
                        System.out.println("1. Transact money to another client");
                        System.out.println("2. Show my balance");
                        System.out.print("Enter your choice: ");
                        int choose1 = input.nextInt();
                        switch (choose1) {

                            case 1:
                                System.out.println("Enter the money you want to transact :");
                                int transactsum = input.nextInt();
                                client1.makeTransaction(client1, transactsum);
                                System.out.println(transactsum + " tg Successfully transacted!");
                                break;
                            case 2:
                                System.out.println("Your cash are equal to: " + client3.getMoney());

                        }

                    }
                   break;


            case 2:
                System.out.print("Enter username for admin: ");
                String admin_username = input.nextLine();
                System.out.print("Enter  password for admin: ");
                String admin_password = input.nextLine();
                Employee.login(employees, admin_username, admin_password);
                for (int i = 0; i < clients.size(); i++) {
                    System.out.println(clients.get(i));
                }
             }
          }
      }
