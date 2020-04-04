import java.util.*;

public class Main {
    //Новое решение задачи с удалением элемента из массива.
    public static void main(String[] args) {
        int test_array[] = {0,1,2,2,3,0,4,2};
            System.out.println(Arrays.toString(removeElement(test_array, 0)));
        }
        public static int[] removeElement(int[] nums, int val) {
            int offset = 0;
            for(int i = 0; i< nums.length; i++){
                if(nums[i] == val){
                    offset++;
                } else{
                    nums[i - offset] = nums[i];
                }
            }
            return Arrays.copyOf(nums, nums.length - offset);
    }
}

