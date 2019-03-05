package by.bntu.fitr.povt.integralnyevoiska.lab11.logic;
import java.lang.Math;
public class ArrayLogic {
    public static int getMax(int array[])
    {
        int max = Math.abs(array[0]);
        for (int i = 0; i < array.length; i++) {
            if (Math.abs(array[i]) > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int getSumBetwTwoPositElem(int array[])
    {
        boolean flag = false;
        int firstPositive = array[0];
        int secondPositive = array[array.length - 1];
        int sum = 0;
        for(int i = 0 ; i < array.length; i++)
        {
            if (array[i] > 0)
            {
                firstPositive = i;
                flag = true;
                break;
            }
        }
        if (!flag)
        {
            sum = 0;
        }
        else {
            flag = false;
            for (int i = firstPositive + 1; i < array.length; i++) {
                if (array[i] > 0) {
                    secondPositive = i;
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                sum = 0;
            } else {
                for (int i = firstPositive; i <= secondPositive; i++) {
                    sum += array[i];
                }
            }
        }
        return sum;
    }
}
