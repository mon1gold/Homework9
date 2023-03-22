import exception.ArrayDataException;
import exception.ArraySizeException;

public class ArrayValueCalculator {
    private static final int ARRAY_ROW_NUMBER = 4;
    private static final int ARRAY_COLUMN_NUMBER = 4;

    public int doCalc(String[][] array) throws ArraySizeException, ArrayDataException {
        int result = 0;
        for (String[] row : array) {
            if (row.length != ARRAY_COLUMN_NUMBER) {
                throw new ArraySizeException("Number of elements in row should be " + ARRAY_COLUMN_NUMBER);
            }
        }
        if (array.length != ARRAY_ROW_NUMBER) {
            throw new ArraySizeException("Number of rows should be " + ARRAY_ROW_NUMBER);
        }

        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                try {
                    result += Integer.parseInt(array[row][column]);
                } catch (NumberFormatException numberFormatException) {
                    throw new ArrayDataException("array[" + row + "][" + column + "] = " + array[row][column]);
                }
            }
        }
        return result;
    }
}
