// Java, algorithms practice
// Compile then run
// Notes that should go here in preparation for algorithm study
// The final method/function of java should go in the first main method/function. That is how everything will be run
// About 82% done with Book

public class jvprimes {
  public static void main(String[] args) {
    printArr(primes(40));
  }
  public static boolean isPrime(int num) {
    for (int i = 2; i < num; i++) {
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }

  public static int[] primes(int numPrimes) {
    int[] primeList = new int[numPrimes];
    int j = 2;
    int pLidx = 0;

    while (pLidx < numPrimes) {
      if (isPrime(j)) {
        primeList[pLidx] = j;
        pLidx++;
      }
      j++;
    }
    return primeList;
  }

  public static void printArr(int[] arr){
    for (int k = 0; k < arr.length; k++) {
      System.out.print(arr[k] + " ");
    }
    System.out.println("");
  }
}
