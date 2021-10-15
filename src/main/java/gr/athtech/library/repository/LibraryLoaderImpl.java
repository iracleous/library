package gr.athtech.library.repository;

import gr.athtech.library.model.Book;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibraryLoaderImpl implements LibraryLoader{

    @Override
    public void saveLibrary(List<Book> books, String filename) {
        File file = new File(filename);
        try ( PrintWriter printWriter = new PrintWriter(file)  ){
            printWriter.println("Name,authorName,numberOfPages");
            for(Book book:books){
                printWriter.println(book.getName()
                +","+book.getAuthor()
                +"," +book.getNumberOfPages());
              }
        }
        catch(Exception e)
        {

        }

    }

    @Override
    public List<Book> readLibrary(String filename) {

        List<Book> books = new ArrayList<>();
        File file = new File(filename);

        try (Scanner scanner = new Scanner(file)){
             scanner.nextLine();
            while(scanner.hasNext()){
                String line = scanner.nextLine();

                String []words = line.split(",");

                String bookName = words[0];
                String authorName = words[1];
                int numberOfPages = Integer.parseInt(words[2]) ;
                Book book = new Book();
                book.setName(bookName);
                book.setAuthor(authorName);
                book.setNumberOfPages(numberOfPages);
                books.add(book);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        return books;
    }
}
