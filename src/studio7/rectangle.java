import edu.princeton.cs.introcs.StdDraw;

public class rectangle {
    private double length;
    private double width;
    private double area;
    private double perimeter;
    private boolean isSquare;
    public rectangle(double inlength, double inwidth){
      length = inlength;
      width = inwidth;
        area = length * width;
        perimeter = 2 * length + 2 * width;
        if (length == width){
           isSquare = true;
        }
    }
    public String toString(){
       return "length: " + length + ", width: " + width + ", area: " + area + ", perimeter: " + perimeter;
    }
    public static void main(String[] args) {
        rectangle r1 = new rectangle(60, 4);   
        System.out.println(r1);
        rectangle r2 = new rectangle(5, 5);
        System.out.println(r2);
        if (r1.area < r2.area){
            System.out.println("r1 is smaller");
        }
    }
}
