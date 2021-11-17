import java.util.Scanner;
public class Poli {
    static boolean isPol(int input){
        int temp = input,lastDigit,newInPut=0;

        while(temp!=0 ){
            lastDigit = temp%10;
            newInPut = (newInPut*10)+lastDigit;
            temp/=10;
        }
        boolean answer = (newInPut == input)? true:false;
        return answer;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Kontrol edilecek sayıyı girin: ");
        int data = scn.nextInt();
        String answer = (isPol(data) == true)? "Sayı bir palindrom sayıdır" : "Sayı palindrom sayı değildir";
        System.out.println(answer);
    }
}
