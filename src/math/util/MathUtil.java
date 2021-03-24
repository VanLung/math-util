/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math.util;

import com.lungcomputer.MathUtility;

/**
 *
 * @author By Van Lung, IDStudent: SE140193
 */
public class MathUtil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long expected = 120; //tui hy vọng 120 là giá trị trả về
        int n = 5; //nếu tui tính 5!
        long actual = MathUtility.getFactorial(n);
        //actual : Cái value hàm thự sự trả về
        //ta đi so sánh = mắt để luận xem hàm ta viết chạy đúng hay ko
        System.out.println("5!: Expected: " + expected
                + "; Actual: " + actual);

        //tình huống test số 2, 0! xem sao?
        //TÌNH HUỐNG TEST, TÌNH HUỐNG XÀI, GỌI LÀ TEST CASE
        n = 0;
        expected = 1;
        actual = MathUtility.getFactorial(n);
        System.out.println("5!: Expected: " + expected
                + "; Actual: " + actual);

//        System.out.println("Hello GitHub.");
//        System.out.println("This is 1st upload connects to remote GitHub server");
    }

}

//Trong quy trình lập trình chuyên nghiệp/ ở các công ty,đặc biệt là làm cho Japan
//Mọi hàm, class bạn viết ra đều phải test kỹ càng trước khi ghép
//nó vào trong các cụm tính năng, và ghép với UI, Back-end
//Làm sao để test các hàm, các class
//Dân dev có nhiều cách
//Cách 1: sout (Kết quả xử lí của hàm)
//Cách 2:JOptionPane(pop-up lên kết quả xử lí của hàm) bên trong Java Desktop
//Cách 3: Ghi vào LOG file trong môn Java Web, hay in kết quả xử lí ra 1 trang web 
//tạm nào đó
//Với 3 cách này, ta gọi hàm , nhìn kết quả trả về của hàm - ACTUAL VALUE
//và ta ngầm so sánh với kết quả mà ta tự tính toán trước đó
//khi chưa gọi hàm -i ta gọi là GIÁ TRỊ KÌ VỌNG -EXPECTED VALUE
//nếu EXPECTED VALUE = ACTUAL VALUE (thực tế và kì vọng khớp nhau)
//Á ĐÙ , HÀM CHẠY ĐÚNG
//nếu không bằng, ĐÙ, HÀM XỬ LÍ SAI
//3 CÁCH TRÊN ĐÒI HỎI DEV PHẢI DÙNG MẮT ĐỂ LUẬN KẾT QUẢ ĐÚNG SAI
//nhiều test case cần phải test, ta rất dễ bỏ sót, nhìn sai kết quả
//Kỹ thuật test như trên gọi là  manual test
//test khi code vừa mới xong từng hàm gọi là unit test

//Còn cách xịn xò thứ 4
//ta ko cần nhìn = mắt từng trường hợp sử dụng hàm
//ta nhờ máy so sánh giùm actual với expected luôn
//và nếu tất cả các trường hợp đều khớp bằng nhau, ném ra 1 màu xanh
//nếu  hầu hết đều khớp, chỉ có ít nhất 1 cái k khớp, hà k ổn định
//nếu ra màu đỏ-> cảnh báo có trục trặc
//lúc này ta chỉ cần nhìn màu, k cần luận từng kết quả
//kỹ thuật này gọi là test driven development + test automation
// vừa viết code vừa viết test       tự động hóa việc test

//Muonos làm được điều này, ta cần thêm thư viện phụ trợ để tung ra màu
//Thư viện này đều có tương ứng ở các ngôn ngữ lập trình
//JAVA :JUnit, TestNG...
//C#: NUnit,xUnit,MSTest
//PHP: PHPUnit
//....

