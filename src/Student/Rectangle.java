package Student;

public class Rectangle {
    int width;
    int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    public double getArea(){
        return this.height * this.width;
    }
    public double getPerimeter(){
        return (this.height + this.width) * 2;
    }
    public String display(){
        return "Hình có chiều dài là:" + this.height +":" + "có chiều rộng là :" + this.width;
    }
}
