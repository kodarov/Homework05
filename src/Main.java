public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }
    public static void task1() {
        System.out.println("Задача 1");
        int clientOS = 0; //(0 — iOS, 1 — Android).
        switch (clientOS){
            case 0: System.out.println("Установите приложение с App Store"); break;
            case 1: System.out.println("Установите приложение с Google Store"); break;
            default: System.out.println("Телефон не поддерживается");
        }
    }
    public static void task2() {
        System.out.println("Задача 2");
        int clientOS = 0; //(0 — iOS, 1 — Android)
        int clientDeviceYear = 2015;
        if (clientDeviceYear < 2015) {
            switch (clientOS){
                case 0: System.out.println("Установите облегченное приложение с App Store"); break;
                case 1: System.out.println("Установите облегченное приложение с Google Store"); break;
                default: System.out.println("Телефон не поддерживается");}
        } else {
                switch (clientOS){
                case 0: System.out.println("Установите приложение с App Store"); break;
                case 1: System.out.println("Установите приложение с Google Store"); break;
                default: System.out.println("Телефон не поддерживается");}
                }
    }
    public static void task3() {
        System.out.println("Задача 3");
        int year = 2022;
        if ((year % 4)>0) System.out.println(year +" год не високосный");
        else System.out.println(year +" год високосный");
    }
    public static void task4() {
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        int deliveryDay = 1;
        if (deliveryDistance <= 20) System.out.println("Потребуется дней: " + deliveryDay);
        else if (deliveryDistance <= 60) {
            deliveryDay=deliveryDay+1;
            System.out.println("Потребуется дней: " + deliveryDay);
        }
        else if (deliveryDistance <= 100) {
            deliveryDay=deliveryDay+2;
            System.out.println("Потребуется дней: " + deliveryDay);
        }
        else System.out.println("Доставки нет");
    }
    public static void task5() {
        System.out.println("Задача 5");
        int monthNumber = 12;
        switch (monthNumber){
            case 1: System.out.println(monthNumber + " месяц принадлежит сезону зима"); break;
            case 2: System.out.println(monthNumber + " месяц принадлежит сезону зима"); break;
            case 3: System.out.println(monthNumber + " месяц принадлежит сезону весна"); break;
            case 4: System.out.println(monthNumber + " месяц принадлежит сезону весна"); break;
            case 5: System.out.println(monthNumber + " месяц принадлежит сезону весна"); break;
            case 6: System.out.println(monthNumber + " месяц принадлежит сезону лето"); break;
            case 7: System.out.println(monthNumber + " месяц принадлежит сезону лето"); break;
            case 8: System.out.println(monthNumber + " месяц принадлежит сезону лето"); break;
            case 9: System.out.println(monthNumber + " месяц принадлежит сезону осень"); break;
            case 10: System.out.println(monthNumber + " месяц принадлежит сезону осень"); break;
            case 11: System.out.println(monthNumber + " месяц принадлежит сезону осень"); break;
            case 12: System.out.println(monthNumber + " месяц принадлежит сезону зима"); break;
            default:
                System.out.println("ошибка"); break;
        }
    }
}