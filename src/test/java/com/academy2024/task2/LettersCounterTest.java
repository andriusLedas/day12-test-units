package com.academy2024.task2;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class LettersCounterTest {

    @Test
    public void countLettersInString_shouldReturnCorrectNumber_withOneOccurrence() {
        long actual = LettersCounter.countLettersInString('A', "Static word");
        long expected = 0L;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void countLettersInString_shouldReturnCorrectNumber_withMultipleOccurrences() {
        long actual = LettersCounter.countLettersInString('a', "Static apple");
        long expected = 2L;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void countLettersInString_shouldReturnZero_withNoOccurrences() {
        long actual = LettersCounter.countLettersInString('a', "No occurrences");
        long expected = 0L;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void countLettersInString_shouldReturnZero_withStringIsEmpty() {
        long actual = LettersCounter.countLettersInString('a', "");
        long expected = 0L;
        assertThat(actual).isEqualTo(expected);
    }
    @Test
    public void countLettersInStrings_shouldReturnZero_withStringIsEmpty() {
        List<String> testStrings = List.of("", "", "");
        long actual = LettersCounter.countLettersInStrings('a', testStrings);
        long expected = 0L;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void countLettersInStrings_shouldReturnCorrectNumber_withMultipleOccurrences() {
        List<String> testStrings = List.of("Hi", "How", "area");
        long actual = LettersCounter.countLettersInStrings('a', testStrings);
        long expected = 2L;
        assertThat(actual).isEqualTo(expected);
    }

}