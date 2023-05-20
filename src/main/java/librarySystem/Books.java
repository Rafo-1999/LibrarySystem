package librarySystem;

import java.util.Date;

class Books {
  private String title;
  private String author;
  private Date date;

  public Books(String title, String author, Date date) {
    this.title = title;
    this.author = author;
    this.date = date;
  }

  public String getTitle() {
    return title;
  }

  public String getAuthor() {
    return author;
  }

  public Date getDate() {
    return date;
  }
}