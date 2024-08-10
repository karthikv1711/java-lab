import java.util.Scanner;
class Rectangle {

	private double length;
  	private double width;
  	
  	public Rectangle(){
  		this.length = 5.0;
      	this.width = 3.0;  
  	}
  	
  	public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
  
  	public void resizeRectangle(double newLength, double newWidth){
  		this.length = newLength;
      		this.width = newWidth;
    }
  	
  	public double getLength() {
    	return length;
	}
  
  	public double getWidth() {
    	return width;
	}
  	
}
public class rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double newLength = scanner.nextDouble();
        double newWidth = scanner.nextDouble();

        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(newLength,newWidth);
        
      

        // Print rectangle dimensions
        System.out.println("Original Dimensions:"+"Length = "+r1.getLength()+" Width = "+r1.getWidth());
       System.out.println("Resized Dimensions : "+"Length = "+r2.getLength()+" Width = "+r2.getWidth());
       	    scanner.close();
    }
}
