/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package min.util;

/**
 *
 * @author minh2
 */
//Class chứa hàm tính toán, mục tiêu xài chung cho các nơi khác
//Xài chung cho các nơi -> STATIC
public class MathUtil {
    //Tính n! = 1.2.3.4.n (n<=15)
    public static long computeFactorial(int n){
        
        long result = 1;
        
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        
        return result;
    }
}
