public class Main {
    public static void main(String[] args) {
        int account = 100;
        int addSum = 300;
        int bonus = 0;
        if (addSum > 1000) {
            bonus = addSum / 100;
        }
        System.out.println("Остаток на Вашем счете: " + (account + addSum + bonus));
        System.out.println("Бонус по платежу: " + bonus);

    }
}