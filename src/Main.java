public class Main {
    public static void ifLeapYear(int year) {
        int chekingYear = year;
        if ((chekingYear > 1584) && (chekingYear % 4 == 0) && (chekingYear % 100 != 0) || (chekingYear > 1584) && (chekingYear % 400 == 0)) {
            System.out.println(chekingYear + " is a leap year");
        } else {
            System.out.println(chekingYear + " isn't a leap year");
        }
    }

    public static void checkOSVersion(int oS, int deviceYear) {
        int clientOS  = oS;
        int clientDeviceYear = deviceYear;
        if (clientOS == 0) {
            if (clientDeviceYear >= 2015) {
                System.out.println("Please download the App via the link for AppStore below");
            } else {
                System.out.println("Please download the App via the link for AppStore below");
            }
        } else if (clientOS == 1) {
            if (clientDeviceYear >= 2015) {
                System.out.println("Please download the App via the link for Play Market below");
            } else {
                System.out.println("Please download the light version of App via the link for Play Market below");
            }
        } else {
            System.out.println("You entered the wrong data. Please try again");
        }
    }
    public static void checkDeliveryDistance(int distance) {
        int deliveryDistance = distance;
        if (deliveryDistance <= 20 && deliveryDistance >= 0) {
            System.out.println("It will take 1 days to deliver the credit card");
        } else if (deliveryDistance > 20 && deliveryDistance < 60) {
            System.out.println("It will take 2 days to deliver the credit card");
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("It will take 3 days to deliver the credit card");
        } else if (deliveryDistance > 100) {
            System.out.println("Unfortunately, it is impossible to deliver the credit card to the selected location");
        } else {
            System.out.println("You entered the wrong data. Please try again");
        }
    }
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static void task1() {
        System.out.println("Задача 1");
        int year = 2020;
        ifLeapYear(year);
    }
    public static void task2() {
        System.out.println("Задача 2");
        int clientOS = 1;
        int clientDeviceYear = 2004;
        checkOSVersion(clientOS, clientDeviceYear);
    }
    public static void task3() {
        System.out.println("Задача 3");
        int deliveryDistance = 95;
        checkDeliveryDistance(deliveryDistance);
    }
}