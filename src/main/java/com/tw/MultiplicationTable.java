package com.tw;

public class MultiplicationTable {
    public String create(int startNum, int endNum) {
        boolean isValid  = isValid(startNum, endNum);
        String printMultiplicationTable = printMultiplicationTable(startNum, endNum);
        return isValid ? printMultiplicationTable : null;
}

    public boolean isValid(int startNum, int endNum){
        boolean isLessEqualEnd  = isLessEqualEnd(startNum, endNum);
        boolean isStartNumInRange  = isNumbersInRange(startNum);
        boolean isEndNumInRange  = isNumbersInRange(endNum);
        return isLessEqualEnd && isStartNumInRange && isEndNumInRange;
    }

    public boolean isLessEqualEnd(int startNum, int endNum){
        return startNum <= endNum;
    }
    public boolean isNumbersInRange(int num){
        return num >= 1 && num <=1000;
    }

    public String printMultiplicationTable(int startNum, int endNum){
        String multiplicationTable = "";
        for (int x = startNum; x <= endNum; x++){
            for(int y = startNum; y <=x; y++){
                multiplicationTable+= (y + "*" + x + "=" + y*x);

                if (x != y){
                    multiplicationTable+= "  ";
                }
            }
            multiplicationTable += "\r\n";
        }
        return multiplicationTable.trim();
    }
}
