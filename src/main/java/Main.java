public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();
        boolean registered = true;
        long amount = -1_000_000;
        long expected = 150;
        long actual = (int) service.calculate(amount,registered);
        System.out.println(expected + "==?==" + actual);

        expected = 50;
        actual = (int) service.calculate(amount,registered = false );
        System.out.println(expected + "==?==" + actual);
    }
}
