class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int [] merged = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, merged, 0, nums1.length);
        System.arraycopy(nums2, 0, merged, nums1.length, nums2.length);

        Arrays.sort(merged);

        double result = 0;
        if (merged.length % 2 == 0) {
            result = (merged[merged.length / 2] + merged[merged.length / 2 - 1]) / 2.0;
        } else {
            result = merged[(merged.length - 1) / 2];
        }
        return result;
    }
}