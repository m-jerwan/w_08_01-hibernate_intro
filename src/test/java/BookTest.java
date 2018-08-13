import models.Book;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class BookTest {
    Book book_1;


    @Before
    public void before(){
        book_1 = new Book("Dracula", 16493401);
    }

    @Test
    public void hasName(){
        assertEquals("Dracula",book_1.getTitle());
    }

    @Test
    public void hasIban(){
        assertEquals(16493401,book_1.getIban());
    }

    @Test
    public void canSetTitle(){
        book_1.setTitle("Solaris");
        assertEquals("Solaris", book_1.getTitle());
    }

    @Test
    public void canSetIban(){
        book_1.setIban(123);
        assertEquals(123, book_1.getIban());
    }
}
