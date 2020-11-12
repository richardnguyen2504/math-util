/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se1418.math.util;

import tricuong.utility.MathUtility;

/**
 *
 * @author Admin
 */
public class Se1418MathUtil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic here
        try {
            long result = MathUtility.getFactorial(-1);
            System.out.println("Result: " + result);
            //expected: 120 ,   actual: 
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
        //Code viết ra thì Developer phải test trước 
        //có vài hình thức test code khác nhau
    //1. TDD,Test Driver Development
        //Viết dàn khung của hàm getFactorial(int n);
        //Sau đó dựng hàm test()
        //Chạy thử coi xanh đỏ, đó nghĩa là lỗi, xanh nghĩa là ổn
        //cứ iên tục xanh đỏ như thế trong quá trình viết code
        //và sửa code, người ta gọi là lập trình hướng theo thỏa mãn
        //việc test, TDD
    //2. sout(hàm kèm data) để coi kết quả ra sao, có đúng như mình kì vọng
        //nó phải trả về như thế hay không ==> xem kết quả test = mắt
    //3. JoptionPane của bên javadesktop để popup kết quả lên màn hình
        //vẫn xem = mắt
    //4. Viết 1 trang web gọi hàm xử lí ...,hao sức quá

    //ta chơi cách 1 và 2
