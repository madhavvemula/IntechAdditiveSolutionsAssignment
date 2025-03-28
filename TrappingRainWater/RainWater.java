public class RainWater {
    public static int trapRainWater(int[] heights) {
        if (heights == null || heights.length < 3) {
            return 0; 
        }

        int left = 0, right = heights.length - 1;
        int leftMax = heights[left], rightMax = heights[right];
        int trappedWater = 0;

        while (left < right) {
            if (leftMax < rightMax) {
                left++;
                leftMax = Math.max(leftMax, heights[left]);
                trappedWater += Math.max(0, leftMax - heights[left]);
            } else {
                right--;
                rightMax = Math.max(rightMax, heights[right]);
                trappedWater += Math.max(0, rightMax - heights[right]);
            }
        }

        return trappedWater;
    }

    public static void main(String[] args) {
        int[] heights = {2, 1, 3, 0, 1, 2, 3};
        System.out.println("Trapped water: " + trapRainWater(heights)); 
        //ouput is 7.
    }
}
