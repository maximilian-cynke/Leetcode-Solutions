package leetcode;

public class BinarySearch {

    public static void main(String[] args) {

        int[] nums = {-5, -1,0,3,5,9,12,16,97,142,967,3442,735467,23534554};

        // Invalid number
        int target = -20;

        System.out.println(search(nums,target));

    }


    public static int search(int[] nums, int target) {

        int lo = 0;
        int hi = nums.length - 1;

        while (lo <= hi) {
            int mi = lo + (hi - lo) / 2;
            if (nums[mi] == target){
                return mi;
            } else if (nums[mi] < target) {
                lo = mi + 1;
            } else {
                hi = mi - 1;
            }
        }
        return -1;
    }


}
