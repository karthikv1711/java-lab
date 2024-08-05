class Book {
     String title;
     String author;
     double price;
     int pages;

    public Book(String title, String author, double price, int pages) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getPages() {
        return pages;
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("Pages: " + pages);
        System.out.println();
    }
}

public class Library{
    public static void main(String[] args) {
        
        Book book1 = new Book("The Lord of the Rings", "J.R.R. Tolkien", 29.99, 1178);
        Book book2 = new Book("Pride and Prejudice", "Jane Austen", 14.99, 278);
        Book book3 = new Book("The Hitchhiker's Guide to the Galaxy", "Douglas Adams", 12.99, 212);

    
        book1.displayInfo();
        book2.displayInfo();
        book3.displayInfo();

        
        double totalPrice = book1.getPrice() + book2.getPrice() + book3.getPrice();
        System.out.println("Total price of all books: $" + totalPrice);
    }
}
/*Output:
Title: The Lord of the Rings
Author: J.R.R. Tolkien
Price: $29.99
Pages: 1178

Title: Pride and Prejudice
Author: Jane Austen
Price: $14.99
Pages: 278

Title: The Hitchhiker's Guide to the Galaxy
Author: Douglas Adams
Price: $12.99
Pages: 212

Total price of all books: $57.97
*/

