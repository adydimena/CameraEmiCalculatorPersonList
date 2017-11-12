import android.provider.Settings;

import java.lang.reflect.Array;

/**
 * Created by Ady on 11/10/2017.
 */

public class Testweek1 {

    public static class ASingleton {

        private static ASingleton instance = null;

        private ASingleton() {
        }

        public static ASingleton getInstance() {
            if (instance == null) {
                instance = new ASingleton();
            }
            return instance;
        }
    }

    public static void main(String[] args) {
        int[] numbers = new int[7];
        numbers[0]=1;
        numbers[1]=3;
        numbers[2]=2;
        numbers[3]=4;
        numbers[4]=5;
        numbers[5]=5;
        numbers[6]=7;
        findthemostoccurence(numbers);
        fizzbuzz(1,20);
       Armstrong(153);
        ASingleton dummy = new ASingleton();

    }

    public static void findthemostoccurence(int[] numbers){
        int count = 1, tempCount;
        int popular = numbers[0];
        int temp = 0;
        for (int i = 0; i < (numbers.length - 1); i++)
        {
            temp = numbers[i];
            tempCount = 0;
            for (int j = 1; j < numbers.length; j++)
            {
                if (temp == numbers[j])
                    tempCount++;
            }
            if (tempCount > count)
            {
                popular = temp;
                count = tempCount;
            }
        }
        System.out.println("Question 2, The most popular number is " + popular);

    }
    public static void fizzbuzz (int num1, int num2)
    {
        System.out.println("Question 3...");
        for (int i = num1; i<=num2; i++){
            if (i%3 == 0 && i%5 != 0)
            {
                System.out.println("Fizz");
            }
            else if (i%5 == 0 && i%3 != 0 ){
                System.out.println("Buzz");

            }
            else if (i%5 == 0 && i%3 == 0 ){
                System.out.println("Fizz Buzz");

            }
            else{
                System.out.println(i);
            }
        }
        System.out.println("END OF Question 3...");

    }
    public static void Armstrong (int num){
        int c=0,a,temp;

        temp=num;
        while(num>0)
        {
            a=num%10;
            num=num/10;
            c=c+(a*a*a);
        }
        if(temp==c)
            System.out.println("armstrong number");
        else
            System.out.println("Not armstrong number");
    }

}
