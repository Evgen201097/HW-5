public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int clientOS = 0;
        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println("Задание 2");
        int clientDeviceYear = 2011;
        if (clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            if (clientDeviceYear <= 2015)
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            if (clientDeviceYear > 2015)
                System.out.println("Установите обычную версию приложения для iOS по ссылке");
            if (clientDeviceYear > 2015)
                System.out.println("Установите обычную версию приложения для Android по ссылке");
        }
        System.out.println("Задание 3");
        int year = 2025;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Год " + year + " Высокосный");
        } else {
            System.out.println("Год " + year + " не восокосный");
        }
        System.out.println("Задание 4");
        int deliveryDistance = 30;
        int days = 1;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней " + (days + 1));
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней + (days + 1");
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100)
        {
            System.out.println("Потребуется дней " + (days + 2));
        } else {
            System.out.println("Доставки нет");
        }
        System.out.println("Задание 5");
        int monthNumber = 12;
        switch (monthNumber){
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
            default :
                System.out.println("Такого дня не существует");
        }
    }
}