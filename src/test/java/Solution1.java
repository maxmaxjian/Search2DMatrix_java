public class Solution1 implements Solution {
    @Override
    public boolean searchMatrix(int[][] matrix, int target) {

        int nr = matrix.length, nc = nr > 0 ? matrix[0].length : 0;
        if (nc == 0) {
            return false;
        }
        int b = 0, e = nr*nc-1, mid;
        if (b == e) {
            return matrix[0][0] == target;
        } else {
            while (b < e - 1) {
                mid = (b+e)/2;
                int i = mid/nc, j = mid%nc;
                if (matrix[i][j] == target) {
                    return true;
                } else if (matrix[i][j] < target) {
                    b = mid;
                } else {
                    e = mid;
                }
            }
            if (matrix[b/nc][b%nc] == target) {
                return true;
            }
            if (matrix[e/nc][e%nc] == target) {
                return true;
            }

            return false;
        }
    }
}
