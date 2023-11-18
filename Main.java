package solution;

class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int ptr = 0;
        for (int i = 0; i < n; ++i) {
            if (nums[i] == 0) {
                int temp = nums[i];
                nums[i] = nums[ptr];
                nums[ptr] = temp;
                ++ptr;
            }
        }
        for (int i = ptr; i < n; ++i) {
            if (nums[i] == 1) {
                int temp = nums[i];
                nums[i] = nums[ptr];
                nums[ptr] = temp;
                ++ptr;
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 0, 0, 1, 1, 1, 2};
        Solution s = new Solution();
        s.sortColors(nums);
        for(int a:nums)
            System.out.println(a);
    }
}