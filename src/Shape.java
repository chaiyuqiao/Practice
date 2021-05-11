abstract class Shape {
    double Area=10;
    abstract double getArea();
}
class Circle extends Shape{
    @Override
    double getArea() {
        System.out.println("圆形的面积为"+this.Area);
        return this.Area;
    }
}
class Square extends Shape{
    @Override
    double getArea() {
        System.out.println("正方形的面积为"+this.Area);
        return this.Area;
    }
}
class Rectangle extends Shape{
    @Override
    double getArea() {
        System.out.println("长方形的面积为"+this.Area);
        return this.Area;
    }
}
class last {
    public static void main(String args[]){
        Circle c=new Circle();
        c.getArea();
        Square s=new Square();
        s.getArea();
        Rectangle r=new Rectangle();
        r.getArea();
    }
}

