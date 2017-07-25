
// Q. Given an array of integers, return indices of the two numbers such that they add up to a specific target.

// You may assume that each input would have exactly one solution, and you may not use the same element twice.

/*

Example:
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].

*/

//-------------------SOLUTION-------------------//
import java.util.*;
public class problem1 {
    public int[] twoSum(int[] nums, int target) {
        int arr[]=new int[2],pos=-1;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++)
        {
            int diff = target - nums[i];
            if(map.get(diff)!=null && map.get(diff)!=i)
            {
                arr[0]=i;
                arr[1]=map.get(diff);
                return arr;
            }
        }
        return arr;
    }
}
