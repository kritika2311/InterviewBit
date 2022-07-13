# Rotate Array By B Positions.

public class Solution {
	public ArrayList<Integer> rotateArray(ArrayList<Integer> A, int B) {
		ArrayList<Integer> ret = new ArrayList<Integer>();
        B = B % (A.size());
		int j =0;
        for (int i = 0; i < A.size(); i++) {
			if(i+B < A.size())
              ret.add(A.get(i + B));
            else
               ret.add(A.get(j++));
		}
        
		return ret;
	}
}


