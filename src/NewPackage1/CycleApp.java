package NewPackage1;

public class CycleApp {

    public static void main(String[] args) {


        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            if (i > 6) {
                break;
            }
            System.out.println("*** string " + i + " ***");
        }
        System.out.println(getDividedThree());
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("i= " + i + " j = " + j);
            }
        }
    }


    public static int getDividedThree() {
        for (int i = 1; i < 10; i = i + 2) {
            if (i % 3 == 0) {
                return i;
            }
        }
        return 0;
    }
}

