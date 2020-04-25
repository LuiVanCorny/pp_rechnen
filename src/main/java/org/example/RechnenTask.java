package org.example;

import java.util.Arrays;
import java.util.concurrent.RecursiveTask;

public class RechnenTask extends RecursiveTask<Integer> {

    private int[] intArray;

    public RechnenTask(int[] intArray) {
        this.intArray = intArray;
    }

    @Override
    protected Integer compute() {
        //if the array contains only one/none entry
        if (intArray.length <= 1) {
            //check if the value is between 18 and 30 and return it multiplied by 10; else 0
            if (intArray.length == 1 && intArray[0] > 18 && intArray[0] < 30) {
                return new Integer(intArray[0] * 10);
            } else {
                return new Integer(0);
            }
        } else {
            //seperate the rest of the array in two parts
            int mid = intArray.length / 2;
            int[] leftSideOfArray = Arrays.copyOfRange(intArray, 0, mid);
            int[] rightSideOfArray = Arrays.copyOfRange(intArray, mid, intArray.length);

            //create a new task and invoke it
            RechnenTask leftTask = new RechnenTask(leftSideOfArray);
            RechnenTask rightTask = new RechnenTask(rightSideOfArray);
            invokeAll(leftTask, rightTask);

            //join it for the result
            Integer resultInteger = new Integer(leftTask.join() + rightTask.join());

            //return it
            return resultInteger;

        }
    }
}
