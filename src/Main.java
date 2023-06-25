public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int replenishment = 300;

        int bonus;

        if (replenishment > 1000) {
            bonus = replenishment / 100;
        } else {
            bonus = 0;
        }
        int result = balance + replenishment + bonus;

        System.out.println("Ваш итоговый счет: " + result + " руб.");
        System.out.println("Ваш бонус: " + bonus + " руб.");

    }
}