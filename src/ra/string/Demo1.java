package ra.string;

public class Demo1 {
    public static void main(String[] args) {
        //Khai báo chuỗi
        String name = "Trần Mai";

        //Gán lại tên
        name = "Mai Trần";

        System.out.println(name);

        //Các phương thức làm việc với chuỗi
        //So sánh: equals trả về true nếu 2 chuỗi bằng nhau, false nếu 2 chuỗi không bằng nhau
        String str1 = "Nguyễn Thị Mai";
        String str2 = "Nguyễn Thị Mai";
        System.out.println("So sánh chuỗi với equals: " + str1.equals(str2));

        //Trả về độ dài của kí tự
        System.out.println("str1 có độ dài là: " + str1.length());

        //Viết hoa toàn bộ kí tự
        String str3 = "mai";
        System.out.println(str3.toUpperCase());

        //Nối 2 chuỗi
        System.out.println("Cộng chuỗi 1 với chuỗi 2: " +str1.concat(str2));

        //Cắt khoảng trắng 2 đầu
        String str4 = " mai ";
        str4 = str4.trim();
        System.out.println(str4.length());

        //Kiểm tra 1 chuỗi có nằm trong 1 chuỗi khác hay không
        String str5 = "mai";
        String str6 = "nguyen thi mai";
        System.out.println("Chuỗi str5 tồn tại trong chuỗi str6 không: " + str6.contains(str5));

        //So sánh sử dụng compareTo (chênh lệch giá trị ký tự)
        String str7 = "Rikkei Education";
        String str8 = "Rikkei";
        System.out.println(str7.compareTo(str8));

        //Tìm kiếm và thay thế
        System.out.println(str7.replace("Education", "Academy"));

        //Thay thế tất cả
        System.out.println(str8.replaceAll("Rikkei", "R"));

        //startsWith kiểm tra chuỗi đầu có phải là giá trị truyền vào không
        String str9 = "B111";
        System.out.println(str9.startsWith("B"));


    }
}
