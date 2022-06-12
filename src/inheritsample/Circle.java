package inheritsample;

class Circle extends Shape{
    double pi=3.14;
    int radius;
    Circle(String name, int radius) {
        super(name);
        this.radius=radius;
    }
    
    double area() {
        return pi*radius*radius;
    }
}
