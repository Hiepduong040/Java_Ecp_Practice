package presentation;

import java.util.Scanner;
import static util.Validator.*;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String intInput;
        do {
            // Kiểm tra số nguyên
            System.out.print("Nhập số nguyên: ");
            intInput = sc.nextLine();
            System.out.println("Số nguyên: " + isInteger(intInput) + "vui lòng nhập lại");
        } while (isInteger(intInput) == false);
        String floatInput;
        do {
            // Kiểm tra số thực float
            System.out.print("Nhập số thực float: ");
            floatInput = sc.nextLine();
            System.out.println("float : " + isFloat(floatInput) + "vui lòng nhập lại");
        } while (isFloat(floatInput) == false);
        do{
            // Kiểm tra số thực double
            System.out.print("Nhập số thực double: ");
            floatInput = sc.nextLine();
            System.out.println("double : " + isDouble(floatInput) + "vui lòng nhập lại");
        }while(isDouble(floatInput) == false);
        do{
            // Kiểm tra boolean
            System.out.print("Nhập boolean: ");
            floatInput = sc.nextLine();
            System.out.println("boolean : " + isBoolean(floatInput) + "vui lòng nhập lại");
        }while(isBoolean(floatInput) == false);
        do{
            // Kiểm tra chuỗi
            System.out.print("Nhập chuỗi: ");
            floatInput = sc.nextLine();
            System.out.println("chuỗi : " + isValidString(floatInput, 1, 10) + "vui lòng nhập lại");
        }while(isValidString(floatInput, 1, 10) == false);
        do{
            // Kiểm tra email
            System.out.print("Nhập email: ");
            floatInput = sc.nextLine();
            System.out.println("email : " + isValidEmail(floatInput) + "vui lòng nhập lại");
        }while(isValidEmail(floatInput) == false);
        do{
            // Kiểm tra số điện thoại
            System.out.print("Nhập số điện thoại: ");
            floatInput = sc.nextLine();
            System.out.println("số điện thoại : " + isValidPhone(floatInput) + "vui lòng nhập lại");
        }while(isValidPhone(floatInput) == false);
        sc.close();
    }
}