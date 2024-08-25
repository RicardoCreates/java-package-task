package de.ricardo;

import java.util.Arrays;

public class Library {

    // Variables
    private Book[] books;

    public Library(Book[] books) {
        this.books = books;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Library{" +
                "books=" + Arrays.toString(books) +
                '}';
    }

    public void addBook(Book book) {
        Book[] newBooks = Arrays.copyOf(books, books.length + 1);
        newBooks[newBooks.length - 1] = book;
        books = newBooks;
    }

    public void removeBook(Book  Bradbury) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].equals(Bradbury)) {
                Book temp = books[i];
                books[i] = books[books.length - 1];
                books[books.length - 1] = temp;
                books = Arrays.copyOf(books, books.length - 1);
            }
        }
    }
}
