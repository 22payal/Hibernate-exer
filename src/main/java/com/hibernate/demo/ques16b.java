package com.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

class ques16b
{
    public static void main(String[] args) {

        SessionFactory sessionFactory= new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();


        Author author =new Author();
        author.setAuth_id(1);
        author.setFirstname("abc9");
        author.setLastname("xyz9");
        author.setAge(45);
        author.setDob(Date.valueOf("1992-12-3"));

        address address1 =new address();
        address1.setState("maharashtra");
        address1.setLocation("mumbai");
        address1.setStreetNumber(102);
        author.setAddress1(address1);



        List<String> list1=new ArrayList<>();

        list1.add("languages");
        list1.add("fiction");
        list1.add("classics");


        author.setSubject(list1);


        session.save(author);

        Book book1 = new Book();
        book1.setBook_id(1);
        book1.setBook_name("c++");
        session.save(book1);

        Book book2 = new Book();
        book2.setBook_id(2);
        book2.setBook_name("php");
        session.save(book2);

        Book book3 = new Book();
        book3.setBook_id(3);
        book3.setBook_name("html");
        session.save(book3);

        author.getBooks().add(book1);
        author.getBooks().add(book2);
        author.getBooks().add(book3);

        session.save(author);

        book1.setAuthor1(author);
        book2.setAuthor1(author);
        book3.setAuthor1(author);

        session.save(book1);
        session.save(book2);
        session.save(book3);

        session.getTransaction().commit();
        session.close();
        sessionFactory.close();

        System.out.println(" One to many mapping(bidirectional) implemented between tables : Author and Book !!!!");


    }
}