import java.util.Scanner;

public class Calculate {
    static int sum(int a, int b){
        int result = a+ b;
        System.out.println("Sonuc: "+ result);
        return result;
    }
    static int minus (int a , int b){
        int result = a-b;
        System.out.println("Sonuc: " + result);
        return result;
    }
    static int times (int a, int b){
        int result =a *b;
        System.out.println("Sonuc: " + result);
        return result;
    }
    static int divided (int a , int b){
        int result= a/b;
        System.out.println("Sonuc: " + result);
        return result;
    }
    static int power(int a,  int b){
        int result=1;
        for (int i =1; i <=b ; i++){
             result *= a;
        } System.out.println("Sonuc: " + result);
        return result;
    }
    static int fact(int a, int b) {
        int result = 0;
        for (int i = 0; i <= a; i++) {
            result = 1;
            result *= i;
            System.out.println("Sonuc: " + result);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);

        int a, b,select;
       do {
        String menu = """
                1-Toplama
                2-Cıkarma
                3-Carpma
                4-Bolme
                5-Uslu Sayi
                6-Faktoriyel Hesaplama
                0-Cıkıs Yap""";
        System.out.println(menu);
        System.out.println("Choose for calculate: ");
        select= inp.nextInt();
        System.out.print("First number: ");
        a= inp.nextInt();
        System.out.println("Second number: ");
        b =inp.nextInt();

        switch (select) {
            case (1) -> sum(a, b);
            case (2) -> minus(a, b);
            case (3) -> times(a, b);
            case (4) -> {
                divided(a, b);
                if (b == 0) {
                    System.out.println("You cannot choose 0 for second number!!!");
                    System.out.println("Error!!!");
                }
            }
            case (5) -> power(a, b);
            case (6) -> fact(a, b);
            default -> System.out.println("You did something wrong!!!!");
        }

        }while (select !=0);


    }}

