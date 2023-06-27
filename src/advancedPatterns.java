public class advancedPatterns {
    public static void main(String[] args) {
        // print butterfly using star
        int n=4;
        // upper half
        for(int i=1;i<=n;i++){
            // for the first triangle
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            // loop for the spaces
            for(int p=1;p<=2*(n-i);p++){
                System.out.print("  ");
            }
            // loop for right hand side triangle
            for (int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        // loop for lower half
        for(int i=n;i>=1;i--){
            // for the left hand side
            for(int k=1;k<=i;k++){
                System.out.print("* ");
            }
            // loop for spaces
            for(int k=2*(n-i);k>=1;k--){
                System.out.print("  ");
            }
            // loop for right hand side triangle
            for (int p=1;p<=i;p++){
                System.out.print("* ");
            }
            System.out.println();
        }

        // print a rhombus
        for(int i=n;i>=1;i--){
            // print spaces
            for(int j=1;j<=i-1;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=n;k++){
                System.out.print("* ");
            }
            System.out.println();
        }

        // number pyramid
        int numRows = 5;
        for(int i=1;i<=numRows;i++){
            // spaces
            for(int j=numRows-1;j>=i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(i+" ");
            }
            System.out.println();
        }

        // palindromic pyramid
        for(int i=1;i<=numRows;i++){
            //spaces
            for(int j=numRows-1;j>=i;j--){
                System.out.print(" ");
            }
            //first half triangle
            for(int k=i;k>=1;k--){
                System.out.print(k);
            }
            // second half triangle
            for(int p=2;p<=i;p++){
                System.out.print(p);
            }
            System.out.println();
        }

        // diamond using stars
        // upper half
        for(int i=1;i<=numRows;i++){
            //spaces
            for(int j=numRows-1;j>=i;j--){
                System.out.print("  ");
            }
            // stars of upper half triangle
            for(int k=1;k<=2*i-1;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        // lower half
        for(int i=numRows;i>=1;i--){
            // spaces
            for(int j=numRows-1;j>=i;j--){
                System.out.print("  ");
            }
            // lower half stars
            for(int k=1;k<=2*i-1;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
