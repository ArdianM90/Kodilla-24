package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        //Given
        MedianAdapter medianAdapter = new MedianAdapter();
        Set<Book> bookSet1 = new HashSet<>();
        bookSet1.add(new Book("John Smith", "Secrets of Alamo", 2008, "BB01"));
        bookSet1.add(new Book("Dilbert Michigan", "Secretaries and Directors", 2012, "BB02"));
        bookSet1.add(new Book("Steve Wolkowitz", "Secret life of programmers", 2016, "BB03"));
        bookSet1.add(new Book("Ian Tenewitch", "Secrets of Java", 2010, "BB04"));
        bookSet1.add(new Book("J.K. Rowling", "Harry Potter", 2009, "BB05"));
        Set<Book> bookSet2 = new HashSet<>();
        bookSet2.add(new Book("John Smith", "Secrets of Alamo", 2008, "BB01"));
        bookSet2.add(new Book("Dilbert Michigan", "Secretaries and Directors", 2012, "BB02"));
        bookSet2.add(new Book("Steve Wolkowitz", "Secret life of programmers", 2016, "BB03"));
        bookSet2.add(new Book("Ian Tenewitch", "Secrets of Java", 2010, "BB04"));

        //When
        int result1 = medianAdapter.publicationYearMedian(bookSet1);
        int result2 = medianAdapter.publicationYearMedian(bookSet2);

        //Then
        assertEquals(2010, result1);
        assertEquals(2012, result2);
    }
}