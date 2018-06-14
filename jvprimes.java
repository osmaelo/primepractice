public class jvprimes {
  public static void main(String[] args) {
    // Insert functions in here to run them.
    // System.out.println(isPrime(2));
    int[] primeList = new int[10];
    System.out.println(primeList.length);
    System.out.println(primeList);
  }
  public static boolean isPrime(int num) {
    for (int i = 2; i < num; i++) {
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }

  // public static int[] primes(int numPrimes) {
  //   int[] primeList = new int[numPrimes];
  //   while (primeList.length < numPrimes) {
  //
  //   }
  //   return primeList;
  //
  // }
}
