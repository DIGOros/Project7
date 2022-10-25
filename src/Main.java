import java.util.Random;

public class Main {
    public static int[] randomArray(int lengthOfRandomArray) {
        Random random = new Random();
        int[] ranArray = new int[lengthOfRandomArray];
        for (int i = 0; i < lengthOfRandomArray; i++) {
            ranArray[i] = random.nextInt(100);

        }
        return ranArray;
    }

    public static void println(String s) {
        System.out.println(s);
    }

    public static void print(String s) {
        System.out.print(s);
    }
    public static void printArray(int[] array) {
        for (int i : array) {
            print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] array = randomArray(5);
        boolean swappedPart1 = true;
        while (swappedPart1) {
            swappedPart1 = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    swappedPart1 = true;
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
        printArray(array);


        int[] arr = {18, 21, 7, 33, 9, 52};
        boolean swappedPart2 = true;
        while (swappedPart2) {
            swappedPart2 = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    swappedPart2 = true;
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        printArray(arr);
    }
}

