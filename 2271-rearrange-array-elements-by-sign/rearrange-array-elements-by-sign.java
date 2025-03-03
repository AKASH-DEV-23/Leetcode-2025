class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int i=0;
        int j=1;
        int[] ans = new int[n];
        for(int num:nums){
            if(num>0){
                ans[i]=num;
                i+=2;
            }else{
                ans[j]=num;
                j+=2;
            }
        }
        return ans;
    }
}