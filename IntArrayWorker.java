public class IntArrayWorker {
    /** two dimensional matrix */
    private int[][] matrix = null;

    /**
     * set the matrix to the passed one
     * 
     * @param theMatrix the one to use
     */
    public void setMatrix(int[][] theMatrix) {
        matrix = theMatrix;
    }

    /**
     * Method to return the total
     * 
     * @return the total of the values in the array
     */
    public int getTotal() {
        int count = 0;
        // loop through all the rows
        for (int[] row : matrix) {
            for (int num : row) {
                count += num;
            }
        }
        return count;
    }

    /**
     * Method to return the total using a nested for-each loop
     * @return the total of the values in the array
     */
    public int getTotalNested() {
        return -1;
    }

    /**
     * Method to return the count of the number of times the passed integer appears
     * in the matrix
     * @param target the integer to count
     * @return the count
     */
    public int getCount(int target) {
        int count = 0;

        // 2d traversal. Test for match and increase count

        return count;
    }

    /**
     * Method to return the largest value in the array
     * 
     * @return the largest value found in the array
     */
    public int getLargest() {
        int largest = matrix[0][0];

        return largest;
    }

    /**
     * Method to return the total of the values in the specified column
     * 
     * @param col the column to total
     * @return the total
     */
    public int getColTotal(int col) {
        // start a counter
        int count = 0;

        
        // return a counter
        return count;        
    }

    /**
     * Method to fill with an increasing count
     */
    public void fillCount() {

    }

    /**
     * print the values in the array in rows and columns
     */
    public void print() {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    /**
     * fill the array with a pattern
     */
    public void fillPattern1() {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                if (row < col)
                    matrix[row][col] = 1;
                else if (row == col)
                    matrix[row][col] = 2;
                else
                    matrix[row][col] = 3;
            }
        }
    }

}