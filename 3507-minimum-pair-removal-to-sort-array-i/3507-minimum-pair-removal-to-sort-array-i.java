class Solution {
    public int minimumPairRemoval(int[] nums) {
        int operations = 0;

        while (!isSorted(nums)) {
            int minSum = Integer.MAX_VALUE;
            int index = 0;

            for (int i = 0; i < nums.length - 1; i++) {
                int sum = nums[i] + nums[i + 1];

                if (sum < minSum) {
                    minSum = sum;
                    index = i;
                }
            }

            int[] newNums = new int[nums.length - 1];

            for (int i = 0; i < index; i++) {
                newNums[i] = nums[i];
            }

            newNums[index] = nums[index] + nums[index + 1];

            for (int i = index + 2; i < nums.length; i++) {
                newNums[i - 1] = nums[i];
            }

            nums = newNums;
            operations++;
        }

        return operations;
    }

    private boolean isSorted(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                return false;
            }
        }
        return true;
    }
}