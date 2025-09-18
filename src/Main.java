//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Задача 1
        int clientOS = 1; //0 - iOS, 1 - Android
        System.out.println("\nЗадача 1");
        if (clientOS == 0){
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else if (clientOS == 1){
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        //Задача 2
        int clientOsTwo = 0; //0 - iOS, 1 - Android
        int clientDeviceYear = 2017;
        String OS;
        System.out.println("\nЗадача 2");
        if (clientOsTwo == 0){
            OS = "iOS";
        }
        else {
            OS = "Android";
        }
        if (clientDeviceYear < 2015){
            System.out.println("Установите облегченную версию приложения для " + OS + " по ссылке");
        }
        else {
            System.out.println("Установите версию приложения для " + OS + " по ссылке");
        }

        //Задача 3
        int year = 2020;
        System.out.println("\nЗадача 3");
        if (year < 1584){
            System.out.println("Високосный год был введен в 1584 году");
        }
        else if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            System.out.println(year + " год является високосным");
        }
        else {
            System.out.println(year + " год не является високосным");
        }


        //Задача 4
        int deliveryDistance = 95;
        int deliveryDays = 0;
        System.out.println("\nЗадача 4");
        if (deliveryDistance > 100){
            System.out.println("Доставки нет");
        }
        else if (deliveryDistance <= 20){
            deliveryDays += 1;
            System.out.println("Потребуется дней: " + deliveryDays );
        }
        else if (deliveryDistance > 20 && deliveryDistance <= 60){
            deliveryDays += 2;
            System.out.println("Потребуется дней: " + deliveryDays );
        }
        else {
            deliveryDays += 3;
            System.out.println("Потребуется дней: " + deliveryDays );
        }


        //Задача 5
        int monthNumber = 4;
        System.out.println("\nЗадача 5");
        switch (monthNumber){
            case 12:
            case 1:
            case 2:
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
                break;
            default:
                System.out.println("Введён некорректный номер месяца");
        }


    }
}