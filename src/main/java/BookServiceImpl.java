import java.util.ArrayList;
import java.util.Scanner;

public class BookServiceImpl implements BookService {
    private ArrayList<Book> bookArrayList;

    public BookServiceImpl() {
        this.bookArrayList = new ArrayList<>();

        bookArrayList.add(new Book("Java", "Josh", 29.99));
        bookArrayList.add(new Book("Python", "Mario", 49.99));
        bookArrayList.add(new Book("Html", "Mick", 59.99));
        bookArrayList.add(new Book("CSS", "Nick", 19.99));

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
        displayBook();
        Scanner c = new Scanner(System.in);
        System.out.println("Please enter Book # to update");
        int index = c.nextInt();
        c.nextLine();

        int pos = bookArrayList.indexOf(bookArrayList.get(index));
                    // above is the index of "list fist (From index), then will bring the position through "get" for example 1 or 2 or 3
        if (pos < 0){
            System.out.println("This Book does not exist");
        }else{
            System.out.println("Enter the New Title ");
            String newTitle = c.nextLine();
            System.out.println("Please Enter New Author Name ");
            String newAuthor = c.nextLine();
            System.out.println("Please Enter the New Price");
            double newPrice = c.nextDouble();
            Book oldBook = bookArrayList.get(pos);
            oldBook.setTitle(newTitle);
            oldBook.setAuthor(newAuthor);
            oldBook.setPrice(newPrice);
            System.out.println("Book updated Successfully ");
        }


    }

    @Override
    public void removeBook() {
        displayBook();
        System.out.println("Please Enter the Book # to Remove");
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        if (index < 0 || index > bookArrayList.size()){
            System.out.println("Wrong Input");
            System.exit(0);

        }

        Book b = bookArrayList.remove(index);
        System.out.println("Book " + b + " successfully Removed");
    }

    @Override
    public void displayBook() {
        int i = 0;
        for (Book book : bookArrayList) {
            System.out.println(i++ +"-" + book);
        }

    }
}
