package leetcode;

import java.util.*;

public class twosum {
  public int[] twoSum(int[] numbers, int target) {
    int[] result = new int[2];
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    for (int i = 0; i < numbers.length; i++) {
        if (map.containsKey(target - numbers[i])) {
            result[1] = i + 1;
            result[0] = map.get(target - numbers[i]);
            return result;
        }
        map.put(numbers[i], i + 1);
    }
    return result;
}
  public static void main(String[] args) {
    int[] numbers = {2, 7, 11, 15};
    int target = 9;
    twosum two = new twosum();
    for(int i : numbers)
      System.out.print(i+" ");
    System.out.println();
    for(int i : two.twoSum(numbers,target))
      System.out.println(i);
  }
}

