package manager;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import model.Book;
import storage.ReadWriteFile;

public class ManagerBook implements Serializable {
    public static List<Book> books = new ReadWriteFile().readFile();
    public ManagerBook() {
    }
    public ManagerBook(List<Book> books) {
        this.books = books;
    }

    public static List<Book> getBooks() {
        return books;
    }


    public static void setBooks(List<Book> books) {
        ManagerBook.books = books;
    }
    public static void addBook(Book book){
        books.add(book);
        new ReadWriteFile().writeFile(books);
    }
    public static void deleteBook(String bookCode){
        for (Book book: books) {
            if (book.getBookCode().equals(bookCode)){
                books.remove(book);
                break;
            }
        }
        new ReadWriteFile().writeFile(books);
    }
    public static void editBook(String bookCode, Book book){
        for (Book book1: books) {
            if (book1.getBookCode().equals(bookCode)){
                book1.setBookCode(book.getBookCode());
                book1.setName(book.getName());
                book1.setPrice(book.getPrice());
                book1.setAuthor(book.getAuthor());
                break;
            }
        }
    }
    public static void showAll(){
        for (Book book: books) {
            System.out.println(book);
        }
    }
    public static void searchBook(String bookCode){
        for (Book book: books) {
            if (book.getBookCode().equals(bookCode)){
                System.out.println(book);
                break;
            }
        }
    }
    public static void sortBook(){
        books.sort((o1, o2) -> {
            if (o1.getPrice() > o2.getPrice()){
                return 1;
            }else if (o1.getPrice() < o2.getPrice()){
                return -1;
            }else {
                return 0;
            }
        });
    }
    public static void sortBookByCode(){
        books.sort((o1, o2) -> {
            if (o1.getBookCode().compareTo(o2.getBookCode()) > 0){
                return 1;
            }else if (o1.getBookCode().compareTo(o2.getBookCode()) < 0){
                return -1;
            }else {
                return 0;
            }
        });
    }
    public static void sortBookByName(){
        books.sort((o1, o2) -> {
            if (o1.getName().compareTo(o2.getName()) > 0){
                return 1;
            }else if (o1.getName().compareTo(o2.getName()) < 0){
                return -1;
            }else {
                return 0;
            }
        });
    }
    public static void sortBookByAuthor(){
        books.sort((o1, o2) -> {
            if (o1.getAuthor().compareTo(o2.getAuthor()) > 0){
                return 1;
            }else if (o1.getAuthor().compareTo(o2.getAuthor()) < 0){
                return -1;
            }else {
                return 0;
            }
        });
    }
    public static void sortBookByPrice(){
        books.sort((o1, o2) -> {
            if (o1.getPrice() > o2.getPrice()){
                return 1;
            }else if (o1.getPrice() < o2.getPrice()){
                return -1;
            }else {
                return 0;
            }
        });
    }
    public static void sortBookByCategory(){
        books.sort((o1, o2) -> {
            if (o1 instanceof model.Fictionbook && o2 instanceof model.ProgrammingBook){
                return 1;
            }else if (o1 instanceof model.ProgrammingBook && o2 instanceof model.Fictionbook){
                return -1;
            }else {
                return 0;
            }
        });
    }
    public static void sortBookByLanguage(){
        books.sort((o1, o2) -> {
            if (o1 instanceof model.ProgrammingBook && o2 instanceof model.Fictionbook){
                return 1;
            }else if (o1 instanceof model.Fictionbook && o2 instanceof model.ProgrammingBook){
                return -1;
            }else {
                return 0;
            }
        });
    }
    public static void sortBookByFramework(){
        books.sort((o1, o2) -> {
            if (o1 instanceof model.ProgrammingBook && o2 instanceof model.Fictionbook){
                return 1;
            }else if (o1 instanceof model.Fictionbook && o2 instanceof model.ProgrammingBook){
                return -1;
            }else {
                return 0;
            }
        });
    }

}
