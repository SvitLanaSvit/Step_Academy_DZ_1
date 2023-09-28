package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class Task {
    private StringBuilder sb;

    //Завдання 1:
    //Вивести на екран надпис "Your time is limited, so don’t waste it living someone else’s life" Steve Jobs
    //в різних рядках. Приклад виводу:
    //“Your time is limited,
    //so don’t waste it
    //living someone else’s life”
    //Steve Jobs
    public String showString() {
        String str = "\"Your time is limited, \n\tso don’t waste it \n\t\tliving someone else’s life\" \n\t\t\tSteve Jobs";
        return str;
    }

    //Завдання 2:
    //Користувач вводить з клавіатури два числа. Перше число — це значення, друге число — відсоток,
    //який необхідно підрахувати. Наприклад, ми ввели з клавіатури 50 і 10. Потрібно вивести на екран
    //10 відсотків від 50. Результат — 5.
    public String getNumberFromPercentage(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value: ");
        double value = scanner.nextDouble();

        System.out.print("Enter the percentage: ");
        double percentage = scanner.nextDouble();

        double result = (percentage / 100) * value;

        return percentage + "% of " + value + " is " + result;
    }

    //Завдання 3:
    //Користувач вводить з клавіатури 3 числа. Необхідно створити число, що містить ці числа.
    //Наприклад, якщо з клавіатури введено 7, 3, 8, тоді потрібно сформувати число 738.
    public String getNumberFromThreeNumbers(){
        sb = new StringBuilder();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value 1: ");
        int val1 = scanner.nextInt();

        System.out.print("Enter the value 2: ");
        int val2 = scanner.nextInt();

        System.out.print("Enter the value 3: ");
        int val3 = scanner.nextInt();

        sb.append(val1).append(val2).append(val3);

        return "Number: " + sb;
    }

    //Завдання 4:
    //Користувач вводить шестизначне число. Необхідно змінити в цьому числі перше і шосте число, а
    //також друге і п’яте число. Наприклад, 723895 повинно перетворитися на 593827
    //Якщо користувач ввів не шестизначне число потрібно вивести повідомлення про помилку.
    public String getReverseNumber() {
        sb = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a six-digit number: ");
        int number = scanner.nextInt();

        if (isSixDigitNumber(number)) {
            sb.append(number);
            sb.reverse();
            return "Reverse of number: " + sb;
        } else {
            return "Error: Please enter a six-digit number.";
        }
    }

    private static boolean isSixDigitNumber(int number) {
        return number >= 100000 && number <= 999999;
    }

    //Завдання 5:
    //Користувач вводить з клавіатури номер місяця(1-12). В залежності від отриманого номера програма
    //виводить на екран надпис : Winter (якщо введене значення 1,2 або 12), Spring (якщо введене значення від
    //3 до 5), Summer (якщо введене значення від 6 до 8), Autumn (якщо введене значення від 9 до 11).
    //Якщо користувач ввів значення не в діапазоні від 1 до 12 потрібно вивести повідомлення про помилку.
    public String getSeasonOfYear(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the month number (1-12): ");
        int month = scanner.nextInt();

        String season = switch (month) {
            case 1, 2, 12 -> "Winter";
            case 3, 4, 5 -> "Spring";
            case 6, 7, 8 -> "Summer";
            case 9, 10, 11 -> "Autumn";
            default -> "Error: Invalid month number";
        };

        return "The season for month " + month + " is " + season;
    }

    //Завдання 6:
    //Користувач вводить з клавіатури кількість метрів. В залежності від вибору користувача програма
    //переводить метри в милі, дюйми чи ярди
    public String getMeterInMilesInchesYards(){
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the distance in meters
        System.out.print("Enter the distance in meters: ");
        double meters = scanner.nextDouble();

        // Display the conversion menu
        System.out.println("Choose a conversion option:");
        System.out.println("1. Convert to miles");
        System.out.println("2. Convert to inches");
        System.out.println("3. Convert to yards");

        // Prompt the user for their choice
        System.out.print("Enter your choice (1/2/3): ");
        int choice = scanner.nextInt();

        double result = 0.0;

        switch (choice) {
            case 1 -> {
                result = meters * 0.000621371;
                return meters + " meters is approximately " + result + " miles.";
            }
            case 2 -> {
                result = meters * 39.3701;
                return meters + " meters is approximately " + result + " inches.";
            }
            case 3 -> {
                result = meters * 1.09361;
                return meters + " meters is approximately " + result + " yards.";
            }
            default -> {
                return "Invalid choice. Please choose 1, 2, or 3.";
            }
        }
    }

    //Завдання 7:
    //Користувач вводить з клавіатури два числа. Потрібно вивести всі непарні числа в вказаному
    //діапазоні. Якщо границі вказані не вірно потрібно провести нормалізацію границь. Наприклад,
    //якщо ввели 20 і 11, потрібна нормалізація, після якої початок стане рівним 11, а кінець 20.
    public String getOddNumbers(){
        sb = new StringBuilder();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        int start = Math.min(num1, num2);
        int end = Math.max(num1, num2);

        if (start % 2 == 0) {
            start++;
        }

        sb.append("Odd numbers in the range [").append(start).append(", ").append(end).append("]:\n");
        for (int i = start; i <= end; i += 2) {
            sb.append(i).append(" ");
        }

        return sb.toString();
    }

    //Завдання 8:
    //Показати на екрані таблицю множення в діапазоні, вказаному користувачем. Наприклад, якщо
    //користувач вказав 3 і 5, таблиця може виглядати так
    //3*1 = 3 3*2 = 6 3*3 = 9 ………… 3* 10 = 30
    //……………………………………………………
    //5*1 = 5 5 *2 = 10 5 *3 = 15 ………….
    public String getMultiplicationTable(){
        sb = new StringBuilder();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the start of the range: ");
        int start = scanner.nextInt();

        System.out.print("Enter the end of the range: ");
        int end = scanner.nextInt();

        for (int i = start; i <= end; i++) {
            for (int j = 1; j <= 10; j++) {
                sb.append(i).append(" * ").append(j).append(" = ").append(i * j);
            }
            sb.append("\n");
        }

        return sb.toString();
    }

    //Завдання 9:
    //В одномірному масиві, заповненому випадковими числами, визначаємо мінімальне і
    //максимальне значення, підраховуємо кількість від’ємних значень, підраховуємо кількість
    //додатних значень, підраховуємо кількість нулів. Результат виводимо на екран.
    public String getArrayStats(){
        sb = new StringBuilder();
        int size = 20;

        int[] numbers = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            numbers[i] = random.nextInt(201) - 100;
        }

        int min = numbers[0];
        int max = numbers[0];
        int negativeCount = 0;
        int positiveCount = 0;
        int zeroCount = 0;

        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }

            if (number < 0) {
                negativeCount++;
            } else if (number > 0) {
                positiveCount++;
            } else {
                zeroCount++;
            }
        }

        sb.append("Minimum value: ").append(min).append("\n");
        sb.append("Maximum value: ").append(max).append("\n");
        sb.append("Number of negative values: ").append(negativeCount).append("\n");
        sb.append("Number of positive values: ").append(positiveCount).append("\n");
        sb.append("Number of zeros: ").append(zeroCount).append("\n");
        return sb.toString();
    }

    //10
    public String getArrayFiltering(){
        sb = new StringBuilder();
        int size = 20;

        int[] originalArray = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            originalArray[i] = random.nextInt(201) - 100;
        }

        int[] evenArray = new int[size];
        int[] oddArray = new int[size];
        int[] negativeArray = new int[size];
        int[] positiveArray = new int[size];

        int evenCount = 0;
        int oddCount = 0;
        int negativeCount = 0;
        int positiveCount = 0;

        for (int number : originalArray) {
            if (number % 2 == 0) {
                evenArray[evenCount] = number;
                evenCount++;
            } else {
                oddArray[oddCount] = number;
                oddCount++;
            }

            if (number < 0) {
                negativeArray[negativeCount] = number;
                negativeCount++;
            } else if (number > 0) {
                positiveArray[positiveCount] = number;
                positiveCount++;
            }
        }

        int[] evenNumbers = new int[evenCount];
        int[] oddNumbers = new int[oddCount];
        int[] negativeNumbers = new int[negativeCount];
        int[] positiveNumbers = new int[positiveCount];

        System.arraycopy(evenArray, 0, evenNumbers, 0, evenCount);
        System.arraycopy(oddArray, 0, oddNumbers, 0, oddCount);
        System.arraycopy(negativeArray, 0, negativeNumbers, 0, negativeCount);
        System.arraycopy(positiveArray, 0, positiveNumbers, 0, positiveCount);

        sb.append("Even numbers: ").append(Arrays.toString(evenNumbers)).append("\n");
        sb.append("Odd numbers: ").append(Arrays.toString(oddNumbers)).append("\n");
        sb.append("Negative numbers: ").append(Arrays.toString(negativeNumbers)).append("\n");
        sb.append("Positive numbers: ").append(Arrays.toString(positiveNumbers)).append("\n");

        return sb.toString();
    }

    //Завдання 11:
    //Написати метод, що відображає вертикальну або горизонтальну лінію із деяких символів. Метод приймає
    //в якості параметрів: довжину лінії, напрям, символ.
    public void drawLine(int length, char direction, char symbol) {
        if (length <= 0) {
            System.out.println("Line length must be greater than 0.");
            return;
        }

        if (direction == 'H' || direction == 'h') {
            for (int i = 0; i < length; i++) {
                System.out.print(symbol);
            }
            System.out.println();
        } else if (direction == 'V' || direction == 'v') {
            for (int i = 0; i < length; i++) {
                System.out.println(symbol);
            }
        } else {
            System.out.println("Invalid direction. Use 'H' or 'V'.");
        }
    }

    //Завдання 12:
    //Написати метод, що сортує масив по спаданню або зростанню в залежності від вибору
    //користувача
    public void sortMassive(int[] arr){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter sorting order (A for ascending, D for descending): ");
        char order = scanner.next().charAt(0);

        if (order == 'A' || order == 'a') {
            int[] ascendingArr = sortArrayAscending(arr);
            System.out.println("Ascending Sorted Array: " + Arrays.toString(ascendingArr));
        }
        else if (order == 'D' || order == 'd') {
            int[] descendingArr = sortArrayDescending(arr);
            System.out.println("Array sorted in descending order: " + Arrays.toString(descendingArr));
        } else {
            System.out.println("Invalid sorting order. Use 'A' for ascending or 'D' for descending.");
        }
    }

    private int[] sortArrayAscending(int[] arr){
        return Arrays.stream(arr)
                .sorted()
                .toArray();
    }

    private int[] sortArrayDescending(int[] arr){
        return Arrays.stream(arr)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
