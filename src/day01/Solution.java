package day01;


public class Solution {
	public static void main(String[] args) {
		int[] nums = { 3, 2, 4, 9, 10 };

		int[] result = forSum(nums, 0, 6);
		if (result != null) {
			System.out.println(result[0] + "@@" + result[1]);
		}
	}

	public static int[] twoSum(int[] nums, int target) {
		return forSum(nums, 0, target);
	}

	public static int[] forSum(int[] nums, int i, int target) {

		if (i < nums.length - 1 && i >= 0) {
			for (int j = i + 1; j < nums.length; j++) {
				int sum = nums[i] + nums[j];
				if (sum == target) {
					int[] result = new int[2];
					result[0] = i;
					result[1] = j;
					return result;
				}
			}
			i++;
			return forSum(nums, i, target);
		}
		return null;
	}
}
