public class Test {
    public static void main(String[] args) {
        //10 is missing
        int[] numbers = {1,2,3,4,5,7,8,9,10,11,12};

        int N = 12;
        int idealSum = (N * (N + 1)) / 2;
        int sum = calculateSum(numbers);

        int missingNumber = idealSum - sum;
        System.out.println(missingNumber);
    }

    private static int calculateSum(int[] numbers) {
        int sum = 0;
        for (int n : numbers) {
            sum += n;
        }
        return sum;
    }
}