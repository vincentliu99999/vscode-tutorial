/**
 * Sample class
 */
public class Sample {
  public static void main(String[] args) {
    System.out.println("Hello! Java Sample!");
    System.out.println(add(11, 11));
    System.out.println(add(11, 12, 13));
    System.out.println(substract(99, 88));
    System.out.println(power(300, 0));
    System.out.println(divide(2, 0));
  }

  /**
   * add num1 and num2
   * @param num1
   * @param num2
   * @return num1 + num2
   */
  private static int add(int num1, int num2) {
    return num1 + num2;
  }

  private static int substract(int num1, int num2) {
      return num1 - num2;
  }

   /**
   * add numbers
   * @param nums many numbers
   * @return
   */
  private static int add(int ...nums) {
    int sum = 0;
    for(int num: nums) {
        sum = sum + num;
    }
    return sum;
  }

  /**
   * divide num1 by num2
   * @param num1
   * @param num2
   * @return num1 / num2
   */
  private static double divide(double num1, double num2) {
    if (num2 == 0) {
        throw new IllegalArgumentException("Argument 'divisor' is 0");
    }
    return num1 / num2;
  }

  private static double power(double num1, double num2) {
    return Math.pow(num1, num2);
  }
}