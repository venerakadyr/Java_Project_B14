package homeTask;

//import java.util.Scanner;

import java.util.Arrays;

public class AdditionQuiz {

    public  static void main(String [] args ){




//        int number1 = (int)(System.currentTimeMillis() % 10);
//        int number2 = (int)(System.currentTimeMillis() / 7 % 10);
//
//
//          Scanner input=new Scanner(System.in);
//           System.out.println("what is "+number1 +" + "+ number2 +" ?");
//
//           int number=input.nextInt();
//
//           System.out.println( number1+ " + " +number2+ " = "+ number +" is "+ (number1+number2==number));


//   Task
//   Assuming that x is 1,
//   show the result of the following Boolean expressions:
// (x > 0)
// (x < 0)
// (x != 0)
// (x >= 0)
// (x != 1)


//     boolean n1= (1>0);
//     boolean n2=(1<0);
//     boolean n3=(1!=0);
//     boolean n4=(1>=0);
//     boolean n5=(1!=1);
//     System.out.println(n1);
//     System.out.println(n2);
//     System.out.println(n3);
//     System.out.println(n4);
//     System.out.println(n5);

//result
//true
//false
//true
//true
//false

// casting with boolean
//        boolean b = true;
//        i = (int)b;
//        int i = 1;
//        boolean b = (boolean)i;
       int [] a={1,2,3,3};
       int [] b={};
        int [] newArr=new int[2];
        if(a.length==0&&b.length==0){
//            System.out.println(Arrays.toString(newArr));
        }else if(a.length>0&&b.length==0){
            newArr[0]=a[0];
            System.out.println(newArr[0]);
        }else if (a.length==0&&b.length>0){
             newArr[0]=b[0];
            System.out.println(newArr[0]);
        }else{
            newArr[0]=a[0];
            newArr[1]=b[0];
        }
        System.out.println(Arrays.toString(newArr));
    }


    }







