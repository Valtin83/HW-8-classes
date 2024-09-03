public class Book {
    String title;
    Author surname;
     int yearPublication;
    // конструктор
    public Book(String title, Author surname, int yearPublication) {
        this.title = title;
        this.surname = surname;
        this.yearPublication = yearPublication;
    }
    public String getTitle() {
        return this.title;
    }
    public Author getSurname() {
        return this.surname;
    }
    public int getYearPublication() {
        return this.yearPublication;
    }
    public void setYearPublication(int YearPublication) {
        this.yearPublication = YearPublication;
    }
}