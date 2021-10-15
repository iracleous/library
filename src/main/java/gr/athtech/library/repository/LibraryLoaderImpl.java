package gr.athtech.library.repository;

import gr.athtech.library.model.Book;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

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




        return null;
    }
}
