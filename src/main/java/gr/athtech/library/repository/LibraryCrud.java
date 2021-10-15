package gr.athtech.library.repository;

import gr.athtech.library.model.Book;

import java.util.ArrayList;
import java.util.List;

public class LibraryCrud {
    private List<Book> books;

    public LibraryCrud(){
        books = new ArrayList<Book>();
    }

    public void create(Book book){
        books.add(book);
    }

    public Book read(int index){
        if (index<0 || index>= books.size())
            return null;
        return books.get(index);
    }

    //shallow copy
    public List<Book> read(){
        return books;
    }


    public boolean update(int index, String authorName){
        Book book = read(index);
        if (book == null ) return false;
        book.setAuthor(authorName);
        return true;
    }

    public boolean delete(int index){
        if (index<0 || index>= books.size())
            return false;
        books.remove(index);
        return true;
    }


}
