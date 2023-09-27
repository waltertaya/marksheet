import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;
        float average;
        int i = 0;
        int[] scores = new int[4];
        String[] unitCode = new String[4];
        System.out.println("Enter your the Unit code and the score.");
        String[] unitName = {"Database","Systems","Algorithm","Statistics"};
        for (i=0;i < 4; i++) {
             System.out.print("Score: ");
             scores[i] = input.nextInt();
             total += scores[i];
             System.out.print("Unit code: ");
             unitCode[i] = input.next();
        }
        System.out.println("                         Department of Computer Science");
        System.out.println("                             End Semester Results");
        String dot = new String(new char[80]).replace('\0','.');
        System.out.println(dot);
        System.out.println("|Name:-Walter Onyango        |Roll_No: C026-01-0978/2022           Semester: 2.2");
        String line = new String(new char[80]).replace('\0','_');
        System.out.println(line);
        System.out.println("|Unit code                   |Unit Name                            Score");
        System.out.println(dot);
        for (i = 0; i < 4; i++) {
             System.out.println("|"+unitCode[i]+"                     |"+unitName[i]+"\t\t\t\t\t\t\t\t"+scores[i]);
        }
        average = (float)total/4;
        System.out.println("|Average                                                           |"+ average);
        System.out.println(dot);
        System.out.println("|Average                                                           |A");
        System.out.println(dot);
        System.out.println("                                                    Recommendation |");
        System.out.println(dot);
        System.out.println("Grading Criteria                    Overall Grade(A-D)             Recommend Pass");
        System.out.println("70-100          A");
        System.out.println("60-69           B");
        System.out.println("50-59           C");
        System.out.println("40-49           D");
        System.out.println("Below 40        F");
        System.out.println("70-100          A");
   }
}
