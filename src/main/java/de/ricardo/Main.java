package de.ricardo;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("1984", "George Orwell", "1234567890");
        Book book2 = new Book("Brave New World", "Aldous Huxley", "0987654321");
        Book book3 = new Book("Fahrenheit 451", "Ray Bradbury", "1122334455");

        Book[] books = {book1, book2, book3};
        Library library = new Library(books);

        System.out.println(library);
        System.out.println(library.getBooks()[0]);
    }
}