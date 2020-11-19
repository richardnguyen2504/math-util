/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tricuong.util.test;

import org.junit.Test;
import static org.junit.Assert.*;
import tricuong.utility.MathUtility;

/**
 *
 * @author TriCuong
 */
public class MathUtilityTest {
    
   //minh se test cac tinh huong xai ham getFactorial() o day
    // tinh huong la tham so dua vao: 
    // tình huống xài hàm,test hàm gọi là TEST CASE
    // thành công: đưa vào value hợp lệ 0..26
    // thất bài: đưa vào âm, >20 toang
    //hàm phải bắt các tình huống này, và giờ test thử coi hàm xử lí đúng không
    @Test
    //Biền hàm thành public static void
    //Nhưng nói chung tên hàm sẽ bao gồm ngũ nghĩa kết quả trả về,tinhftrangj test
    // không giống quy tắc đặt hàm khi viết app
    //Mình đang viết code để test app
    
    public void getFactorial_RunsWell_IfValidArgument()  {
        assertEquals(120, MathUtility.getFactorial(5));
        // tôi muốn check có đúng là gọi hàm 5!thì trả về 120 hay không?
        //đúng thì xanh mà sai thì đỏ
         assertEquals(720, MathUtility.getFactorial(6));
         assertEquals(24, MathUtility.getFactorial(4));
         assertEquals(6, MathUtility.getFactorial(3));
         assertEquals(1, MathUtility.getFactorial(0));
         assertEquals(1, MathUtility.getFactorial(1));
         
         //asb
    }
    
    
}
//MẶC ĐỊNH CODE TEST ĐỘC LẬP CODE CHÍNH
//ĐỘC LAAOJ VỚI QUÁ TRÌNH CLEAN&BUILD, TỨC LÀ DÙ CODE BẠN XANH HAY ĐỎ
//MIỄN LÀ KHÔNG BỊ ERROR CÚ PHÁP
//BẠN LUÔN ĐÓNG GÓI BUILD RA ĐƯỢC FILE .JAR .WAR (CHẤP XANH ĐỎ)

//HỢP LOGIC THÌ MÀU XANH,TỨC LAMFHAMF CHUẨN THÌ MỚI NÊN RA ĐƯỢC .JAR .WAR
//VẬY TA CẦN CÓ 1 CÁCH GÀI XANH ĐỎ VÀO QUY TRÌNH BUILD .JAR.WAR
//CÁCH KHÁC: NẾU CODE TEST  ĐANG MÀU ĐỎ THÌ DISABLE CÁI NÚT BẤM CLEAN&BUILD
//độ lại file buld-imp.xml trong tabfile tại dòng 1204 đối vs 8.2RC thêm vào sai chữ complie là test