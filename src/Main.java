public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Шарль", "Перро");
        Author author2 = new Author("Фёдор", "Достоевский");

        Book book1 = new Book("Сказки", author1, 1936);
        Book book2 = new Book("Преступление и наказание", author2, 1866);

        // Выводим информацию о книгах
        System.out.println("Книга: " + book1.getTitle() +
                ", Автор: " + book1.getAuthor().getFirstName() + " "
                + book1.getAuthor().getLastName() + ", Год: "
                + book1.getPublicationYear());
        System.out.println("Книга: " + book2.getTitle() +
                ", Автор: " + book2.getAuthor().getFirstName() +
                " " + book2.getAuthor().getLastName() + ", Год: "
                + book2.getPublicationYear());

        // Изменяем год публикации первой книги
        book1.setPublicationYear(1953);
        System.out.println("Обновлённый год публикации для книги '"
                + book1.getTitle() + "' : " + book1.getPublicationYear());
        // Изменяем год публикации второй книги
        book2.setPublicationYear(1883);
        System.out.println("Обновлённый год публикации для книги '"
                + book2.getTitle() + "' " + book2.getPublicationYear());
    }
}