package com.lzjlxebr.bean;

import android.content.Context;

import com.lzjlxebr.util.NumberChecker;
import com.lzjlxebr.util.Operator;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author lzjlxebr
 * @since 2018/10/12
 * <p>
 * 运算过程中操作的对象
 */
public class Calculate {
    /**
     * 所有输入的数字
     */
    private List<BigDecimal> numbers;

    /**
     * 当前的操作符
     */
    private Operator currentOperation;

    /**
     * 当前的运算结果
     */
    private BigDecimal currentResult;

    public boolean isCurrentStateOperation() {
        return isCurrentStateOperation;
    }

    public void setCurrentStateOperation(boolean currentStateOperation) {
        isCurrentStateOperation = currentStateOperation;
    }

    private boolean isCurrentStateOperation;

    private Context mContext;

    public Calculate(List<BigDecimal> numbers,BigDecimal currentResult, Context context) {
        this.numbers = numbers;
        this.mContext = context;
        this.currentResult = currentResult;
    }

    public List<BigDecimal> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<BigDecimal> numbers) {
        this.numbers = numbers;
    }

    public Operator getCurrentOperation() {
        return currentOperation;
    }

    public void setCurrentOperation(Operator currentOperation) {
        this.currentOperation = currentOperation;
    }

    public BigDecimal getCurrentResult() {
        return currentResult;
    }

    public void setCurrentResult(BigDecimal currentResult) {
        this.currentResult = currentResult;
    }

    /**
     * 存放数字
     *
     * @param bigDecimal
     */
    public void saveNumberToObject(BigDecimal bigDecimal) {
        numbers.add(bigDecimal);
    }

    /**
     * 检测当前是否已经操作了
     *
     * @return
     */
    public boolean isOperated() {
        return currentOperation != null;
    }

    /**
     * 第一次数字是否存在
     * @return
     */
    public boolean isFirstNumberExists() {
        return numbers.size() == 1;
    }

    /**
     * 获取最新的数字
     * @return
     */
    public String getTheLatestNumberToString() {
        return numbers.get(numbers.size() - 1).toPlainString();
    }

    /**
     * 获取当前是第几次数字
     * @return
     */
    public int getCurrentNumberInputTimes(){
        return numbers.size() - 1;
    }

    public int getNumbersSize(){
        return numbers.size();
    }

    public void addNumberToCurrentNumber(String subNumber){
        int index = getCurrentNumberInputTimes();
        if(NumberChecker.POINT.equals(subNumber)){
            subNumber += "0";
        }
        if(index == -1){
            numbers.add(new BigDecimal(subNumber));
            return;
        }

        String currentNumberStr = numbers.get(index).toPlainString();

        if(!NumberChecker.check(subNumber,currentNumberStr,mContext)){
            return;
        }
        currentNumberStr += subNumber;

        numbers.set(index, new BigDecimal(currentNumberStr));
    }

    public BigDecimal getNumberOf(int index){
        return numbers.get(index);
    }

    public void clear() {
        numbers = new ArrayList<>();
        currentOperation = null;
        currentResult = new BigDecimal("0");
    }
}
