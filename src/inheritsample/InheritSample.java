package inheritsample;

public class InheritSample {

    public static void main(String[] args) {
        Rectangle r=new Rectangle("Rectangle", 12, 10);
        r.PrintName();
        System.out.println(r.area());
        
        Circle c=new Circle("Circle", 12);
        c.PrintName();
        System.out.println(c.area());
    }
    
}
