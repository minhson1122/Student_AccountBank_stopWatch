//package Student;
//
//public class Student {
//    String name;
//    int age;
//    double scoreT;
//    double scoreL;
//    double scoreH;
//
//    public Student(String name, int age, double scoreT, double scoreL, double scoreH) {
//        this.name = name;
//        this.age = age;
//        this.scoreT = scoreT;
//        this.scoreL = scoreL;
//        this.scoreH = scoreH;
//    }
//    public String getInfo(){
//        return "tên student" + this.name + " tuổi" + this.age;
//    }
//    public String getRank( ){
//        double midScore = getMidScore();
//        if (midScore > 8){
//            return "good";
//        }
//        if (midScore >= 6){
//            return "TB";
//        }
//        return "yeu";
//    }
//
//    private double getMidScore() {
//        return (this.scoreH + this.scoreL + this.scoreT) / 3;
//    }
//}
