package models;


import javax.persistence.*;

@Entity
@Table(name = "authors")
public class Author {
    private int id;
    private String firstName;
    private String lastName;
    private String nationality;

    public Author(){}

    public Author(String firstName, String lastName, String nationality) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationality = nationality;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId(){
        return id;
    }
    @Column(name = "first_name")
    public String getFirstName() {
        return firstName;
    }

    @Column(name = "last_name")
    public String getLastName() {
        return lastName;
    }

    @Column(name = "nationality")
    public String getNationality() {
        return nationality;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}
