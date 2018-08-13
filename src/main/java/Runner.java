import db.DBAuthor;
import db.DBBook;
import models.Author;
import models.Book;

import java.util.List;

public class Runner {


    public static void main(String[] args) {
        Author author_1 = new Author("Lew","Tolstoj","Canadian");
//SAVE:
        DBAuthor.save(author_1);

        Book book_1 = new Book("Anna Karenina", 231);
        DBBook.save(book_1);

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
    }
}
