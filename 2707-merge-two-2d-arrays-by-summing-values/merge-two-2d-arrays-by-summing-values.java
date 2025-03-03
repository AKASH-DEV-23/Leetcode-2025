class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        Map<Integer,Integer> map=new TreeMap<>();
        for(int[] num:nums1){
            map.put(num[0],num[1]);
        }
        for(int[] num:nums2){
            map.put(num[0],map.getOrDefault(num[0],0)+num[1]);
        }
        int[][] ans = new int[map.size()][2];
        int i=0;
        for(int key:map.keySet()){
            ans[i][0]=key;
            ans[i++][1]=map.get(key);
        }
        return ans;
    }
}