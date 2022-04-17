package com.soshi.memo.dto;

public class SoshiDto {
    private int testId;
    private String testName;

    public SoshiDto (){
        
    }

    public SoshiDto(int testId, String testName) {
        this.testId = testId;
        this.testName = testName;
    }

    public int getTestId() {
        return testId;
    }

    public void setTestId(int testId) {
        this.testId = testId;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }
}
