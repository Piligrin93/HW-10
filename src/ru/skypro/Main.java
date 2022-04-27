package ru.skypro;

public class Main {

    public static void main(String[] args) {
        Author author1 = new Author("Михаил ", "Булгаков");
        System.out.println("Автор книги " + author1.getFirstNameAuthor() + " " + author1.getLastNameAuthor());
        Book book1 = new Book("Мастер и Маргарита", author1, 2007);
        book1.setYearPublication(2008);
        System.out.println(book1.getNameBook() + " " + author1.getFullNameAuthor() + " " + book1.getYearPublication());

        System.out.println(book1); // Вывел toString Book с делегированием toString Author
        System.out.println(author1); // Вывел отдельно от метода toString Book, чтобы наглядно показать, что работает

        System.out.println("----------");

        Author author2 = new Author("Джордж ", "Мартин");
        System.out.println("Автор книги " + author2.getFirstNameAuthor() + " " + author2.getLastNameAuthor());
        Book book2 = new Book("Песнь льда и пламени", author2, 2014);
        book2.setYearPublication(2015);
        System.out.println(book2.getNameBook() + " " + author2.getFullNameAuthor() + " " + book2.getYearPublication());

        System.out.println(book2); // Вывел toString Book с делегированием toString Author
        System.out.println(author2); // Вывел отдельно от метода toString Book, чтобы наглядно показать, что работает

        System.out.println(book1.equals(book2)); // Сравнение названий книг
        System.out.println(author1.equals(author2)); // Сравнение имен авторов

        System.out.println("Хэш-код для книги 1 - " + book1.hashCode());
        System.out.println("Хэш-код для книги 2 - " + book2.hashCode());
        System.out.println("Хэш-код для автора 1 - " + author1.hashCode());
        System.out.println("Хэш-код для автора 2 - " + author2.hashCode());
    }
}
