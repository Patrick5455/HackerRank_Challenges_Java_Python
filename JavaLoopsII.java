package Java_Loops;

import java.util.*;
import java.io.*;

public class JavaLoopsII {

     public static void main(String []args){
        Scanner in = new Scanner(System.in);

        int t=in.nextInt();
        if (t >= 0 && t <= 500){

            for(int i=0;i<t;++i) {
                int a = in.nextInt();
                int b = in.nextInt();
                int n = in.nextInt();

                if (a>=0&&b<=50&&n>=1&&n<=15) {
                    int result=0;
                    //result = a + (int)Math.pow(2,0)*b;
                    result = a + 1*b;
                    int twoMultiple =1;
                    System.out.printf("%d ",result);
                    for (int s = 1; s <n; s++){
                        twoMultiple *=2;
                        result = result + twoMultiple*b;
                       System.out.printf("%d ",result);

                    }
                    System.out.println("\nEnter for Next Series\n");
                }
                else System.out.println("Contraints Exceeded");
            }
        }
        else System.out.println("Queries number exceeded");
        in.close();
    }

}
