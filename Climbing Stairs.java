class Solution {
    public int climbStairs(int n)
    {
        int dp[] = new int[n+1];
        return steps(dp,n);
    }
    
    int steps(int dp[],int n)
    {
        if(n==0)
        {
            return 1;
        }
        if(n==1)
        {
            return dp[n]=1;
        }
        if(dp[n]>1)
        {
            return dp[n];
        }
        int left = steps(dp,n-1);
        int right = steps(dp,n-2);
        return dp[n] = left+right;        
    }
    
}
