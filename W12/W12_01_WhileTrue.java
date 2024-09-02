package W12;

public class W12_01_WhileTrue {

    public static void main(String[] args) {

        int i = 0;
        while (true) {
            i++;
            System.out.print(i + " ");

            if (i >= 1000) {
                break;

            }

            // if(i>=1000) break;
        }

    }
}
