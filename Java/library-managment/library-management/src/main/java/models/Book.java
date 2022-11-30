package models;

import java.time.LocalDate;

public class Book {

// Fields //////////////////////////////////////////////////////////////////////////////////////////////////////////////

    private String title;
    private Author author;
    private LocalDate pubDate;
    private Category genre;

// Constructors ////////////////////////////////////////////////////////////////////////////////////////////////////////

    public Book(String title, Author author, LocalDate pubDate, Category genre) {
        this.title = title;
        this.author = author;
        this.pubDate = pubDate;
        this.genre = genre;
    }
// Getters and Setters /////////////////////////////////////////////////////////////////////////////////////////////////

    // Title //
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // Author //
    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    // Publication Date //
    public LocalDate getPubDate() {
        return pubDate;
    }

    public void setPubDate(LocalDate pubDate) {
        this.pubDate = pubDate;
    }

    // Genre //
    public Category getGenre() {
        return genre;
    }

    public void setGenre(Category genre) {
        this.genre = genre;
    }
}
