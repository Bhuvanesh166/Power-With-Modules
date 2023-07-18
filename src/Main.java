
import java.util.Scanner;
class Power {
    public static int findModules(int a,int b,int c){
        a=a%c;
        int pow=1;
        for(int i=1;i<=b;i++){
            pow=(pow*a)%c;
        }
        return pow%c;
    }
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter base:");
        int A=scanner.nextInt();
        System.out.println("Enter power:");
        int B=scanner.nextInt();
        System.out.println("Enter Divisor:");
        int C=scanner.nextInt();
        System.out.print("Power with Modules "+findModules(A,B,C));
    }
}