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
            if(isInteger(intInput) == true){
                System.out.println("Số nguyên: " + intInput);
            }else{
                System.out.println("Số nguyên: " + isInteger(intInput) + " vui lòng nhập lại");
            }
        } while (isInteger(intInput) == false);
        String floatInput;
        do {
            // Kiểm tra số thực float
            System.out.print("Nhập số thực float: ");
            floatInput = sc.nextLine();
            if(isFloat(floatInput) == true){
                System.out.println("Số thực float: " + floatInput);
            }else{
                System.out.println("Số thực float: " + isFloat(floatInput) + " vui lòng nhập lại");
            }
        } while (isFloat(floatInput) == false);
        do{
            // Kiểm tra số thực double
            System.out.print("Nhập số thực double: ");
            floatInput = sc.nextLine();
            if(isDouble(floatInput) == true){
                System.out.println("Số thực double: " + floatInput);}
                else{
                    System.out.println("Số thực double: " + isDouble(floatInput) + " vui lòng nhập lại");
                }
        }while(isDouble(floatInput) == false);
        do{
            // Kiểm tra boolean
            System.out.print("Nhập boolean: ");
            floatInput = sc.nextLine();
            if(isBoolean(floatInput) == true){
                System.out.println("boolean: " + floatInput);
            }else{
                System.out.println("boolean : " + isBoolean(floatInput) + " vui lòng nhập lại");
            }
        }while(isBoolean(floatInput) == false);
        do{
            // Kiểm tra chuỗi
            System.out.print("Nhập chuỗi: ");
            floatInput = sc.nextLine();
            if(isValidString(floatInput, 1, 10) == true){
                System.out.println("chuỗi: " + floatInput);
            }else{
                System.out.println("chuỗi : " + isValidString(floatInput, 1, 10) + " vui lòng nhập lại");
            }
        }while(isValidString(floatInput, 1, 10) == false);
        do{
            // Kiểm tra email
            System.out.print("Nhập email: ");
            floatInput = sc.nextLine();
            if(isValidEmail(floatInput) == true){
                System.out.println("email: " + floatInput);
            }else{
                System.out.println("email : " + isValidEmail(floatInput) + " vui lòng nhập lại");
            }
        }while(isValidEmail(floatInput) == false);
        do{
            // Kiểm tra số điện thoại
            System.out.print("Nhập số điện thoại: ");
            floatInput = sc.nextLine();
            if(isValidPhone(floatInput) == true){
                System.out.println("số điện thoại: " + floatInput);
            }else{
                System.out.println("số điện thoại : " + isValidPhone(floatInput) + " vui lòng nhập lại");
            }
        }while(isValidPhone(floatInput) == false);
        sc.close();
    }
}
