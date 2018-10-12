package com.lzjlxebr.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.lzjlxebr.bean.Calculate;
import com.lzjlxebr.util.NumberChecker;
import com.lzjlxebr.util.Operator;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

/**
 * @author lzjlxebr
 * @since 2018/10/12
 * <p>
 * 运算过程中操作的对象
 * 思路：
 * 1、用户每次点击运算操作符时，即会运算一次
 * 2、每次输入的数字长度为20
 * 3、把第一次操作符被点击前的所有数字定为第一次数字，以此类推
 * 4、输入第一次数字时检查正常的数字规则即可
 * 5、输入第二次数字输入前要检查这是否为第二次数字，不是的话按照第一次的检查，是的话按照第二次的检查
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

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

    /**
     * 小数点
     */
    private Button mBtnPoint;

    /**
     * 获取结果，即等号
     */
    private Button mBtnEquals;

    /**
     * 加
     */
    private Button mBtnAdd;

    /**
     * 减
     */
    private Button mBtnSubtract;

    /**
     * 乘
     */
    private Button mBtnMultiply;

    /**
     * 除
     */
    private Button mBtnDivide;

    /**
     * 清除所有
     */
    private Button mBtnClear;

    /**
     * 运算中的操作对象
     */
    private Calculate calculate;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initComponent();

        initListener();

        initCalculateObject();
    }

    /**
     * 初始化运算中的操作对象
     */
    private void initCalculateObject() {
        calculate = new Calculate(new ArrayList<BigDecimal>(), new BigDecimal("0.0"), this);
    }

    /**
     * 初始化事件监听器
     */
    private void initListener() {
        mTvCalculatorArea.setOnClickListener(this);
        mTvResult.setOnClickListener(this);
        mBtn1.setOnClickListener(this);
        mBtn2.setOnClickListener(this);
        mBtn3.setOnClickListener(this);
        mBtn4.setOnClickListener(this);
        mBtn5.setOnClickListener(this);
        mBtn6.setOnClickListener(this);
        mBtn7.setOnClickListener(this);
        mBtn8.setOnClickListener(this);
        mBtn9.setOnClickListener(this);
        mBtn0.setOnClickListener(this);
        mBtnPoint.setOnClickListener(this);
        mBtnEquals.setOnClickListener(this);
        mBtnAdd.setOnClickListener(this);
        mBtnSubtract.setOnClickListener(this);
        mBtnMultiply.setOnClickListener(this);
        mBtnDivide.setOnClickListener(this);
        mBtnClear.setOnClickListener(this);
    }

    /**
     * 初始化所有页面中的组件
     */
    private void initComponent() {
        mTvCalculatorArea = findViewById(R.id.tv_main);
        mTvResult = findViewById(R.id.tv_result);
        mBtn1 = findViewById(R.id.button1);
        mBtn2 = findViewById(R.id.button2);
        mBtn3 = findViewById(R.id.button3);
        mBtn4 = findViewById(R.id.button4);
        mBtn5 = findViewById(R.id.button5);
        mBtn6 = findViewById(R.id.button6);
        mBtn7 = findViewById(R.id.button7);
        mBtn8 = findViewById(R.id.button8);
        mBtn9 = findViewById(R.id.button9);
        mBtn0 = findViewById(R.id.button0);
        mBtnPoint = findViewById(R.id.button_point);
        mBtnEquals = findViewById(R.id.button_go);
        mBtnAdd = findViewById(R.id.button_plus);
        mBtnSubtract = findViewById(R.id.button_minus);
        mBtnMultiply = findViewById(R.id.button_mul);
        mBtnDivide = findViewById(R.id.button_div);
        mBtnClear = findViewById(R.id.button_clear);
    }

    private int count = 0;


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tv_main: {
                break;
            }
            case R.id.tv_result: {
                break;
            }
            case R.id.button1: {
                appendNumberOrPointOrMinusOperatorToMainMonitor("1");
                break;
            }
            case R.id.button2: {
                appendNumberOrPointOrMinusOperatorToMainMonitor("2");
                break;
            }
            case R.id.button3: {
                appendNumberOrPointOrMinusOperatorToMainMonitor("3");
                break;
            }
            case R.id.button4: {
                appendNumberOrPointOrMinusOperatorToMainMonitor("4");
                break;
            }
            case R.id.button5: {
                appendNumberOrPointOrMinusOperatorToMainMonitor("5");
                break;
            }
            case R.id.button6: {
                appendNumberOrPointOrMinusOperatorToMainMonitor("6");
                break;
            }
            case R.id.button7: {
                appendNumberOrPointOrMinusOperatorToMainMonitor("7");
                break;
            }
            case R.id.button8: {
                appendNumberOrPointOrMinusOperatorToMainMonitor("8");
                break;
            }
            case R.id.button9: {
                appendNumberOrPointOrMinusOperatorToMainMonitor("9");
                break;
            }
            case R.id.button0: {
                appendNumberOrPointOrMinusOperatorToMainMonitor("0");
                break;
            }
            case R.id.button_point: {
                appendNumberOrPointOrMinusOperatorToMainMonitor(".");
                break;
            }
            case R.id.button_go: {
                option(Operator.EQUALS);
                break;
            }
            case R.id.button_plus: {
                option(Operator.ADDITION);
                break;
            }
            case R.id.button_minus: {
                option(Operator.SUBTRACTION);
                break;
            }
            case R.id.button_mul: {
                option(Operator.MULTIPLY);
                break;
            }
            case R.id.button_div: {
                option(Operator.DIVIDE);
                break;
            }
            case R.id.button_clear: {
                clearEverything();
                break;
            }
        }
    }


    /**
     * 把当前的数字或小数点或者符号添加到主显示区域
     *
     * @param text 当前点击的Button组件对应的文字信息
     */
    private void appendNumberOrPointOrMinusOperatorToMainMonitor(String text) {
        String alreadyAppendedText = mTvCalculatorArea.getText().toString();
        if (NumberChecker.check(text, alreadyAppendedText, this)) {
            mTvCalculatorArea.append(text);
        }
    }

    /**
     * 清除所有显示信息
     */
    private void clearEverything() {
        clearMainMonitor();
        clearResult();
        calculate.clear();
    }

    private void clearMainMonitor() {
        mTvCalculatorArea.setText("");
    }

    private void clearResult() {
        mTvResult.setText("");
    }

    private void setResult(String result) {
        mTvResult.setText(result);
    }

    private void option(Operator operator) {

        String text = mTvCalculatorArea.getText().toString();
        clearMainMonitor();

        if (TextUtils.isEmpty(text)) {

            calculate.setCurrentOperation(operator);

            return;
        }
        if (calculate.getNumbersSize() < 1) {
            BigDecimal currentNumber = new BigDecimal(text);
            calculate.saveNumberToObject(currentNumber);
            mTvResult.setText(text);
            calculate.setCurrentResult(currentNumber);
        } else {
            int numbersSize = calculate.getNumbersSize();
            BigDecimal prevResult = calculate.getCurrentResult();
            BigDecimal num1 = calculate.getNumberOf(numbersSize - 1);

            Operator prevOperator;
            prevOperator = calculate.getCurrentOperation();

            switch (prevOperator) {
                case ADDITION: {
                    prevResult = prevResult.add(num1);
                    calculate.setCurrentResult(prevResult);
                    mTvResult.setText(prevResult.toPlainString());
                    break;
                }
                case SUBTRACTION: {
                    prevResult = prevResult.subtract(num1);
                    calculate.setCurrentResult(prevResult);
                    mTvResult.setText(prevResult.toPlainString());
                    break;
                }
                case MULTIPLY: {
                    prevResult = prevResult.multiply(num1);
                    calculate.setCurrentResult(prevResult);
                    mTvResult.setText(prevResult.toPlainString());
                    break;
                }
                case DIVIDE: {
                    prevResult = prevResult.divide(num1, RoundingMode.CEILING);
                    calculate.setCurrentResult(prevResult);
                    mTvResult.setText(prevResult.toPlainString());
                    break;
                }
            }
        }
        calculate.setCurrentOperation(operator);
        if (operator == Operator.EQUALS) {
            clearMainMonitor();
            calculate.clear();
        }
    }
}
