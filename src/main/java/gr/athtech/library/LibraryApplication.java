package gr.athtech.library;

import gr.athtech.library.model.Book;
import gr.athtech.library.model.User;
import gr.athtech.library.repository.LibraryCrud;
import gr.athtech.library.repository.LibraryLoader;
import gr.athtech.library.repository.LibraryLoaderImpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LibraryApplication {
    public static void main(String[] args) {


        LibraryCrud libraryCrud = new LibraryCrud();
        Book book = new Book();
        book.setAuthor("Hemingway");
        book.setName("The man and the sea");

        libraryCrud.create(book);
        libraryCrud.create(book);
        libraryCrud.create(book);

        System.out.println(libraryCrud.read());

        LibraryLoader libraryLoader = new LibraryLoaderImpl();
        libraryLoader.saveLibrary(libraryCrud.read(), "mybooks.csv");


    }

    private static void testing() {
        int numberOfPages = 100;

        Book book = new Book();
        book.setName("The man and the sea");
        book.setNumberOfPages(numberOfPages);

        Book anotherBook = new Book();
        anotherBook.setName("Ulysses");
        anotherBook.setNumberOfPages(2 * numberOfPages);

        System.out.println(book.toString() );
        System.out.println(anotherBook.toString() );

        User user = new User("Dimitris", new Date());
        System.out.println(user);

        //////////////////////////////////////
        List<Book> books = new ArrayList<Book>();
        System.out.println(books.size());
        books.add(book);
        System.out.println(books.size());
        books.add(anotherBook);
        System.out.println(books.size());
        books.add(book);
        System.out.println(books.size());
    }
}
