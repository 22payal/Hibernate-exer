package com.hibernate.demo;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Book")
public class Book {
    @Id @GeneratedValue(strategy =GenerationType.TABLE)
    int book_id;

    String BookName;

    @ManyToMany
    List <Author> author1= new ArrayList<>();

    public void setAuthor1(List<Author> author1) {
        this.author1 = author1;
    }

    public List<Author> getAuthor1() {
        return author1;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public int getBook_id() {
        return book_id;
    }

    public void setBook_name(String book_name) {
        this.BookName = book_name;
    }

    public String getBookName() {
        return BookName;
    }

    @Override
    public String toString() {
        return "Book{" +
                "book_id=" + book_id +
                ", BookName='" + BookName + '\'' +
                ", author1=" + author1 +
                '}';
    }
}
