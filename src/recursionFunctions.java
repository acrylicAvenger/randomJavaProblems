import java.awt.image.SinglePixelPackedSampleModel;

public class recursionFunctions {
    void printSum(int i, int n, int sum){
        if(i==n){
            sum += i;
            System.out.println("The sum using recursion is: " + sum);
            return;
        }
        sum+=i;
        printSum(i+1, n, sum);
    }

    void printFactorial(int num, int product){
        // the product will be 1 in the beginning
        if (num == 0 || num == 1){
            System.out.println("The factorial using recursion is: " + product);
            return;
        }
        product *= num;
        printFactorial(num-1, product);
    }

    void printFibonacciSequence(int term1, int term2, int n){
        // term1 and term2 are 0 and 1 in the beginning respectively
        if (n==0){
            return;
        }
        int term3 = term1 + term2;
        System.out.print(term3 + " ");
        printFibonacciSequence(term2, term3, n-1);
    }

    // print x^n
    int xRaisedToN(int x, int n){
        if(n==1)
            return x;
        if(n==0)
            return 1;
        int nMinus1 = xRaisedToN(x,n-1);
        x = x * nMinus1;
        return x;
    }

    // above code optimized for stack height = logn.
    int xRaisedToNPart2(int x, int n){
        if(n==0)
            return 1;
        if(n==1)
            return x;
        if(n%2==0)
            return xRaisedToNPart2(x,n/2)*xRaisedToNPart2(x,n/2);
        else{
            return x * xRaisedToNPart2(x,(n-1)/2) * xRaisedToNPart2(x,(n-1)/2);
        }
    }

    // reverse a string using recursion
    void reverseString(String string, int index){
        if(index==0){
            return;
        }
        System.out.println(string.charAt(index));
        reverseString(string, index-1);
    }


    void towerOFHanoi (int num, String source, String destination, String helper){
        if(num==1) {
            System.out.println("Transfer disk " + num + "from " + source + "to " + destination);
            return;
        }
        towerOFHanoi(num-1,source, helper,destination);
        System.out.println("Transfer disk " + num + "from " + source + "to " + destination);
        towerOFHanoi(num-1, helper, source, destination);
    }

    // find the first and the last occurrence of a character in a string
    public  int firstOccurrence=-1, lastOccurrence=-1;
    void firstAndLastOccurrence(String string, char character, int index){
        // initialize index with 0
        if(index==string.length()){
            System.out.println("First and last occurrences are respectively: ");
            System.out.println(firstOccurrence);
            System.out.println(lastOccurrence);
            return;
        }
        if(string.charAt(index)==character){
            if(firstOccurrence==-1)
                firstOccurrence = index;
            else lastOccurrence = index;
        }

        firstAndLastOccurrence(string, character, index+1);
    }

    public String[] keypad = {".", "abc", "def", "ghi","jkl", "mno", "pqrs", "tu", "vwx", "yz"};
    void printKeypadCombinations(String inputNumbers, int index, String combination){

        if(index==inputNumbers.length()){
            System.out.println(combination);
            return;
        }
        String mappings = keypad[inputNumbers.charAt(index) - '0'];
        for(int i=0; i<mappings.length();i++){
            printKeypadCombinations(inputNumbers,index+1,combination+mappings.charAt(i));
        }
    }

    public static void main(String[] args) {
        recursionFunctions object = new recursionFunctions();
        object.printSum(1,5,0);
        object.printFactorial(6,1);
        object.towerOFHanoi(6,"1","3","2");

        // reverse string
        String string = "aabcdeafgh";
        object.reverseString(string, string.length()-1);

        // fibonacci
        int a=0,b=1,n=8;
        System.out.println("The fibonacci sequence is as follows: ");
        System.out.print(a + " ");
        System.out.print(b + " ");
        object.printFibonacciSequence(a,b,n);
        System.out.println();

        // xRaisedToN
        int exponential = object.xRaisedToN(3,3);
        System.out.println(exponential);

        // first and last occurrence of a character
        int index = 0;
        object.firstAndLastOccurrence(string,'a',0);

        // keypad
        object.printKeypadCombinations("23",0,"");
    }

}
