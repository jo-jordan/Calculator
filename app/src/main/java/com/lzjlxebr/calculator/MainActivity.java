package com.lzjlxebr.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

/**
 * 思路：
 * 1、用户每次点击运算操作符时，即会运算一次
 * 2、每次输入的数字长度为20
 */
public class MainActivity extends AppCompatActivity {

    /**
     * 主显示区域
     */
    private TextView mTvCalculatorArea;

    /**
     * 运算结果显示区域，虽然这有点多余吧
     */
    private TextView mTvResult;

    /**
     * 数字键1
     */
    private Button mBtn1;

    /**
     * 数字键2
     */
    private Button mBtn2;

    /**
     * 数字键3
     */
    private Button mBtn3;

    /**
     * 数字键4
     */
    private Button mBtn4;

    /**
     * 数字键5
     */
    private Button mBtn5;

    /**
     * 数字键6
     */
    private Button mBtn6;

    /**
     * 数字键7
     */
    private Button mBtn7;

    /**
     * 数字键8
     */
    private Button mBtn8;

    /**
     * 数字键9
     */
    private Button mBtn9;

    /**
     * 数字键0
     */
    private Button mBtn0;

    private Button mBtnPoint;


    private Button mBtnEquals;

    private Button mBtnPlus;

    private Button mBtnMinus;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
