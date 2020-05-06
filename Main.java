public class Main {
    public static void main(String[] args) {
        int account = 100;
        int amount = 1200;
        int bonusprice = 100;
        int bonus = 0;

        if (amount > 1000) {
             bonus = amount / bonusprice;
        }
        System.out.println(bonus);
    }

}
