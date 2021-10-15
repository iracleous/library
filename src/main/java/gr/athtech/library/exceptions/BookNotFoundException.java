package gr.athtech.library.exceptions;

public class BookNotFoundException extends Exception {

    public BookNotFoundException(String description){
        super(description);
    }

}
