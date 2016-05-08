import java.util.Scanner;

public class Pangrams {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] a = new int[26];
        int count =0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>=65 && s.charAt(i)<=90){
                if(a[s.charAt(i)-65]==0)
                    count++;
                a[s.charAt(i)-65]++;
            }
            else if(s.charAt(i)>=97 && s.charAt(i)<=122){
                if(a[s.charAt(i)-97]==0)
                    count++;
                a[s.charAt(i)-97]++;
            }
        }
        if(count==26)
            System.out.println("pangram");
        else
            System.out.println("not pangram");
    }

}