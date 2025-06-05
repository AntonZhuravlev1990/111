public class Main {
    public static void main (String[] args) {
        int startingScore = 100; // начальный счет
        int replenishment = 1100; // сумма пополнения
        int bonus = 1;
        if (replenishment > 1000) {
            bonus = replenishment / 100;
            System.out.println("суммма пополнения положительная");
            System.out.println((replenishment / 100) + " бонус");
        }else{
            bonus = 0;
            System.out.println("сумма пополнения Неположительный");
            //System.out.println((replenishment / 100) + " бонус");
        }
        System.out.println((startingScore + replenishment) + " баланс после пополнения");
        System.out.println((startingScore + replenishment + bonus) + " общий баланс ");
    }
}
