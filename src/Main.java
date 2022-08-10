import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        //task1
        int i = 0;
        while (i < 10) {
            System.out.print( ++i + "  ");
        }

        System.out.println ( );

        for (; i > 0; i--) {
            System.out.print (i + "  ");
        }

        System.out.println ( );

        //task2

        int firstFriday = 5;

        for (int currentFriday = firstFriday; firstFriday <= 31; firstFriday = firstFriday + 7) {
            System.out.println("Сегодня пятница " + firstFriday + "-е число. Необходимо подготовить отчет.");
                }



    //task3
        int currentYear = LocalDate.now().getYear();

        int start = currentYear - 200;
        int end = currentYear + 100;

        for (int year = start; year <= end; year++) {
            if (year % 79 == 0) {
                System.out.println(year);
            }
        }





    }


    }
