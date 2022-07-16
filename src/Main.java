public class Main {
    public static void main(String[] args) {

        int balance = 100;
        int cash = 1100;

        int bonus = balance + cash;
        if (bonus > 1000) {
            bonus = cash / 100;
        }

        System.out.println("Перваночальный баланс: " + balance);
        System.out.println("Количество бонусных рублей: " + bonus);
        System.out.println("Итоговый счёт: " + (balance + cash + bonus));

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете превысила ли
        // сумма пополнения порог и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
    }
}