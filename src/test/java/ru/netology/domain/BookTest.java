package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void shouldHaveAllFieldsAndMethodFromSuperClass() {
        Book book = new Book();
    }

    @Test
    void shouldUseEquals(){
        Book book1 = new Book(1, "Book1", 123, "Author1", 321, 2020);
        Book book2 = new Book(1, "Book1", 123, "Author1", 321, 2020);
        assertEquals(book1, book2);
    }
}