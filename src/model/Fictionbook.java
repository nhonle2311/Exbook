package model;

public class Fictionbook extends Book{
    private String category;

    public Fictionbook() {
    }
    public Fictionbook(String category) {
        this.category = category;
    }

    public Fictionbook(String bookCode, String name, double price, String author, String category) {
        super(bookCode, name, price, author);
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Fictionbook{" +
                "category='" + category + '\'' +
                '}';
    }
}
