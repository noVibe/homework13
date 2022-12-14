import java.util.Objects;

public class Book {


    private int year;
    private String name;
    private Author author;


    public Book(int year, String name, Author author) {
        this.year = year;
        this.name = name;
        this.author = author;
    }


    public int getYear() {
        return year;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book Name: " + name + ". Year of publishing: " + year + ". Author: " + author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && Objects.equals(name, book.name) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, name, author);
    }
}
