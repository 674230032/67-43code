package W13;

public class W13_03_Array_CountOddEven {

    public static void main(String[] args) {
        int[] numbers = {1, 5, 6, 34, 12, 77, 11, 9, 3, 2, 8, 4, 7, 10, 13, 15, 16, 18, 20, 21};

        int countOdd = 0;
        int countEven = 0;
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
            if (numbers[i] % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }
        System.out.println("\n Amount of all Number" + numbers.length);
        System.out.println("Amount of all Number" + countOdd);
        System.out.println("Amount of all Number" + countEven);

    }
}
