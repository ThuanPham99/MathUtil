/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathutil;

/**
 *
 * @author minh2
 */
import static min.util.MathUtil.computeFactorial;

public class MathUtil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("5! = " + computeFactorial(5));
        // đoạn code trên chình là test hàm bằng tay, manual test
        //tức là:
        // ta chuẩn bị data để test, chính là số 5 đầu vào
        //ta gọi hàm cF(5)
        //ta chạy hàm, ta xem nó in ra số mấy (actual value)
        // tr đó ta phải tự tính 5!, cái ta kì vọng hàm phải
        // trả về con số này, 120 là cái ta huy vọng hàm sẽ trả về cho 5!
        // gọi là expected value
        // hàm chạy xong ta so kết quả giửa expected va actual
        // nếu khớp nhau thì process đúng, vì xl đúng 
        // nếu ko or hàm sai or mình kì vọng sai
        // làm bằng tay thì ta phải so sánh bằng mắt để luận kết quả
        // trong giang hồ hỗ trợ thêm các bộ thư viện giúp ta test hàm ta viết 1 cách hiệu quả
        
    }
    
}
