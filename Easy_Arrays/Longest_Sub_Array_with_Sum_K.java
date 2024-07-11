class Solution{
    
//    https://www.geeksforgeeks.org/problems/longest-sub-array-with-sum-k0809/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=longest-sub-array-with-sum-k
    public static int lenOfLongSubarr (int [] a, int n, int sum) {
           int curr = 0,max = 0;
           HashMap<Integer, Integer> map = new HashMap<>();
           for (int i = 0; i < n; i++) {
               curr += a[i];
               if (curr == sum) {
                   // i+1 is used here because index starts at 0
                   max = Math.max(max,i+1);
               }
               if (map.containsKey(curr - sum)) {
                //to get max index of subarray
                   max = Math.max(max,i-map.get(curr - sum));
               }
               if(!map.containsKey(curr)){
                    map.put(curr, i);
               }
                  
           }
           return max;
       }
   }