public class Main {
  public static void main(String[] args) {
      double sourceAmount = 100;
      double replenishment = 1100;
      
      double bonus = 0;
      
      if (replenishment > 1000) {
          bonus = (int)replenishment / 100;
      }
      
      double resultingAmmount = sourceAmount + replenishment + bonus;
      
      System.out.println("Итоговый счет: " + resultingAmmount);
      System.out.println("Бонусные рубли: " + bonus);
  }
}
