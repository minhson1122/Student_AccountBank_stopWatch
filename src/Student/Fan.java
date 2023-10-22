package Student;

import java.util.Scanner;

public class Fan {
    int speed = 1;
    boolean on;
    double radius = 5;
    String color = "blue";

    public Fan() {

    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }


    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if (on) {
            return "tốc độ" + this.speed + "cánh quạt" + this.radius + " màu" + this.color + "quạt bật";
        } else{
            return "tốc độ" + this.speed + "cánh quạt" + this.radius + " màu" + this.color + "quạt tắt";
        }
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan(3,true,10,"red");
        fan1.setOn(false);
        System.out.println(fan1);

    }


}
