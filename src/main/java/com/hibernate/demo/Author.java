package com.hibernate.demo;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "Author")
public class Author
   {
       @Id
    int auth_id ;
       @Column(name = "NAME")
    String firstname;
       @Column(name = "SUR_NAME")
              @Transient
    String lastname;
       @Column(name = "AGE")
    int age1;

       @Temporal(TemporalType.DATE)
       @Column(name = "DATE_OF_BIRTH")
    Date dob;

//       @OneToOne
//       @JoinColumn(name = "Book")
//       Book book;

      @ManyToMany
       List <Book> book1= new ArrayList<>();


       @Embedded
       address address1;

       @ElementCollection
       List<String> subject=new ArrayList<>();

       public List<Book> getBook1() {
           return book1;
       }

       public void setBook1(List<Book> book1) {
           this.book1 = book1;
       }

       public void setSubject(List<String> subject) {
           this.subject = subject;
       }

       public List<String> getSubject() {
           return subject;
       }

       public void setAuth_id(int auth_id) {
           this.auth_id = auth_id;
       }

       public int getAuth_id(Class<Author> authorClass, int i) {
           return auth_id;
       }

       public void setDob(Date dob) {
           this.dob = dob;
       }

       public Date getDob() {
           return dob;
       }

       public void setAge(int age)
    {
        this.age1 = age;

    }

       public void setAddress1(address address1) {
           this.address1 = address1;
       }

       public address getAddress1() {
           return address1;
       }

       public int getAge1() {
        return age1;
    }

    public String getFirstname(Class<Author> authorClass, int i) {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

       public void setLastname(String lastname) {
           this.lastname = lastname;
       }
//
//       public void setBook(Book book) {
//           this.book = book;
//       }
//
//       public Book getBook() {
//           return book;
//       }


       @Override
       public String toString() {
           return "Author{" +
                   "auth_id=" + auth_id +
                   ", firstname='" + firstname + '\'' +
                   ", lastname='" + lastname + '\'' +
                   ", age1=" + age1 +
                   ", dob=" + dob +
                   ", book1=" + book1 +
                   ", address1=" + address1 +
                   ", subject=" + subject +
                   '}';
       }
   }



