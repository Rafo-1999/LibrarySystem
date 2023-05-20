package librarySystem;

public class Borrowers {
  private String name;
  private int contactInfo;

  public Borrowers(String name, int contactInfo) {
    this.name = name;
    this.contactInfo = contactInfo;
  }

  public String getName() {
    return name;
  }

  public int getContactInfo() {
    return contactInfo;
  }
}