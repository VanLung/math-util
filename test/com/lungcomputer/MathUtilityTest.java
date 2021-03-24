/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lungcomputer;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */
public class MathUtilityTest {
    //viết code để test code
    //ta sẽ viết những đoạn code ở đây để test cái hàm chính getFactorial()
    //bên MathUtility coi mày chạy có đúng k
    //viết code dể test code chính mình
    //đúng sai ở đây chúng tôi dùng màu sắc XANH ĐỎ
    @Test //biến hàm thường thành hàm main
    //shift f6 để chạy
    public void testFactorialGivenRightArgumentReturnsGoodResult(){
        
        int n = 5;
        long expected =120;
        long actual = MathUtility.getFactorial(n);
        assertEquals(expected, actual);
        //if khớp xanh, sai đỏ
               
    }
}
