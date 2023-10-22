package Student;

import java.util.Enumeration;
import java.util.Scanner;

public class AccountBank {
    private String name;
    private String email;
    private String phone;
    private int money;

    public AccountBank(String name, String email, String phone, int money) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.money = 0;
    }

    public String getInfo() {
        return "tên chủ tài khoản :" + this.name + "email :" + "SDT" + this.phone;

    }
    public String deposit(int number){
        this.money += number;
        return "nạp tiền thành công";
    }
    public String withDrawMoney(int number){
        if (this.money >= number){
            this.money -= number;
            return "rút tiền thành công";
        }
        return "tài khoản không đủ tiền";

    }
    public int getMoney(){
        return money;
    }

    public static void main(String[] args) {
        AccountBank minhson = new AccountBank("Son", "minhsonle0507","0977710990",1000000);

        Scanner input = new Scanner(System.in);
        int a = input.nextInt();

        System.out.println("------Menu------");
        System.out.println("1.lấy thông tin chủ tk ngân hàng");
        System.out.println("2.nạp tiền");
        System.out.println("3.rút tiền");
        System.out.println("4.Thoát");

        switch (a){
            case 1:
                minhson.getInfo();
                break;
            case 2:
                
        }
    }
}
