import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        long m = read.nextLong();
        long n = read.nextLong();
        long a = read.nextLong();
        long i=m/a;
        long j=n/a;
        if(m%a!=0)
            i++;
        if(n%a!=0)
            j++;
        System.out.println(i*j);
    }

}