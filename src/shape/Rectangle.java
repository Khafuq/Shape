package shape;

/**
 *
 * @author
 */
public class Rectangle {

    private int length; 
    private int breadth; 
    
    public Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }
    
    public int getArea() { 
        return length*breadth; // write code to calculate area here
    } 
    
    //getperimeter()
    public int getPerimeter(){
        return (2*length) + (2*breadth);
    }
    // write code to calculate perimeter here
    // getPerimeter()

    String getPrimeter() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}