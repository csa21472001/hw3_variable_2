public class Main {
    public static void main(String[] args)
    {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1()
    {
        System.out.println("Задача 1");
        byte a = 1;
        System.out.println("Значение переменной 'a' с типом \"byte\" равно " + a);
        short b = 10000;
        System.out.println("Значение переменной 'b' с типом \"short\" равно " + b);
        int c = 1000000 ;
        System.out.println("Значение переменной 'c' с типом \"int\" равно " + c);
        long d = 10000000;
        System.out.println("Значение переменной 'd' с типом \"long\" равно " + d);
        float e = 1.65F;
        System.out.println("Значение переменной 'e' с типом \"float\" равно " + e);
        double f= 1.123465798987654321;
        System.out.println("Значение переменной 'f' с типом \"double\" равно " + f);
    }
    public static void task2()
    {
        System.out.println("Задача 2");
        float a = 27.12F;
        long b = 987678965549L;
        float c = 2.786F;
        short d = 569;
        short e  = -159;
        short f = 27897;
        short g = 678;
    }
    public static void task3()
    {
        System.out.println("Задача 3");
        byte clVse = 23 + 27 + 30;
        float papir = 480/clVse;
        System.out.println("На каждого ученика рассчитано " + papir + " листов бумаги");
    }
    public static void task4()
    {
        System.out.println("Задача 4");
        int x = 8 * 20;
        System.out.println("За 20 минут машина произвела " + x + " штук бутылок");
        x = 60*24*8;
        System.out.println("За 1 сутки машина произвела " + x + " штук бутылок");
        x = 60*24*8*3;
        System.out.println("За 3 дня машина произвела " + x + " штук бутылок");
        x = 60*24*8*31;
        System.out.println("За 1 месяц машина произвела " + x + " штук бутылок");
    }
    public static void task5()
    {
        System.out.println("Задача 5");
        float brown = (1f/3f) * 120;
        float white = (2f/3f) * 120;
        System.out.println(" В школе, где 20 классов, нужно "+ white +" банок белой краски и "+ brown+" банок коричневой краски");
    }
    public static void task6()
    {
        System.out.println("Задача 6");
        short banana = 5*80;
        short milk = 105*2;
        short iceCream = 2*100;
        short eggs = 1*70;
        int sum = banana+milk+iceCream+eggs;
        System.out.println(sum);
        float sumKg = sum/1000f;
        System.out.println(sumKg);
    }
    public static void task7()
    {
        System.out.println("Задача 7");
        float slowSlimTime = 7000f/250;
        System.out.println(slowSlimTime);
        float fastSlimTime = 7000f/500;
        System.out.println(fastSlimTime);
        /*
        float averageValueTime_1 =((fastSlimTime+slowSlimTime)/2);
        System.out.println(averageValueTime_1);
        */
        int averageValueTime = (int)((fastSlimTime+slowSlimTime)/2);
        System.out.println(averageValueTime);
    }
    public static void task8()
{
        System.out.println("Задача 8");
        float newZpMasha = (67760 + 67760*0.1F);
        float diffZpMasha = newZpMasha*12 - 67760*12;
        System.out.println("Маша теперь получает "+ newZpMasha +" рублей. Годовой доход вырос на "+ diffZpMasha +" рублей");
        float newZpDen = (83690 + 83690*0.1F);
        float diffZpDen = newZpDen*12 - 83690*12;
        System.out.println("Денис теперь получает "+ newZpDen +" рублей. Годовой доход вырос на "+ diffZpDen +" рублей");
        float newZpKrist = (76230 + 76230*0.1F);
        float diffZpKrist = newZpKrist*12 - 76230*12;
        System.out.println("Кристина теперь получает "+ newZpKrist +" рублей. Годовой доход вырос на "+ diffZpKrist +" рублей");
}
}
