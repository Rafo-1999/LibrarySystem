package librarySystem;
class Librarian {
  private String name;
  private int contactInfo;

  public Librarian(String name, int contactInfo) {
    this.name = name;
    this.contactInfo = contactInfo;
  }

  public String getName() {
    return name;
  }

  public int getContactInfo() {
    return contactInfo;
  }

  public void borrowBook(Books book, Library library, Borrowers borrower) {
    if (library.containsBook(book)) {
      library.removeBook(book);
      System.out.println("Book '" + book.getTitle() + "' borrowed by " + borrower.getName());
    } else {
      System.out.println("Book '" + book.getTitle() + "' is not  in the library.");
    }
  }

  public void returnBook(Books book, Library library) {
    library.addBook(book);
    System.out.println("Book '" + book.getTitle() + "' return to the library.");
  }
}