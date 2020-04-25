package org.example;

public class Rechner
{
   public Integer rechne(int[] intArray){
       //create rechnenTask and invoke it
       RechnenTask rechnenTask = new RechnenTask(intArray);
       rechnenTask.invoke();

       return rechnenTask.join();
   }
}
