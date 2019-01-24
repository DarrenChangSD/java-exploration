import java.util.*;

public class threeSumSmaller {

    public static void main(String[] args) {

      int[] nums = {-2, 0, 1, 3};
      int target = 2;
      threeSumSmaller(nums, target);
    }

    public int threeSumSmaller(int[] nums, int target) {
        //initialize total count to zero
        int count = 0;

        //sort the array
        Arrays.sort(nums);

        //loop through entire array
        for(int i = 0; i < nums.length - 2; i++) {
            //set left to i + 1
            int left = i + 1;
            //set right to end of array
            int right = nums.length - 1;

            //while left index < right index
            while(left < right) {
                //if the 3 indices add to less than the target increment count
                if(nums[i] + nums[left] + nums[right] < target) {
                    //increment the count by the distance between left and right because the array is sorted
                    count += right - left;

                    //increment left pointer
                    left++;
                } else {
                    //if they sum to a value greater than target...
                    //decrement right pointer
                    right--;
                }
            }
        }
        return count;
    }
}
