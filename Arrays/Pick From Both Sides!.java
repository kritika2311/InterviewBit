#Sliding Window Concept.

public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
        
        if(A.size() == 1 && B == 1)
            return A.get(0);
        if(A.size() == 0)
            return 0;
            
        int sum=0, front  = B-1, back = A.size()-1;
        int currsum =0, count = 0;
        
        for(int i =0; i<B; i++)
        {
            currsum += A.get(i);
        }
        sum = currsum;
        
        while( count != B)
        {
            currsum -= A.get(front);
            currsum += A.get(back);
            sum = Math.max(currsum , sum);
            front--;
            back--;
            count++;
        }
        
        return sum;
    }
}
