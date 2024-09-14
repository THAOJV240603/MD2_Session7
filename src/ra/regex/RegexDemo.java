package ra.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexDemo {
    public static void main(String[] args) {
        //Chuỗi mẫu
        String stringRegex = "x";
        //Chuỗi so khớp
        String string = "a";
        System.out.println("So khớp không: " + Pattern.matches(stringRegex, string));

        System.out.println("So khớp là ab hoặc cd: " + Pattern.matches("(ac|bc)", "ac"));

        System.out.println("Ký tự a hoặc b hoặc c: " + Pattern.matches("[abc]", "a"));

        System.out.println("Bất cứ ký tự nào khác a và b và c: " + Pattern.matches("[^abc]", "b"));

        //Chỉ được viết chữ
        System.out.println("Các ký tự từ a đến z: " + Pattern.matches("[a-z]", "2"));

        //Chỉ được viết số
        System.out.println("Từ 0 - 9: " + Pattern.matches("[0-9]", "5"));

        //Xây dựng mẫu regex cho sđt di động ở Việt Nam
        //0339513657

        Scanner sc = new Scanner(System.in);

        //Nhập khi nào đúng thì thôi, vòng lặp while
        do{
            //Bắt đầu bằng số 0, số thứ 2 phải là [3,7,8,9], 8 số đằng sau từ 0-9
            //String phoneRegex = "[0][3|7|8|9][0-9]{8}";
            //[0-9] = [\\d] Là một số tương đương [0-9]
            String phoneRegex = "[0][3|7|8|9][\\d]{8}";
            System.out.println("Nhập vào số điện thoại:");
            String phone = sc.nextLine();
            if (Pattern.matches(phoneRegex, phone)) {
                System.out.println("Đúng định dạng");
                break;
            }else{
                System.out.println("Sai định dạng");
            }
        }while(true);

        //Xây dựng mẫu regex cho email
        do{
            //String regexEmail = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
            String regexEmail = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
            System.out.println("Nhập vào email:");
            String email = sc.nextLine();
            if (Pattern.matches(regexEmail, email)) {
                System.out.println("Đúng định dạng");
                break;
            }else{
                System.out.println("Sai định dạng");
            }
        }while(true);

    }
}
