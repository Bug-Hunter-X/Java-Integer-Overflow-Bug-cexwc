public class UncommonBug {
    public static void main(String[] args) {
        int x = Integer.MAX_VALUE;
        int y = 1;
        int z = x + y; // Overflow occurs here
        System.out.println(z); // Output will be a negative number due to integer overflow
    }
}