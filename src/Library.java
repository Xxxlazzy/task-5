
import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println(book.getTitle() + " was added to the library.");
    }

    public void checkoutBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title) && book.isAvailable()) {
                book.setAvailable(false);
                System.out.println("You checked out: " + book.getTitle());
                return;
            }
        }
        System.out.println("Book not found or not available.");
    }

    public void returnBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title) && !book.isAvailable()) {
                book.setAvailable(true);
                System.out.println("You returned: " + book.getTitle());
                return;
            }
        }
        System.out.println("This book was not checked out or not found.");
    }

    public void listBooks() {
        System.out.println("\nLibrary catalog:");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}