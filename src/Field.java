package TurtleTest;

public class Field {
    public static StringBuilder display(char[][] arr){
        char noOne = '1';
        char noZero = '0';
        StringBuilder result = new StringBuilder();
        for (char[] chars : arr) {
            for (char eachChar : chars) {
                if (eachChar == 'o') result.append(noZero).append("   ");
                if (eachChar == 'x') result.append(noOne).append("   ");
            }
            result.append("\n");
        }
        return result;
    }
    public static void main(String[] args) {
        char[][] arr = new char[3][];
        arr[0] = new char[]{'x','x','o'};
        arr[1] = new char[]{'x','o','x','x'};
        arr[2] = new char[]{'x','o','x'};
        System.out.println(display(arr));
    }
}
