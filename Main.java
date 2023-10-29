import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       //1
        Scanner s=new Scanner(System.in);
        /* System.out.println("enter length of array");
        int  length=s.nextInt();
        if(length>=2) {
            int []a=new int[length];
            for(int i=0;i<=a.length-1;i++) {
                System.out.println("enter element");
                //int  element=s.nextInt(); اذا جيت اكتب و ابغاه يتخزن بالمصفوفه اسوي زي سطر 16
                a[i]=s.nextInt();
            }
            if(a[0]==a[length-1]) {
                System.out.println("true");
            } else System.out.println("false");
        }
         */

        //2
        /* int sum=0;
        int []numbers={1,4,17,7,25,3,100};
        for(int n : numbers) {
            sum=sum+n;
        }
        int average=sum/7;
        for(int n : numbers) {
            if(n>average) {
                System.out.println(n);
            }
        }
         */

        //3
     /*   int []numbers={20,30,40};
        if(numbers[0]>numbers[numbers.length-1]) {
    System.out.println("the larger value between first and last element is :" + numbers[0]);
         }  else
    System.out.println("the larger value between first and last element is :" + numbers[numbers.length-1]);
       }
} */
    //5
        /* int []numbers={2,3,40,1,5,9,4,10,7};
        int x=0;
        for(int i=0;i<numbers.length-1;i++) {
            if(numbers[i]%2==0&&numbers[i+1]%2!=0) {
                x=numbers[i+1];
                numbers[i+1]=numbers[i];
                numbers[i]=x;


            }
        }
        for(int n :numbers) {
            System.out.print(n);
        }
         */
        //6
        int []array1={2,3,6,6,4};
        int []array2={2,3,6,6,4};
        boolean equal=true;
        if(array1.length!=array2.length)

        {
            System.out.print("false");
        }
        else {
            for(int i=0;i<array1.length;i++) {
                if (array1[i]!=array2[i]) {
                    System.out.print("false");
                    break;
                }
            }
        } if (equal)
        {
            System.out.print("true");
        }
    }}
