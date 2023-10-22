package Student;

import sun.util.resources.LocaleData;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import java.util.Scanner;

public class stopWatch {

//    private long startTime;
//    private long endTime;
//
//
//    public stopWatch(long startTime, long endTime) {
//        this.startTime = startTime;
//        this.endTime = endTime;
//    }
//
//    public stopWatch() {
//
//    }
//
//    public void start(){
//        this.startTime = System.currentTimeMillis() / 1000;
//    }
//    public void stop(){
//        this.endTime = System.currentTimeMillis() / 1000;
//    }
//    public long tinhGio(){
//        return this.endTime- this.startTime;
//    }
//
//    public static void main(String[] args) {
//        stopWatch stopWatch= new stopWatch();
//
//        Scanner input = new Scanner(System.in);
//        int a = input.nextInt();
//        if (a == 1){
//            stopWatch.start();
//        }
//        int b = input.nextInt();
//        if (b == 2){
//            stopWatch.stop();
//        }
//        System.out.println("so giay tinh duoc la :" + stopWatch.tinhGio() + "giay");
//    }


    private long startTime;
    private long endTime;

    public stopWatch(long startTime, long endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public stopWatch() {

    }

    public void start(){
        this.startTime = System.currentTimeMillis() / 1000;
    }
    public void stop(){
        this.endTime = System.currentTimeMillis() / 1000;
    }
    public long tinhGio(){
        return this.endTime - this.startTime;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        stopWatch dongHo = new stopWatch();
        int a = input.nextInt();
        if (a == 1){
            dongHo.start();
        }
        int b = input.nextInt();
        if ( b == 2){
            dongHo.stop();
        }
        System.out.println(dongHo.tinhGio());
    }
}

