import java.util.Scanner;
import java.io.Console;
// import java.io.*;
// import java.util.*;

public class jvprimes {
  public static void main(String[] args) {
    Console console = System.console();
    if (console == null) {
        System.out.println("No console: non-interactive mode!");
        System.exit(0);
    }
    System.out.print("Enter your username: ");
    String username = console.readLine();
    System.out.println("Your name is " + username + ".");
  }
}
