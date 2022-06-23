import java.util.*;

public class Main {


    public static int fact(int n)
    {
        if(n==1)
            return 1;
        int subProblem=fact(n-1);

        return n*subProblem;
    }

    public static int fibonacciSeries(int n)
    {
        if(n==0)
            return 0;
        if(n==1)
        {
            return 1;
        }
        int sum1=fibonacciSeries(n-1);
        int sum2=fibonacciSeries(n-2);
        return sum1+sum2;
    }
    public static void printNatural(int n)
    {
        if(n==0)
            return;
        printNatural(n-1);
        System.out.print(n+"\t");
        return;
    }
    public static void printNaturalDec(int n)
    {
        if(n==0)
            return;
        System.out.println(n);
        printNaturalDec(n-1);
    }

    public static void printIncDesc(int n)
    {
        if(n==1)
        {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printIncDesc(n-1);
        System.out.println(n);
    }

    public static int blength(int n)
    {
        if(n==1)
            return 2;
        if(n==2)
            return 3;
        return blength(n-1)+blength(n-2);
    }


    public static void main(String[] args) {

    }
}

