package by.bntu.fitr.povt.integralnyevoiska.lab11.controller;

import by.bntu.fitr.povt.integralnyevoiska.lab11.util.UserInput;
import by.bntu.fitr.povt.integralnyevoiska.lab11.view.Printer;
import by.bntu.fitr.povt.integralnyevoiska.lab11.logic.ArrayLogic;

public class Controller {
    public static void main(String[] args)
    {
        int elementsAmount = UserInput.inputInt("Input the number of elements:");

        if(elementsAmount <= 0)
        {
            Printer.print("Wrong amount of elements!");
        }
        else
        {
            int [] arrray = new int[elementsAmount];

            for(int i = 0; i < arrray.length; i++)
            {
                arrray[i] = UserInput.inputInt("array[" + i + "] = ");
            }
            Printer.print("Max element is " + ArrayLogic.getMax(arrray));
            Printer.print("The sum between the 1st and the 2nd positive elements is " + ArrayLogic.getSumBetwTwoPositElem(arrray));
        }
    }
}
