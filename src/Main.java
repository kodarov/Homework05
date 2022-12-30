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
    }
    public static void task3() {
        System.out.println("Задача 3");
    }
    public static void task4() {
        System.out.println("Задача 4");
    }
    public static void task5() {
        System.out.println("Задача 5");
    }
}