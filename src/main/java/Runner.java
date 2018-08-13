import db.DBAuthor;
import db.DBBook;
import models.Author;
import models.Book;

import java.util.List;

public class Runner {


    public static void main(String[] args) {
        Author author_1 = new Author("Lew", "Tolstoj", "Canadian");
        Author author_2 = new Author("Stanislaw", "Lem", "Polish");
//SAVE:
        DBAuthor.save(author_1);
        DBAuthor.save(author_2);

        Book book_1 = new Book("Anna Karenina", 231);
        Book book_2 = new Book("Solaris", 111);
        DBBook.save(book_1);
        DBBook.save(book_2);

//GET ALL:
        List listOfAuthors = DBAuthor.getAll();
        List listOfBooks = DBBook.getAll();
//GET BY ID:
        Author authorById = DBAuthor.getById(1);
        Book bookById = DBBook.getById(1);

//UPDATE
        book_1.setTitle("Ana Karenina");
        DBBook.update(book_1);

        author_1.setNationality("Russian");
        DBAuthor.update(author_1);

//DELETE
        DBBook.delete(book_1);
        DBAuthor.delete(author_1);




    }
}
