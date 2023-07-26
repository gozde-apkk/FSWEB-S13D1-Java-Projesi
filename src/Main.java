import java.util.Scanner;

public class Main {

    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        //Guarding
        if (clock < 0 || clock > 23) return false;
        if (!isBarking) return false;

        return clock < 8 || clock >= 20;
    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
        return (firstAge >= 13 && firstAge <= 19) ||
                (secondAge >= 13 && secondAge <= 19) ||
                (thirdAge >= 13 && thirdAge <= 19);
    }

    //optional parameters
    public static boolean hasTeen2(int... ages) {
        for (int age : ages) {
            if (age >= 13 && age <= 19) {
                return true;
            }
        }
        return false;
    }


    public static boolean isCatPlaying(boolean isSummer, int temp) {
        if (isSummer) {
            return temp > 25 && temp <= 45;
        }
        return temp > 25 && temp <= 35;
    }

    public static double area(double x, double y) {
        //Guarding
        if (x <= 0 || y <= 0) {
            System.out.println("Alan değerleri 0'dan büyük olmalıdır");
            return -1;
        }
        return x * y;
    }

    public static double circleArea(double radius) {
        if (radius < 0) {
            System.out.println("Alan değerleri 0'dan büyük olmalıdır");
            return -1;
        }
        return radius * radius * Math.PI;
    }

    //asal sayılar => 1 ve kendisine bölünebilen sayılar
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println("shouldWakeUp------------");
        System.out.println(shouldWakeUp(true, 1));
        System.out.println(shouldWakeUp(false, 2));
        System.out.println(shouldWakeUp(true, 8));
        System.out.println(shouldWakeUp(true, -1));
        System.out.println("hasTeen------------");
        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));
        System.out.println("hasTeen2------------");
        System.out.println(hasTeen2(2, 8, 19, 8));
        System.out.println("isCatPlaying----------------");
        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));


        System.out.println("Area---------------");
        Scanner scanner = new Scanner(System.in);
        boolean isValid = true;
        while (isValid) {
            try {

                System.out.println("Enter width of rectangle");
                double x = scanner.nextDouble();
                System.out.println("Enter height of rectangle");
                double y = scanner.nextDouble();
                double result = area(x, y);
                System.out.println("Area=" + result);
            } catch (Exception ex) {
                isValid = false;
                System.out.println("Invalid Input");
            }
        }
        if (isValid) {
            System.out.println("CircleArea----------------");
            try {
                System.out.println("Enter radius of circle: ");
                double radius = scanner.nextDouble();
                System.out.println("Result = " + circleArea(radius));
            } catch (Exception ex) {
                System.out.println("Invalid Input");
            }
        }
        System.out.println("isPrime----------------");
        System.out.println(isPrime(1));
        System.out.println(isPrime(2));
        System.out.println(isPrime(4));
    }
}
