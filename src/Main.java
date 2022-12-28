import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       int ticketPrice = 10000; // Стоимость билета
       int bonusMile = 20; // Стоимость бонусной мили
       int miles = ticketPrice / bonusMile; // Количество бонусных миль
        System.out.println("Количество бонусных миль: " + miles);
    }
}