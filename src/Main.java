public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int smartphone = 0;
        switch (smartphone) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println("Задание 2");
        int clientDeviceYear = 2019;
        if (clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            if (clientDeviceYear <= 2015)
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientDeviceYear > 2015) {
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
        int deliveryDistance = 1;
        int days = 1;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней " + days);
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
        switch (monthNumber = 6) {
            case 1:
                System.out.println("Январь (Зима)");
                break;
            case 2:
                System.out.println("Февраль (Зима)");
                break;
            case 3:
                System.out.println("Март (Весна)");
                break;
            case 4:
                System.out.println("Апрель (Весна)");
                break;
            case 5:
                System.out.println("Май (Весна)");
                break;
            case 6:
                System.out.println("Июнь (Лето)");
                break;
            case 7:
                System.out.println("Июль (Лето)");
                break;
            case 8:
                System.out.println("Август (Лето)");
                break;
            case 9:
                System.out.println("Сентябрь (Лето)");
                break;
            case 10:
                System.out.println("Октябрь (Осень)");
                break;
            case 11:
                System.out.println("Ноябрь (Осень)");
                break;
            case 12:
                System.out.println("Декабрь (Зима)");
            default:
                System.out.println("Такого дня не существует");
        }
    }
}