package by.bntu.fitr.povt.integralnyevoiska.lab11.test;

import org.junit.Test;
import org.junit.Assert;
import by.bntu.fitr.povt.integralnyevoiska.lab11.logic.ArrayLogic;
public class MyClassTest {
    @Test
    public void testMaxOnAllDifferent() {
        int[] array = {9,56,7,2,45};
        int expectedMax = array[1];
        Assert.assertEquals(expectedMax, ArrayLogic.getMax(array));
    }
    @Test
    public void testMaxOnAllTheSame() {
        int[] array = {9,9,9,9,9};
        int expectedMax = array[0];
        Assert.assertEquals(expectedMax, ArrayLogic.getMax(array));
    }
    @Test
    public void testSumOnAllPositive()
    {
        int [] array = {9,5,6,7,1,2};
        int expectedSum = 14;
        Assert.assertEquals(expectedSum, ArrayLogic.getSumBetwTwoPositElem(array));
    }
    @Test
    public void testSumOnAllNegative()
    {
        int [] array = {-9,-5,-6,-7,-1};
        int expectedSum = 0;
        Assert.assertEquals(expectedSum, ArrayLogic.getSumBetwTwoPositElem(array));
    }
    @Test
    public void testSumOnAllDifferent()
    {
        int [] array = {9,-7,-8,5,10};
        int expectedSum = array[0] + array[1] + array[2] + array[3];
        Assert.assertEquals(expectedSum, ArrayLogic.getSumBetwTwoPositElem(array));
    }
    @Test
    public void testSumonOnePositive()
    {
        int [] array = {-6,-8,4,-7,-1};
        int expectedSum = 0;
        Assert.assertEquals(expectedSum,ArrayLogic.getSumBetwTwoPositElem(array));
    }
}
