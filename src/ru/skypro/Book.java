package ru.skypro;

import java.util.Objects;

public class Book {
    private String nameBook;
    public Author nameAuthor;
    private int yearPublication;

    public Book(String nameBook, Author nameAuthor, int yearPublication) {
        this.nameBook = nameBook;
        this.nameAuthor = nameAuthor;
        this.yearPublication = yearPublication;
    }

    public String getNameBook() {
        return this.nameBook;
    }

    public Author getNameAuthor() {
        return this.nameAuthor;
    }

    public int getYearPublication() {
        return this.yearPublication;
    }

    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return nameBook.equals(book.nameBook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBook);
    }

    public String toString() {
        return "Название книги: " + this.nameBook + " - " + getNameAuthor() + " - Год публикации: " + this.yearPublication;
    }

}
