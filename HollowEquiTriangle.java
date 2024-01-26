public class HollowEquiTriangle {
    public static void main(String[] args) {

        int n = 4; // height
        int star = 1;
        int space = n - 1;

        // Print the equilateral triangle
        for (int i = 1; i <= n; i++) {

            // Print spaces before the '*' to create the triangular shape
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }

            // Print '*' for the first and last column in each row
            for (int j = 1; j <= star; j++) {
                if(i == n){
                    System.out.print("*");
                }else if (j == 1 || j == star) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }

            space--;
            star += 2;

            // Move to the next line after each row
            System.out.println();
        }
    }
}
