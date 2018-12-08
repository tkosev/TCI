package sample;

import org.junit.Assert;
import org.junit.Test;
import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

public class TestPerson {
    Book book;

    public TestPerson(){
        List<String> authors = new ArrayList<String>();
        authors.add("Harper Lee");
        //book = new Book("To Kill A Mockingbird", "Southern Gothic", "PDF", 1964,authors, "J. B. Lippincott & Co.", "978-0-8103-8566-5");
    }

    @Test
    public void getName() {
        //arrange
        //act
        //assert
        Assert.assertEquals("To Kill A Mockingbird",book.getName());
    }

    @Test
    public void setName() {
        //arrange
        //act
        //book.setName("To Kill A Mockingbird");
        //assert
        Assert.assertEquals("To Kill A Mockingbird",book.getName());
    }
}
