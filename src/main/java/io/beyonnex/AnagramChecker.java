package io.beyonnex;

import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public final class AnagramChecker {
    /**
     * Takes O(n)
     *
     * @param s a String
     * @return a Map that contains key: character found in the string -> val: number of times such character is found in the String
     */
    static Map<Character, Integer> stringToGroupByMap(final String s) {
        return IntStream
            .range(0, s.length())
            .mapToObj(s::charAt)
            .collect(Collectors.toMap(x -> x, e -> 1, Math::addExact));
    }

    /**
     *
     * @param word The word for which the anagram "candidate" will be compared against
     * @param candidate Will be compared against word to see if it's an anagram for it (word)
     * @return true if is an anagram, false otherwise or if any of the parameters are NULL
     */
    public static boolean isAnagram(final String word, final String candidate) {
        if (Objects.isNull(word) || Objects.isNull(candidate)) return false;

        if (word.length() != candidate.length()) return false;

        return stringToGroupByMap(word).equals(stringToGroupByMap(candidate));
    }
}
