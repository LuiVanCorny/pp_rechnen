package org.example;

import static org.junit.Assert.assertEquals;


import org.junit.Before;
import org.junit.Test;

public class RechnerTest {
    private Rechner rechner;

    @Before
    public void init() {

        //Arrange
        rechner = new Rechner();
    }


    @Test
    public void test1() {
        int[] array = {8, 7, 11, 13, 20, 31, 30};

        //Act
        Integer resultInteger = rechner.rechne(array);

        Integer expectation = 200;

        //Assert
        assertEquals(resultInteger, expectation);

    }

    @Test
    public void test2() {
        int[] array = {18, 30, 31, 17, 5, 55};

        //Act
        Integer resultInteger = rechner.rechne(array);

        Integer expectation = 0;

        //Assert
        assertEquals(resultInteger, expectation);

    }

    @Test
    public void test3() {
        int[] array = {19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29};

        //Act
        Integer resultInteger = rechner.rechne(array);

        Integer expectation = 2640;

        //Assert
        assertEquals(resultInteger, expectation);

    }

    @Test
    public void test4() {
        int[] array = {18,30,20,21,24};

        //Act
        Integer resultInteger = rechner.rechne(array);

        Integer expectation = 650;

        //Assert
        assertEquals(resultInteger, expectation);

    }

    @Test
    public void test5() {
        int[] array = {-100, 100, 30, 27};

        //Act
        Integer resultInteger = rechner.rechne(array);

        Integer expectation = 270;

        //Assert
        assertEquals(resultInteger, expectation);

    }

    @Test
    public void test6() {
        int[] array = {};

        //Act
        Integer resultInteger = rechner.rechne(array);

        Integer expectation = 0;

        //Assert
        assertEquals(resultInteger, expectation);

    }

}
