import java.util.Scanner;

class Main {

  public static void main(String[] args) {

    System.out.println("kaçıncı fibonacci sayısı bulunsun?");
    Scanner scan = new Scanner(System.in);
    int sayi = scan.nextInt();

    int fib1=1;//birinci fibonacci sayısı
    int fib2=1;//ikinci fibonacci sayısı
    //int fib;//tapladığımız fib değerleri
    System.out.print("1. fibonacci sayısı: 1\n" );
    System.out.print("2. fibonacci sayısı: 1\n" );



    for(int i=3; i<= sayi; i++){
      //ilk iki sayıyı tanımladığımız için i 3'ten başlıyor

      int fib=fib1+fib2;

      fib1=fib2;

      fib2=fib;

      System.out.print(+i +". " +"fibonacci sayısı: " + fib);
      System.out.print("\n");

    }
    
  }
}
