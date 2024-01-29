import java.util.ArrayList;
import java.util.Scanner;

public class BookServiceImpl implements BookService {
    private ArrayList<Book> bookArrayList;

    public BookServiceImpl() {
        this.bookArrayList = new ArrayList<>();

    }

    @Override
    public void addBook() {
        String title;
        String author;
        double price;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter title of the Book");
        title = scan.nextLine();
        System.out.println("Enter the Author Name");
        author = scan.nextLine();
        System.out.println("Enter the Price");
        price = scan.nextDouble();
        Book b = new Book(title, author, price);
        bookArrayList.add(b);
        System.out.println("Book added to the Store successfully");
    }

    @Override
    public void updateBook() {

    }

    @Override
    public void removeBook() {

    }

    @Override
    public void displayBook() {
        int i = 0;
        for (Book book : bookArrayList) {
            System.out.println(i++ +"-" + book);
        }

    }
}
