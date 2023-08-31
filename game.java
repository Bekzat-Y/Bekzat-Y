import java.util.Scanner;

public class game{


    public static void main(String[] args) {
    
Scanner s = new Scanner( System.in);
    System.out.println("Игра угадай число");

        System.out.println("Для начала игры нажмите на любую кнопку "); 
        String number2 = s.nextLine();
        if ( number2 == "Start"){
         String b = s.nextLine();
       System.out.println("начало ");
    }
 
int luckynum1 = (int)(Math.random() * 6);
       
        while (true){
    System.out.println("Введи число: ");
        int  number = s.nextInt();
        if (number>luckynum1){ 
            System.out.println("Меньше");
            }
        else if(number<luckynum1){
        System.out.println( "Выше");
 }
 else { System.out.println("Правильно");}

        }

    }
}