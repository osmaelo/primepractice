public class jvprimes {
  public static void main(String[] args) {

  }
  public static boolean isPrime(int num) {
    for (int i = 2; i <= num; i++) {
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }
}

jvprimes.isPrime(7);
