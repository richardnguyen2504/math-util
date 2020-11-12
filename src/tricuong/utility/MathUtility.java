package tricuong.utility;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class MathUtility {
    public static final double PI=3.1415;
    public static long getFactorial(int n){
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("n must be >= 0 & <= 20");
        //bắt lỗi input
        if (n == 0 || n == 1)
            return 1; //0! 1! = 1
        
        long result = 1;
        
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
//Math.sqrt(), .pow
