class Solution {
    public long maximumTripletValue(int[] nums) {
        int n=nums.length;
        long maxi=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    long num=nums[i]-nums[j];
                    num=num*nums[k];
                    maxi=Math.max(maxi,num);
                }
            }
        }
        return maxi;
    }
}