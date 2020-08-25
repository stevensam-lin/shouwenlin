package com.soso.algorithm.interview;

import org.junit.Test;

/**
 * author:seven lin
 * date:2020/8/25 15:35
 * description:
 * 查询A字符串是否是B字符串通过一次或多次“跑马灯”转换得出的字符串的子串
 * “跑马灯”转换：字符串大小不变的情况下，字符串的最后一个字符拼接到第一个字符位置，此过程称为“跑马灯”转换；
 *                  如‘abc’通过一次“跑马灯”转换即变成‘cab’
 **/
public class HorseRaceLampString {

    @Test
    public void horseRaceLampString(){
        //定义两个字符串A和B
        String aStr = "abcd";
        String bStr = "cddaab";
        //bcddaa abcdda aabcdd daabcd ddaabc cddaab bcddaa
        System.out.println(aStr);
        System.out.println(bStr);
        if(bStr.contains(aStr)){
            System.out.println("原字符串包含有匹配的字符串！");
        }
        String str = bStr;
        //对B字符串进行转换循环，每次进行匹配判断
        for (int i =0;i < bStr.length()-1;i++){
            str = parseString(str);
            if(str.contains(aStr)){
                System.out.println("有匹配的字符串！");
                System.out.println("经过转换后能匹配的字符串：" + str);
                return;
            }
        }
        System.out.println("没有匹配的字符串！");
    }

    private String parseString(String bStr) {
        int lastIndex = bStr.length() - 1;
        String lastStr = bStr.substring(lastIndex);
        String firstStr = bStr.substring(0, lastIndex);
        return lastStr + firstStr;
    }

    @Test
    public void testStr(){
        String a = "a";
        String b = "b";

        swapString(a ,b);
        System.out.println(a);
        System.out.println(b);
    }
    private void swapString(String a , String b){
        String temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println(temp);
        System.out.println(a);
        System.out.println(b);
    }
}
