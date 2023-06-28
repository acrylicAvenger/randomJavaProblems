public class randomFunctions {

    // add three numbers and print average
    void printAverage(int a, int b, int c ){
        int sum = a+b+c;
        int average = sum/3;
        System.out.println("The average is: "+average);
    }

    // sum of all odd numbers from 1 to n
    void oddSum(int n){
        // the sum of first n odd numbers is n^2
        System.out.println(Math.pow(n,2));
    }

    // function to print the gcd of two numbers
    void gcd(int num1, int num2){
        while(num1!=num2){
            if(num1>num2)
                num1=num1-num2;
            else num2 = num2-num1;
        }
        System.out.println("The gcd of the given numbers is: "+num2);
    }

    // fibonacci printing
    int count = 0;
    void fibonacci(int n){
        int a = 0, b = 1;
        System.out.print(a+", ");
        if(n > 1) {
            //find nth term
            for(int i=2; i<=n; i++) {
                System.out.print(b+", ");
                //the concept below is called swapping
                int temp = b;
                b = a + b;
                a = temp;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        randomFunctions object = new randomFunctions();
        object.printAverage(4,5,6);
        object.oddSum(37);
        object.gcd(12,128);
        object.fibonacci(15);
    }
}
