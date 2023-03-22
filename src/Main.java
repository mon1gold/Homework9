import exception.ArrayDataException;
import exception.ArraySizeException;

public class Main {
    public static void main(String[] args) {
        String[][] matrix = {{"1", "2", "3", "4"},
                             {"1", "2", "3", "4"},
                             {"1", "2", "3", "4"},
                             {"1", "2", "3", "4"}};

        ArrayValueCalculator arrayValueCalculator = new ArrayValueCalculator();
        try {
            System.out.println(arrayValueCalculator.doCalc(matrix));

        } catch (ArraySizeException arraySizeException) {
            System.out.println(arraySizeException.getMessage());
        } catch (ArrayDataException arrayDataException) {
            System.out.println("Incorrect data: " + arrayDataException.getMessage());
        }
    }
}