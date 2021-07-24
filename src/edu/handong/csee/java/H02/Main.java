package edu.handong.csee.java.H02;
import java.util.Scanner;
import java.util.Random;

class Main {
    public static void main(String[] args) {
        Main stepH = new Main();
        stepH.h02();
    }

    void h02() {
      Scanner s = new Scanner(System.in);
      Random r = new Random();
      int lotto[] = new int[6];
      int count;
      String onemore;
      int i, j;

      do{
        System.out.print("The generated lotto numbers are ");
        for(i = 0; i < 6; i++){
          lotto[i] = r.nextInt(45) + 1;
          count = i;
          for(j = 0; j < count; j++){
            if(lotto[i] == lotto[j]){
              i--;
              break;
            }
          }
        }
        for(i = 0; i < 6; i++){
          if(i == 5)
            System.out.println(lotto[i]);
          else
            System.out.print(lotto[i] + " ");
        }
        System.out.print("Do you want to generate more lotto numbers? (Y/N) > ");
        onemore = s.next();
      }while(onemore.equals("Y"));

    }
}