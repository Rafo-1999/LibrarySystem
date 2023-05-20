package librarySystem;

import java.util.ArrayList;
import java.util.List;

class Library {
  private List<Books> books;

  public Library() {
    this.books = new ArrayList<>();
  }

  public void addBook(Books book) {
    books.add(book);
  }

  public void removeBook(Books book) {
    books.remove(book);
  }

  public boolean containsBook(Books book) {
    return books.contains(book);
  }

  public void displayAvailableBooks() {
    System.out.println("books in the library:");
    for (Books book : books) {
      System.out.println( book.getTitle() + " by " + book.getAuthor() + " (" + book.getDate() + ")");
    }

  }
}