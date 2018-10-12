package com.lzjlxebr.util;

import android.content.Context;

/**
 * @author lzjlxebr
 * @since 2018/10/12
 */
public class NumberChecker {

    public static final String PLUS = "+";
    public static final String SUBTRACT = "-";
    public static final String MULTIPLY = "×";
    public static final String DIVIDE = "÷";
    public static final String EQUALS = "=";


    public static final String POINT = ".";

    public static boolean check(String text, String alreadyAppendedText, Context context){
        // 检测小数点，要符合小数的规范
        if (POINT.equals(text) && alreadyAppendedText.contains(".")) {
            ToastToaster.toast(context, "已经包含小数点了");
            return false;
        }

        //  检测长度，默认不超过20
        if (alreadyAppendedText.length() > 30) {

            ToastToaster.toast(context, "已经超过30个数字了（包含小数点）");
            return false;
        }

        // 检测负号
        if("-".equals(alreadyAppendedText)){
            if(alreadyAppendedText.indexOf("-") == 0){
                return false;
            }
        }

        return true;
    }

    /**
     *
     * @param text
     * @return
     */
    public static boolean isNumber(String text){

        return "0".equals(text)
                || "1".equals(text)
                || "2".equals(text)
                || "3".equals(text)
                || "4".equals(text)
                || "5".equals(text)
                || "6".equals(text)
                || "7".equals(text)
                || "8".equals(text)
                || "9".equals(text);
    }
}
