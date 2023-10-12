package com.kanenguyen.mathutil.main;

import com.kanenguyen.mathutil.core.MathUtility;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Production
 */
public class Main {
    public static void main(String[] args) {
        //Test case #1 - Xem chi tiết ở dưới (case: n = 0 |0!)
        int n = 0; // tình huống kiểm tra 0!
        long expected = 1;// 0! hy vọng là 1, ko cần lập trình cũng ra kết q này
        long actual = MathUtility.getFactorial(n); //0! thực tế là mấy, gọi hàm về run là biết ngay
        
        //so sánh giữa expected == actual hay ko??
        System.out.println("0! -> expected = " + expected +
                                " \n\tactual = " + actual);
        
        //cách 1: kiểm thử - sức người: mắt nhìn, não nghĩ
        
        //test case #2 - mô tả ở dưới
        n = 1;
        expected = 1;
        actual = MathUtility.getFactorial(n); //0! thực tế là mấy, gọi hàm về run là biết ngay
        
        //so sánh giữa expected == actual hay ko??
        System.out.println("1! -> expected = " + expected +
                                " \n\tactual = " + actual);
        
        //test case #3 - mô tả ở dưới, dùng n = 5
        System.out.println("5! -> expected = 120" +
                                " \n\tactual = " + MathUtility.getFactorial(5));
        
    }
}
//DEv phải test code của mình, có 3 cách
        //sau đây là cách 1: in kết quả xử lí của hàm ra màn hình
        
        //nhắc lại: công việc của QC bao gồm
        //thiết kế test case, run test case, ghi lại bug nếu có
        //         test case, test run                 log bug -> BugZilla, Jira
        //test case: nói ra bạn sẽ test app thế nào
        //bằng cách đưa vào data, giá trị kì vọng, và cách dùng app
        //với bộ data đó ntn
        // lát rồi run thử app xem sao!!! -> Test Run
        
        //ĐỀ THI PE: Thiết kế test case
        //Ta thiết kế test case để test hàm tính giai thừa ta vừa viết
        //test code thì được gọi là unit test
        //test case cho unit test thì gọi là "Unit test" Test case
        //TEST CASE #1: Check getFactorial() with n = 0
        //STEPs/PROCEDURES:
        //  1. Given n = 0;
        //  2. Invoke/call getFactorial(n = 0)

        //Expected Result: the method returns 1 stand for 0! = 1
        //Status         : PASSED or FALLED ? => lúc chạy hàm
        //                                       mới biết kết quả, 
        //                                       gọi là testrun. có thể 
        //                                       test đi test lại nhiều lần
        
        //TEST CASE #2: Check getFactorial() with n = 1
        //STEPs/PROCEDURES:
        //  1. Given n = 1;
        //  2. Invoke/call getFactorial(n = 1)

        //Expected Result: the method returns 1 stand for 1! = 1
        //Status         : PASSED or FALLED ? - to be updated later,
        //                                      when finishing TEST RUN.
        
        //TEST CASE #3: Check getFactorial() with n = 5
        //STEPs/PROCEDURES:
        //  1. Given n = 5;
        //  2. Invoke/call getFactorial(n = 5)

        //Expected Result: the method returns 120 stand for 5! = 120
        //Status         : PASSED or FALLED ? - to be updated later,
        //                                      when finishing TEST RUN.
