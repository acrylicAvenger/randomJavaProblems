public class javaPattern {
    public static void main(String ards[]){
        // rectangle
        for(int i=0; i<4; i++){
            for(int j=0; j<5;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // hollow rectangle
        for(int i=0;i<4;i++){
            for(int j=0;j<5;j++){
                if(i==0||i==3||j==0||j==4){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        //right angled triangle for n=4
        for(int i=0;i<4;i++){
            for(int j=0;j<=i;j++) {
                System.out.print("*");
//                if (i < j)
//                    System.out.print(" ");
//                else System.out.print("*");
            }
            System.out.println();
        }

        //inverted right angled triangle
        for(int i=4;i>0;i--){
            for(int j=i;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }

        // straight right triangle on right hand side
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4;j++){
                if(j<=4-i)
                    System.out.print(" ");
                else System.out.print("*");
            }
            System.out.println();
        }

        // right triangle formed using numbers
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

        // same triangle as above just inverted
        for(int i=5;i>0;i--){
            for(int j=i;j>0;j--){
                System.out.print(j);
            }
            System.out.println();
        }

        // floyd's triangle
        int temp=1;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(temp);
                temp++;
            }
            System.out.println();
        }

        // 0-1 triangle
        // we visualize the triangle as a matrix and the sum of the indices tell if the digit is 1 or 0
        // for even sum the digit is 1 and for odd sum the digit is 0
        for(int i=1;i<=5;i++){
            for (int j=1;j<=i;j++){
                int sum = i+j;
                if (sum%2==0) System.out.print(1);
                else System.out.print(0);
            }
            System.out.println();
        }
    }
}
