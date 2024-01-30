import java.util.Scanner;

public class BookApp {
    public static void main(String[] args) {


        BookServiceImpl service = new BookServiceImpl();
        Scanner sc = new Scanner(System.in);

        int choice;
        boolean menu = true;
        do {
            System.out.println("Welcome to BookStore \n " +
                    "1- Add a New Book \n" +
                    "2- Update Book \n" +
                    "3- Display Book \n" +
                    "4- Remove Book \n" +
                    "5- Exit App ");
            choice = sc.nextInt();
            switch (choice){
                case 1 :
                    service.addBook();
                    break;
                case 2 :
                    service.updateBook();
                    break;
                case 3 :
                    service.displayBook();
                    break;
                case 4 :
                    service.removeBook();
                    break;
                case 5 :
                    System.out.println("Thanks for visiting us ");
                    menu = false;
                    break;
                default:
                    System.out.println("Wrong Input, Try Again");

            }
        }while (menu);

    }
}
