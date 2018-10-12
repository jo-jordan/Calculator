package com.lzjlxebr.bean;

import java.math.BigDecimal;

/**
 * @author lzjlxebr
 * @since 2018/10/12
 *
 * 运算过程中操作的对象
 */
public class Calculate {
    /**
     * 所有输入的数字
     */
    private BigDecimal[] numbers;

    /**
     * 当前的操作符
     */
    private String currentOperation;

    /**
     * 当前的运算结果
     */
    private BigDecimal currentResult;

    public BigDecimal[] getNumbers() {
        return numbers;
    }

    public void setNumbers(BigDecimal[] numbers) {
        this.numbers = numbers;
    }

    public String getCurrentOperation() {
        return currentOperation;
    }

    public void setCurrentOperation(String currentOperation) {
        this.currentOperation = currentOperation;
    }

    public BigDecimal getCurrentResult() {
        return currentResult;
    }

    public void setCurrentResult(BigDecimal currentResult) {
        this.currentResult = currentResult;
    }
}
