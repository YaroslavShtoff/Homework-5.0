public class Main {
    public static void main(String[] args) {

        // Задание 1

        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        //Задание 2

        int clientOS1 = 0;
        int clientDeviceYear = 2018;
        if (clientOS1 == 0 && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOS1 == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите версию облегченную приложения для iOS по ссылке");
        }
        if (clientOS1 == 1 && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        if (clientOS1 == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите версию облегченную приложения для Android по ссылке");
        }

        //Задание 3

        int year = 2020;
        if (year % 4 != 0 || year % 100 == 0 && year % 400 != 0) {
            System.out.println("Год явлется обычным");
        } else {
            System.out.println("Год явлется високосным");
        }
        //Задание 4

        int delieveryDistance = 30;
        if (delieveryDistance <= 20) {
            System.out.println("Потребуется сутки");
        }
        if (delieveryDistance > 20 && delieveryDistance < 60) {
            System.out.println("Потребуется двое суток");
        }
        if (delieveryDistance > 60 && delieveryDistance < 100) {
            System.out.println("Потребуется трое суток");
        }

        //Задание 5

        int monthNumber = 10;
        switch (monthNumber) {
            case 1: System.out.println("зима");
                break;
            case 2: System.out.println("зима");
                break;
            case 3: System.out.println("весна");
                break;
            case 4: System.out.println("весна");
                break;
            case 5: System.out.println("весна");
                break;
            case 6: System.out.println("лето");
                break;
            case 7: System.out.println("лето");
                break;
            case 8: System.out.println("лето");
                break;
            case 9: System.out.println("осень");
                break;
            case 10: System.out.println("осень");
                break;
            case 11: System.out.println("осень");
                break;
            case 12: System.out.println("зима");
                break;
            default:
                System.out.println("Месяцев в году не может быть больше 12ти");

        }
    }
}

