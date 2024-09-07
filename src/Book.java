import java.util.Objects;

public class Book {
    private String title;
    private Author author;
    private int publicationYear;

    // конструктор
    public Book(String title, Author author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    // Реализуем геттеры и сеттеры
    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    // Реализуем метод toString
    public String toString() {
        return "Книга " + this.title + ", автор " + this.author +
                "год издания" + this.publicationYear;
    }

    // Реализуем метод equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publicationYear == book.publicationYear && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    // Реализуем метод hashCode
    @Override
    public int hashCode() {
        return Objects.hash(title, author, publicationYear);
    }
}

