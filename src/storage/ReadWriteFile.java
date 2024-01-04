package storage;

import model.Book;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteFile {
     public List<Book> readFile(){
             File file = new File("book.txt");
             try {
                 InputStream inputStream = new FileInputStream(file);
                 ObjectInputStream ois = new ObjectInputStream(inputStream);
                 List<Book> bookList = null;
                 bookList = (List<Book>) ois.readObject();
                 return bookList;
             } catch (ClassNotFoundException | IOException e) {
                 return new ArrayList<>();
             }

     }
     public void writeFile(List<Book> bookList){
         File file = new File("book.txt");
         try {
             OutputStream outputStream = new FileOutputStream(file);
             ObjectOutputStream oos = new ObjectOutputStream(outputStream);
             oos.writeObject(bookList);
             oos.close();
             outputStream.close();
         } catch (IOException e) {
             e.printStackTrace();
         }
     }


}
