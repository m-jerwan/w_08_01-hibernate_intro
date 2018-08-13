package models;


import javax.persistence.*;

@Entity
@Table(name= "books")
public class Book {
    private int id;
    private String title;
    private int iban;

    public Book() {
    }

    public Book(String title, int iban) {
        this.title = title;
        this.iban = iban;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "id")
    public int  getId(){
        return id;
    }

    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    @Column(name = "iban")
    public int getIban() {
        return iban;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setIban(int iban) {
        this.iban = iban;
    }
}
