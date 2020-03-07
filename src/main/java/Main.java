public class Main {
    public static void main(String[] args) {
        permutation("", "1234");
    }

    private static void permutation(String perm, String word) {
        if(word.isEmpty()) {
            System.out.println(perm);
        }
        for (int i = 0; i < word.length(); i++) {
            permutation(
                    perm + word.charAt(i),
                    word.substring(0, i) + word.substring(i + 1, word.length()));
        }
    }
}
