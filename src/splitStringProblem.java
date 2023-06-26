import java.util.Scanner;
public class splitStringProblem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        if (s.length() >= 1 && s.length() <= 400000) {
            String[] array = s.split("['@#$%^&*(:<>)!,? ]+");
            System.out.println(array.length);
            for (String a : array)
                System.out.println(a);


        }
    }
}

