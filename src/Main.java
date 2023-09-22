public class Main {
    public static int findMajorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
                count = 1;
            } else if (candidate == num) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 1, 2,2};
        int majorityElement = findMajorityElement(nums);

        System.out.println("Мажоритарный элемент: " + majorityElement);
    }
}