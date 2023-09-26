import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String sums = new String(new char[80]).replace('\0', '_');
        Integer[] sNo = new Integer[3];
        // Integer[] total = new Integer[3];
        Integer i,j,t1 = 0,t2 = 0,t3 = 0,t4 = 0,t5 = 0;
        Integer[] S5 = new Integer[3];
        Integer[] S1 = new Integer[3];
        Integer[] S2 = new Integer[3];
        Integer[] S3 = new Integer[3];
        Integer[] S4 = new Integer[3];
        String[] name = new String[3];
        // name[0] = "Kathir";
        for(i = 0;i < 3;i++) {
            System.out.print("Enter student number: ");
            sNo[i] = input.nextInt();
            System.out.print("Enter student name: ");
            name[i] = input.next();
            System.out.print("Enter sub1: ");
            S1[i] = input.nextInt();
            System.out.print("Enter sub2: ");
            S2[i] = input.nextInt();
            System.out.print("Enter sub3: ");
            S3[i] = input.nextInt();
            System.out.print("Enter sub4: ");
            S4[i] = input.nextInt();
            System.out.print("Enter sub5: ");
            S5[i] = input.nextInt();
        }
        for(i = 0;i < 3;i++) {
            t1 += S1[i];
            t2 += S2[i];
            t3 += S3[i];
            t4 += S4[i];
            t5 += S5[i];

        }
        Integer[] average = {(t1/3),(t2/3),(t3/3),(t4/3),(t5/3)};
        System.out.println("Welcome to Student Mark List Application");

        System.out.println(sums);
        System.out.println("sNo		Student Name		Sub1		Sub2		Sub3		Sub4		Sub5		Total");
        System.out.println(sums);
        for (i = 0;i < 3;i++) {
            for(j = 0;j < 8;j++) {
                System.out.println(sNo[j] +"	" + name[j] +"	"+ S1[j]+"	"+S2[j]+"	"+S3[j]+"	"+S4[j]+"	"+S5[j]+"		"+(S1[j]+S2[j]+S3[j]+S4[j]+S5[j])+"		"+((S1[j]+S2[j]+S3[j]+S4[j]+S5[j]/5)));
            }
        }
        for(i = 0;i < 5;i++) {
            System.out.print("             "+average[i] + "		");
        }
        System.out.println(sums);
    }
}