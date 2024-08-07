//Basic manipulation of objects
//Create a simple class representing a Book and demonstrate passing an object of class to a method
class Book {
	
	String title;
	String author;
	double  price;
	
	Book(String title,String author,double  price){
	
		this.title = title;
		this.author = author;
		this.price = price;
	
	}
	
	String getTitle(){
	
		return title;
	
	}
	
	String getAuthor(){
	
		return author;
	
	}
	
	double getPrice(){
		return price;
	}
	void displaybookinfo(Book book){
		System.out.println("Title :"+getTitle());
		System.out.println("Author:"+getAuthor());
		System.out.println("Price : $"+getPrice());
	}

}



public class task1{

	public static void main(String[] args){
	
	Book book = new Book("Effective Java","Joshua Bloch",45.00);
	
	book.displaybookinfo(book);
	
		}

} 

