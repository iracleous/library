package gr.athtech.library.repository;

import gr.athtech.library.model.Book;

import java.util.List;

public interface LibraryLoader {

   void saveLibrary(List<Book> books, String filename);
   List<Book> readLibrary(String filename);
}
