package Student;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Person {
    String name;
    String birthday;

    public Person(String name, String birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public String getBirthday() {
        return birthday;
    }
    public int getAge(){
        int yearBirthday = getYearbirthDay();
        int currentYear = getCurrenYear();
        return currentYear - yearBirthday;
    }
    private int getCurrenYear(){
        LocalDate currenYear = LocalDate.now();
        return currenYear.getYear();
    }
    private int getYearbirthDay(){
        LocalDate yearBirthday = LocalDate.parse(this.birthday);
        return yearBirthday.getYear();
    }
    public String celebrateBirthday(){
        LocalDate dateBirthday = LocalDate.parse(this.birthday);
        int monthBirthday = dateBirthday.getMonthValue();
        int dayBirthday = dateBirthday.getDayOfMonth();

        LocalDate currentDate = LocalDate.now();
        int currrentMonth = currentDate.getMonthValue();
        int currentDay = currentDate.getDayOfMonth();
        int currentYear = getCurrenYear();

        if (currrentMonth == monthBirthday && currentDay >= dayBirthday || currrentMonth > monthBirthday){
            currentYear++;
        }
        return currentYear + " - " + monthBirthday + " - " + dayBirthday;
    }

    public static void main(String[] args) {
        Person person1 = new Person("Son" , "1998-07-05");
        System.out.println(person1.getName() + "-" + person1.getAge() + "tuoi");
        System.out.println("sinh nhat tiep theo la:" + person1.celebrateBirthday());
    }

}
