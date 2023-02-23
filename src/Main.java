import java.time.LocalDate;

public class Main {
    //1
    public static void correctYear(int year) {
        if (year % 4 == 0 && year % 100 !=0 || year % 400 == 0) System.out.println(year + " - високосный год");
        else System.out.println(year + " - не високосный год");
    }

    //2
    public static void OS(int os, int year) {
        int curYear = LocalDate.now().getYear();
        if (year != curYear && os == 1) System.out.println("Установите облегченную версию ios приложения");
        else if (year == curYear && os == 1) System.out.println("Установите облегченную версию ios приложения");
        if (year != curYear && os == 0) System.out.println("Установите облегченную версию android приложения");
        else if (year == curYear && os == 0) System.out.println("Установите облегченную версию android приложения");

    }

    //3
    public static void dayDistance(int km) {
        int day = 1 + km / 40;
        System.out.println("Потребуется дней: " + day);
    }
    public static void main(String[] args) {
        //task 1
        correctYear(2023);
        correctYear(2020);

        //task 2
        OS(0, 2023);
        OS(1, 2023);
        OS(0, 2021);
        OS(1, 2021);

        //task 3
        dayDistance(95);
    }
}