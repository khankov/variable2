public class Main {
    public static void main(String[] args) {
        // Задание 1
        System.out.println("Задание 1");
        int a = 1;
        byte b = 2;
        short c = 3;
        long d = 4L;
        float e = 1.11f;
        double f = 2.22;

        System.out.println("Значение переменной a с типом int = " + a);
        System.out.println("Значение переменной b с типом byte = " + b);
        System.out.println("Значение переменной c с типом short = " + c);
        System.out.println("Значение переменной d с типом long = " + d);
        System.out.println("Значение переменной e с типом float = " + e);
        System.out.println("Значение переменной f с типом double = " + f);

        // Задание 2
        System.out.println();
        System.out.println("Задание 2");
        float box1 = 27.12f;
        System.out.println("box1 = " + box1);
        long box2 = 987678965549L;
        System.out.println("box2 = " + box2);
        double box3 = 2.786;
        System.out.println("box3 = " + box3);
        boolean box4 = false;
        System.out.println("box4 = " + box4);
        char box5 = 569;
        System.out.println("box5 = " + box5);
        short box6 = -159;
        System.out.println("box6 = " + box6);
        int box7 = 27897;
        System.out.println("box7 = " + box7);
        byte box8 = 67;
        System.out.println("box8 = " + box8);
        // В задании не указано, что требуется вывести в консоль

        // Задание 3
        System.out.println();
        System.out.println("Задание 3");
        int ludmilaPavlovna = 23;
        int annaSergeyevna = 27;
        int ekaterinaAndreevna = 30;
        int paper = 480;
        int numberLeaves = paper / (ludmilaPavlovna + annaSergeyevna + ekaterinaAndreevna);
        System.out.println("На каждого ученика рассчитано " + numberLeaves + " листов бумаги");

        // Задание 4
        System.out.println();
        System.out.println("Задание 4");
        int car = 16;
        int minutes = 2;
        int inMinute = car / minutes;
        int machinePerformance1 = 20;
        System.out.println("За 20 минут машина произвела бутылок " + (inMinute * machinePerformance1) + " штук ");
        int machinePerformance2 = 1440;
        System.out.println("За сутки машина произвела бутылок " + (inMinute * machinePerformance2) + " штук ");
        int machinePerformance3 = 4320;
        System.out.println("За 3 дня машина произвела бутылок " + (inMinute * machinePerformance3) + " штук ");
        int machinePerformance4 = 43200;
        System.out.println("За месяц машина произвела бутылок " + (inMinute * machinePerformance4) + " штук ");

        // Задание 5
        System.out.println();
        System.out.println("Задание 5");
        int cansPaint = 120;
        int whitePaint = 2;
        int brownPaint = 4;
        int numberOfClasses = cansPaint / (whitePaint + brownPaint);
        System.out.println("В школе, где " + numberOfClasses + " классов, нужно " + (whitePaint * numberOfClasses) + " банок белой краски и " + (brownPaint * numberOfClasses) + " банок коричневой краски");

        // Задание 6
        System.out.println();
        System.out.println("Задание 6");
        int bananas = 80;
        int milk = 105;
        int iceCream = 100;
        int rawEggs = 70;
        double sportBreakfast = (bananas * 5) + (milk * 2) + (iceCream * 2) + (rawEggs);
        int grPerKg = 1000;
        double sportBreakfast1 = sportBreakfast /grPerKg;
        System.out.println("Вес спорт-завтрака = " + sportBreakfast1);

        // Задание 7
        System.out.println();
        System.out.println("Задание 7");
        int weight = 7;
        int grPerKg1 = 1000;
        weight = weight * grPerKg1;
        int weightLose1 = 250;
        int weightLose2 = 500;
        int amountDays1 = weight / weightLose1;
        int amountDays2 = weight / weightLose2;
        System.out.println("Дней уйдет на похудение " + amountDays1 + ", если спортсмен будет терять каждый день по 250 грамм");
        System.out.println("Дней уйдет на похудение " + amountDays2 + ", если спортсмен будет терять каждый день по 500 грамм");
        System.out.println("В среднем может потребоваться дней для похудения " + (amountDays1 + amountDays2) / 2);

        // Задача 8
        System.out.println();
        System.out.println("Задание 8");
        int year = 12;
        double salaryIncrease = 1.10;
        int zpMasha = 67660;
        int zpMasha1 = (int) (zpMasha * salaryIncrease);
        int zpDenis = 83690;
        int zpDenis1 = (int) (zpDenis * salaryIncrease);
        int zpKristina = 76320;
        int zpKristina1 = (int) (zpKristina * salaryIncrease);
        int zpMashaYear = zpMasha * year;
        int zpMashaYear1 = zpMasha1 * year;
        System.out.println("Маша теперь получает " + zpMasha1 + " рублей. Годовой доход вырос на " + (zpMashaYear1 - zpMashaYear) + " рублей");
        int zpDenisYear = zpDenis * year;
        int zpDenisYear1 = zpDenis1 * year;
        System.out.println("Денис теперь получает " + zpDenis1 + " рублей. Годовой доход вырос на " + (zpDenisYear1- zpDenisYear) + " рублей");
        int zpKristinaYear = zpKristina * year;
        int zpKristinaYear1 = zpKristina1 * year;
        System.out.println("Кристина теперь получает " + zpKristina1 + " рублей. Годовой доход вырос на " + (zpKristinaYear1 - zpKristinaYear) + " рублей");






    }
}