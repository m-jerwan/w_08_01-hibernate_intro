import models.Author;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class AuthorTest {
    Author author_1;

    @Before
    public void before(){
        author_1 = new Author("Mark","Twain","Nigerian");
    }

    @Test
    public  void hasFirstName(){
        assertEquals("Mark", author_1.getFirstName());
    }

    @Test
    public void hasSecondName(){
        assertEquals("Twain", author_1.getLastName());
    }
    @Test
    public void hasNationality(){
        assertEquals("Nigerian", author_1.getNationality());
    }

    @Test
    public void canSetFirstName(){
        author_1.setFirstName("Stanislaw");
        assertEquals("Stanislaw", author_1.getFirstName());
    }

    @Test
    public void canSetSecondName(){
        author_1.setLastName("Lem");
        assertEquals("Lem", author_1.getLastName());
    }
    @Test
    public void canSetNationality(){
        author_1.setNationality("Polish");
        assertEquals("Polish", author_1.getNationality());
    }
}
