
import java.util.List;

public class MaxMinusMin {
    private Integer min(List<Integer> nums)
    {
        if(nums == null)
        {
            throw new IllegalArgumentException("min(List): List cannot be empty");
        }
        Integer min = nums.get(0);
        for(int i = 1; i < nums.size(); ++i)
        {
            if(nums.get(i) < min) min = nums.get(i);
        }
        return min;
    }
    private Integer max(List<Integer> nums)
    {
        if(nums == null)
        {
            throw new IllegalArgumentException("max(List): List cannot be empty");
        }
        Integer max = nums.get(0);
        for(int i = 1; i < nums.size(); ++i)
        {
            if(nums.get(i) < max) max = nums.get(i);
        }
        return max;
    }
    /**
     * Return the difference between the highest and lowest values of the List.
     * This will require you to know some of the List interface methods.
     *
     * @param nums an List<Integer> containing varying nums.
     * @return the max value of nums minus the min value of nums.
     */
    public int difference(List<Integer> nums){
        Integer min, max;
        min = max = nums.get(0);
        for(int i = 1; i < nums.size(); ++i)
        {
            int current = nums.get(i);
            if( current < min ) min = current;
            if( current > max ) max = current;
        }
    
        
        return max - min;
    }
}
