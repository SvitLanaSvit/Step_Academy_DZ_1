package org.example;

public class Main {
    public static void main(String[] args) {
        Task task = new Task();

        //1
        System.out.println(task.showString());
        //2
        System.out.println(task.getNumberFromPercentage());
        //3
        System.out.println(task.getNumberFromThreeNumbers());
        //4
        System.out.println(task.getReverseNumber());
        //5
        System.out.println(task.getSeasonOfYear());
        //6
        System.out.println(task.getMeterInMilesInchesYards());
        //7
        System.out.println(task.getOddNumbers());
        //8
        System.out.println(task.getMultiplicationTable());
        //9
        System.out.println(task.getArrayStats());
        //10
        System.out.println(task.getArrayFiltering());
        //11
        task.drawLine(5, 'H', '-');
        task.drawLine(4, 'V', '|');
        //12
        int[] arr = {4,2,5,3,8};
        task.sortMassive(arr);
    }
}