package ra.btvn;

import java.util.Scanner;
import java.util.regex.Pattern;

public class bt {
    public static void main(String[] args) {
        //Nhập vào email và password và kiểm tra xem có đúng định dạng không
        //Chương trình chúng ta sẽ khai báo 2 biến đại diện cho email và password
        //Chúng ta sẽ dùng regex để kiểm tra email
        //Regex với email thì phải đúng định dạng
        //Regex với password thì phải không có dấu cách (space) và phải lơn hơn 6 kí tự

        Scanner sc = new Scanner(System.in);

        //Xây dựng mẫu regex cho email
        do{
            String regexEmail = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
            String regexPassword = "^(?=\\S+$).{6,}$";

            //^ bắt đầu chuỗi
            //$ kết thúc chuỗi
            //(?=\\S+$) không có khoảng trắng
            //.{6,} 6 kí tự trở lên
            //String password = "123 456";

            System.out.println("Nhập vào email:");
            String email = sc.nextLine();

            System.out.println("Nhập mật khẩu:");
            String password = sc.nextLine();

            if (Pattern.matches(regexEmail, email) && Pattern.matches(regexPassword, password)) {
                System.out.println("Đúng định dạng");
                break;
            }else{
                System.out.println("Sai định dạng");
            }
        }while(true);
    }
}
