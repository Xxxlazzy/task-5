public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook(new Book("1984", "George Orwell"));
        library.addBook(new Book("To Kill a Mockingbird", "Harper Lee"));

        library.listBooks();

        library.checkoutBook("1984");
        library.listBooks();

        library.checkoutBook("1984");

        library.returnBook("1984");
        library.listBooks();
    }
}