package com.academy2024.task3;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class LibraryTest {

    @Mock
    private Library library;

//    public ArrayList<Book> setupBookList() {
//        return new ArrayList<>(Arrays.asList(
//                new Book("Shuggie Bain",  "Douglas Stuart",480),
//                new Book("White Noise", "Don DeLillo",384),
//                new Book("American Psycho", "Bret Easton Ellis",416),
//                new Book("Blood Meridian", "Cormac McCarthy",384),
//                new Book("Catechismvsa", "Martjnvs Masvjdjvs",79)));
//    }

    @Test
    public void countTheNumberOfBooks_returnsBookListSize_whenBookListNotEmpty() {

    }

    @Test
    public void countTheNumberOfBooks_returnsBookListSize_whenBookListEmpty() {
    }

    @Test
    public void findBookByTitle_returnBookObject_whenBookListContainsBookWithEnteredStringTitle() throws BookNotFoundException {
    }

    @Test
    public void findBookByTitle_throwsBookNotFoundException_whenBookListDoesNotContainBookWithEnteredTitle() throws BookNotFoundException {
    }

    @Test
    public void findBookWithHighestPageCount_returnBookPageInt_whenBookListNotEmpty() throws BookNotFoundException {
    }

    @Test
    public void findBookWithHighestPageCount_throwsBookNotFoundException_whenBookListEmpty() throws BookNotFoundException {
    }

}