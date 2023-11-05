package transaction;

import catalog.Book;

public class BookTransaction {

    public void submitBook(Book book) {
        System.out.println("Book submitted successfully!");
    }

    public Book retrieveBook(int bookId) {
        return new Book();
    }
}
