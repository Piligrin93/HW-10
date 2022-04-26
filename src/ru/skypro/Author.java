package ru.skypro;

import java.util.Objects;

public class Author {
    private String firstNameAuthor;
    private String lastNameAuthor;

    public  Author(String firstNameAuthor, String lastNameAuthor) {
        this.firstNameAuthor = firstNameAuthor;
        this.lastNameAuthor = lastNameAuthor;
    }

    public String getFullNameAuthor() {
        return this.firstNameAuthor + this.lastNameAuthor;
    }

    public String getFirstNameAuthor() {
        return this.firstNameAuthor;
    }

    public String getLastNameAuthor() {
        return this.lastNameAuthor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return lastNameAuthor.equals(author.lastNameAuthor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastNameAuthor);
    }

    public String toString() {
        return "Имя Фамилия Автора: " + this.firstNameAuthor + " " + this.lastNameAuthor;
    }
}
