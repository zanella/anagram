package io.beyonnex;

public class Main {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Two words are needed");

            System.exit(1);
        }

        System.out.println(
            String.join(
                " ",
                args[1],
                (AnagramChecker.isAnagram(args[0], args[1]) ? "is" : "isn't"),
                "an anagram of",
                args[0]
            )
        );
    }
}
