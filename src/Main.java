//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //task1, 2 i compared first and second tasks
        byte clientOS = 0;
        short clientDeviceYear = 2000;

        if (clientDeviceYear >= 2015) {
            if (clientOS == 0) {
                System.out.println("Установите версию приложения для " + clientOS + " по ссылке");
            }
            else if (clientOS == 1){
                System.out.println("Установите версию приложения для " + clientOS + " по ссылке");
            }
            else {
                System.out.println("я не знаю такой платформы");
            }
        } else if (clientDeviceYear < 2015) {
            if (clientOS == 0) {
                System.out.println("Установите облегченную версию приложения для " + clientOS + " по ссылке");
            }
            else if (clientOS == 1) {
                System.out.println("Установите облегченную версию приложения для " + clientOS + " по ссылке");
            }
            else {
                    System.out.println("я не знаю такой платформы");
            }
        }
        //task3

        short year = 2000;

        if (year % 4 == 0 && year > 1584 && year % 400 == 0 && year % 100 != 0) {
            System.out.println(year + " год високосный");
        }

        else{
            System.out.println(year + " год не является високосным");
        }

        //task4

        byte dateOfDelivery = 0;
        int deliveryDistance = 95;

        if (deliveryDistance <= 20){
            dateOfDelivery = 1;
            System.out.println("Доставка займет " + dateOfDelivery);

        }
        else if (20 < deliveryDistance && deliveryDistance <= 60) {
            dateOfDelivery = 2;
            System.out.println("Доставка займет " + dateOfDelivery);

        }
        else if (60 < deliveryDistance && deliveryDistance <= 100) {
            dateOfDelivery = 3;
            System.out.println("Доставка займет " + dateOfDelivery);

        }
        else {
            System.out.println("Мы не осуществляем доставки до вас, слишком далеко");
        }

        //task 5

        byte monthNumber = 12;

        switch (monthNumber){
            case 12:
                System.out.println("Зима");
                break;
            case 1:
                System.out.println("Зима");
                break;
            case 2:
                System.out.println("Зима");
                break;
            case 3:
                System.out.println("Весна");
                break;
            case 4:
                System.out.println("Весна");
                break;
            case 5:
                System.out.println("Весна");
                break;
            case 6:
                System.out.println("Лето");
                break;
            case 7:
                System.out.println("Лето");
                break;
            case 8:
                System.out.println("Лето");
                break;
            case 9:
                System.out.println("Зима");
                break;
            case 10:
                System.out.println("Зима");
                break;
            case 11:
                System.out.println("Зима");
                break;
            default:
                System.out.println("Такой число не имеет привязки к месяцу");

        }
    }
}