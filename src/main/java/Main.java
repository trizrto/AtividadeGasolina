import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("digite o numero referente ao serviço usado:");
    int a = 1;
    int b = 2;
    int c = 3;
    int d = 4;
    a = sc.nextInt();
    b = sc.nextInt();
    c = sc.nextInt();
    d = sc.nextInt();
    while (a == 1 && b == 2 && c == 3 && d == 4 ) {
      System.out.println("alcool");
      System.out.println("digite 4 para finalizar o serviço.");
    }

    

    sc.close();
  }

}