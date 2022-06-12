package inheritsample;


class Shape {
    String ObjectName="";
    Shape(String name) {
        this.ObjectName=name;
    }
    public void PrintName() {
        System.out.println("The shape is ==> "+ObjectName);
    }
}
