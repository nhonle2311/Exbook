import manager.ManagerBook;
import model.Book;
import model.Fictionbook;
import model.ProgrammingBook;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(ManagerBook.books);
        Book book = createBook();
        ManagerBook.addBook(book);
        System.out.println(ManagerBook.books);

    }
    public static Book createBook(){
        // code, name, price, author
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Enter book code: ");
        String bookCode = scanner.nextLine();
        System.out.println("Enter book name: ");
        String name = scanner.nextLine();
        System.out.println("Enter book price: ");
        double price = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Enter book author: ");
        String author = scanner.nextLine();
        System.out.println("Enter book type: ");
        System.out.println("1. Fiction book");
        System.out.println("2. Programming book");
        int choice = 0;
        switch (choice){
            case 1:
                // fiction book
                System.out.println("Enter book category: ");
                String category = scanner.nextLine();
                return new Fictionbook(bookCode, name, price, author, category);
            case 2:
                // programming book
                System.out.println("Enter book language: ");
                String language = scanner.nextLine();
                System.out.println("Enter book framework: ");
                String framework = scanner.nextLine();
                return new ProgrammingBook(bookCode, name, price, author, language, framework);
            default:
                return null;
        }
    }
}