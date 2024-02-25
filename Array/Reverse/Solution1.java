package Array.Reverse;

public class Solution1 {
    
    static char s[] = {'s', 'o', 'n', 'u'};

    static void reverseChar(char[] character) {

        for(int i=0, j=character.length-1; i<j; i++, j--) {
            char temp = character[i];
            character[i] = character[j];
            character[j] = temp;
        }

    }


public static void main(String[] args) {
    reverseChar(s);
    for (char c : s) {
        System.out.print(c + " ");
    }
}

}
