import java.io.Console;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * Hello
 */
public class Hello {

   
    public static void main(String[] args) {
        
        //Task1
       // System.out.println("“Your time is limited,\n   so don't waste it \n   living someone else's life”\n         Steve Jobs");


        //Task2
        // Scanner in = new Scanner(System.in);
        // int numA, numB;
        // System.out.println("ввидите число");
        // String A= in.nextLine();
        // numA= Integer.parseInt(A);
        // System.out.println("ввидите процент, который необходимо посчитать ");
        // String B= in.nextLine();
        // numB= Integer.parseInt(B);
        // int Res=numA*numB/100;
        // System.out.printf("%d прцентов от %d равно %d",numB,numA,Res);

        //Task3
        // Scanner in = new Scanner(System.in);
        // int iterations=5;
        // int Res=0;
        // for (int i = 0; i < iterations; i++) {
        //     int a= in.nextInt();
        //     Res= Res*10+a;
        // }
        // System.out.printf("результат равен %d", Res);
        
        //Task4
        // Scanner in = new Scanner(System.in);
        // String tmpStr= in.nextLine();
        // try {
        //     Integer.parseInt(tmpStr);
        // } catch (Exception e) {
        //     System.out.println("ОШИБКА!!!! вы ввели не число ");
        //     return;
        // }
        // if(tmpStr.length()!=6)
        // {
        //     System.out.println("ОШИБКА!!!! В числе не 6 цыфр ");
        //     return;
        // }
        // char tmpChar=tmpStr.charAt(1);
        // StringBuilder str= new StringBuilder(tmpStr);
        // str.setCharAt(0, tmpStr.charAt(5));
        // str.setCharAt(5, tmpStr.charAt(0));
        // str.setCharAt(1, tmpStr.charAt(4));
        // str.setCharAt(4, tmpStr.charAt(1));
        // System.out.println(str);
        // //Task6
        // Scanner in = new Scanner(System.in);
        // int Mounth= in.nextInt();
        // switch (Mounth) {
        //     case 12:
        //     case 1:
        //     case 2:
        //     System.out.println("Winter");
        //         break;
        //     case 3:
        //     case 4:
        //     case 5:
        //     System.out.println("Spring");
        //         break;
        //     case 6:
        //     case 7:
        //     case 8:
        //     System.out.println("Summer");
        //         break;
        //     case 9:
        //     case 10:
        //     case 11:
        //         System.out.println("Autumn");
        //         break;

        
        //     default:
        //     System.out.println("ОШИБКА!!!! нето число ");
        //         break;
        // }
        //TAsk7
        // System.out.println("программа выводит все нечетные цыфры в диапазоне ");
        // Scanner in = new Scanner(System.in);
        // System.out.println("задайте диапозон ");
        // int A= in.nextInt();
        // int B= in.nextInt();    
        // if(A>B)
        // {
        //     A=B+A;
        //     B=A-B;
        //     A=A-B;
        // }
        // System.out.println("----Result----");
        // for (int i = A; i < B; i++) {
        //     if(i%2==1)
        //         System.out.println(i);
            
             
        // }
        //Task8
        // System.out.println("программа выводит таблицу умножения в указанном диапазоне ");
        // Scanner in = new Scanner(System.in);
        // System.out.println("задайте диапозон ");
        //  int A= in.nextInt();
        // int B= in.nextInt();    
        // if(A>B)
        // {
        //     A=B+A;
        //     B=A-B;
        //     A=A-B;
        // }
        // System.out.println("----Result----");
        // for (int i =A; i <= B; i++) {
        //     for (int j = 1; j <= 10; j++) {
        //         System.out.println();
        //         System.out.printf("%d*%d=%d",i,j,i*j);
        //     }
        // }
        // //Task9
        // System.out.println("программа может определить минимальный и максимальный элементы, посчитать количество отрицательных элементов, посчитать количество положительных элементов, посчитать количество нулей ");
        // Random rand= new Random();
        // int arr[]= new int[10];
        // for (int i = 0; i < arr.length; i++) {
        //     arr[i]= rand.nextInt(30)-15;
        // }
        // int min=15;
        // int max=-15;
        // int ZeroCount=0;
        // int PozCount=0;
        // int NegCount=0;
        // for (int i = 0; i < arr.length; i++) {
        //     if(arr[i]<min)
        //         min=arr[i];
        //     if(arr[i]>max)
        //         max=arr[i];
        //     if(arr[i]==0)
        //         ZeroCount++;
        //     if(arr[i]>0)
        //         PozCount++;
        //     if(arr[i]<0)
        //         NegCount++;
        // }
        // System.out.printf("MIN=%d\nNAX=%d\nZerroes-%d\nPozNumbers-%d\nNegNumbers-%d",min,max,ZeroCount,PozCount,NegCount);
        //Task10
        // Random rand= new Random();
        // int arr[]= new int[10];
        // for (int i = 0; i < arr.length; i++) {
        //     arr[i]= rand.nextInt(30)-15;
        // }
        
        // List<Integer> even= new ArrayList<Integer>();
        // List<Integer> odd= new ArrayList<Integer>();
        // List<Integer> neg= new ArrayList<Integer>();
        // List<Integer> poz= new ArrayList<Integer>();
       
        // for (int i = 0; i < arr.length; i++) {
        //     if(arr[i]>0)
        //         poz.add(arr[i]);
        //     if(arr[i]<0)
        //         neg.add(arr[i]);
        //     if(arr[i]%2==1)
        //         even.add(arr[i]);
        //     if(arr[i]%2==0)
        //         odd.add(arr[i]);
        // }
        // //если делать в масивах нужно либо хардкодить либо я не знаю как, изза нулей, масивы выглядить не информативно  
        // System.out.printf("ДЛИНЫ ПОЛУЧИВШИХСЯ МАСИВОВ:\nPoz-%d\nNeg-%d\nEven-%d\nOdd-%d",poz.size(),neg.size(),even.size(),odd.size());
        //TAsk11
        //PrintLine(10,false, '@');
        //Task12
        int arr[]={1,7,4,3,8,12};
    
        SortArray(arr,false);
        System.out.print(Arrays.toString(arr));
        
        

    }

    static void SortArray(int[] array,boolean byIncrease)
    {
        if(byIncrease)
            Arrays.sort(array);
        else
        {
            Arrays.sort(array);
            int temp[]= new int [array.length];
            int j=0;
            for (int i = temp.length-1; i >= 0; i--)
            {
              temp[j]=array[i];
              j++;
            } 
            for (int i = 0; i < array.length; i++) {
                array[i]=temp[i];
            }
        }
    }

    static void PrintLine(int lenth,boolean vertical,char Symb)
    {
        for (int i = 0; i < lenth; i++)
        {
            if(vertical)
                System.out.println(Symb);
            else
                System.out.print(Symb);
            
        }

    }
}