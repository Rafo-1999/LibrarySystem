package librarySystem;

import java.util.Date;

public class Main {

  public static void main(String[] args) {

    Books book1 = new Books("Book 1", "Author 1", new Date(2000));
    Books book2 = new Books("Book 2", "Author 2", new Date(2001));
    Books book3 = new Books("Book 3", "Author 3", new Date(2002));

    Library library = new Library();
    library.addBook(book1);
    library.addBook(book2);
    library.addBook(book3);

    Librarian librarian = new Librarian("librarian ", 077777777);

    Borrowers borrower = new Borrowers("borrower1", 055555555);

    library.displayAvailableBooks();

    librarian.borrowBook(book2, library, borrower);

    library.displayAvailableBooks();

    librarian.borrowBook(book2, library, borrower);

    librarian.returnBook(book2, library);

    library.displayAvailableBooks();
  }
}

