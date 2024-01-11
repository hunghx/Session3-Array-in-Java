package ra;

import java.util.Arrays;

public class Demo {
    // phương thức khởi tạo
    public Demo(){

    }
    public static void main(String[] args) {
        // hàm dùng để chạy chương trình
        // khai báo mang tường minh
        int[] arrayName = {1,2,3,4,5};

        // bản chất của String là 1 char[]
        // khai bao theo dộ dài
        int[] array = new int[10];// tất cả các phần tử trong mảng
        // này sẽ mang giá trị mặc định
        System.out.println(Arrays.toString(array));
        // truy cập và thay đổi giá trị của phần tử theo index
        array[3] = 100;
        System.out.println("Phần tử có index là 3 = "+array[3]);
        Demo demo = new Demo();

        // kiêm tra snt
        System.out.println(checkPrime(4));
        System.out.println(checkPrime(99));
        System.out.println(checkPrime(101));
        System.out.println(checkPrime(89));
        boolean check = checkPrime(392098948);


    }
    // tạo hàm để kiểm tra số nguyên tố : tham số , kiểu trả về
    public static boolean checkPrime(int number){ // phương thức
        for (int i =2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        // kiếm tra xem có  < 2
        return number>=2;
    }
    public void display(){

    }

    // tạo ra các hàm, phương thức để
    // 1 . thêm mới 1 giá trị vào mảng số nguyên và trả về mảng mới (2 tham số, mảng và giá trị cần thêm)
    // 2 . xóa 1 phần tử tại vị trí chỉ định trong mảng và trả về mảng sau khi đã đã

}
