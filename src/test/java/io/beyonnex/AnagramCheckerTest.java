package io.beyonnex;

import java.util.Map;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static io.beyonnex.AnagramChecker.isAnagram;
import static io.beyonnex.AnagramChecker.stringToGroupByMap;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AnagramCheckerTest {

    @Nested
    public class IsAnagram {
        @Test
        void validAnagrams() {
            assertTrue(isAnagram("binary", "brainy"));

            assertTrue(isAnagram("sé", "és"));
        }

        @Test
        void invalidAnagrams() {
            assertFalse(isAnagram("a", "b"));

            assertFalse(isAnagram("aa", "a"));
        }

        @Test
        void withNullParams() {
            assertFalse(isAnagram(null, "b"));

            assertFalse(isAnagram("a", null));

            assertFalse(isAnagram(null, null));
        }
    }

    @Nested
    public class StringToGroupByMap {

        @Test
        void validInput() {
            assertEquals(Map.of('ø', 1, 'b', 2), stringToGroupByMap("øbb"));
        }
    }
}
