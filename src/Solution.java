class Solution {
    public int minArray(int[] numbers) {
        int len = numbers.length;
        int low = 0;
        int high = len - 1;
        if (len == 0) {
            return 0;
        }
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (numbers[mid] < numbers[high] ) {
                high = mid ;
            } else if (numbers[mid] > numbers[high] ) {
                low = mid + 1;
            }else if (numbers[mid] == numbers[high]){
                high--;
            }
        }
        if(high < 0){
            return numbers[0];
        }
        return numbers[low];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int i = solution.minArray(new int[]{3,1,1});
        System.out.println("i = " + i);
    }
}