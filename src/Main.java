import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        pileOuFace();
        oneStepArray();
        twoStepArray();
        numberOfArgs(args);
        revertArgs(args);
        pileOuFacev2();
    }

    private static void revertArgs(String[] args) {
        for (int i = (args.length)-1; i >= 0 ; i--) {
            System.out.println(args[i].toUpperCase());
        }
    }

    public static void pileOuFace() {
        double result;
        for (int i = 0; i <=10 ; i++) {
            result = Math.random();
            if (result <0.5)
                System.out.println("pile");
            else
                System.out.println("face");
        }
    }

    public static void pileOuFacev2() {
        double result;

        Scanner input = new Scanner(System.in);
        int nb = input.nextInt();
        for (int i = 0; i <=nb ; i++) {
            result = Math.random();
            if (result <0.5)
                System.out.println("pile");
            else
                System.out.println("face");
        }
    }

    public static void oneStepArray(){
        double[] result={Math.random(),Math.random(),Math.random(),Math.random()};
        for (double member : result) System.out.println(member);
    }

    public static void twoStepArray(){
        double[] result=new double[100];
        double endResult=0;
        for (int i = 0; i <100 ; i++) {
            result[i]=Math.random();
            endResult=endResult+Math.sqrt(result[i]);
        }
        System.out.println("sum of square root :"+endResult);
    }

    public static void numberOfArgs(String[] args) {
        System.out.println("Number of args " + args.length);

    }
}
