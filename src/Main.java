public class Main {

    public static void main(String[] args) {
        pileOuFace();
        oneStepArray();
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

    public static void oneStepArray(){
        double[] result={Math.random(),Math.random(),Math.random(),Math.random()};
        for (double member : result) System.out.println(member);
    }
}
