package com.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.sql.Date;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Application {

    public static void main(String[] args) {

        SessionFactory sessionFactory= new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

//
//        Author author =new Author();
//        author.setAuth_id(1);
//        author.setFirstname("abc9");
//        author.setLastname("xyz9");
//        author.setAge(45);
//        author.setDob(Date.valueOf("1992-12-3"));
//
//        address address1 =new address();
//        address1.setState("maharashtra");
//        address1.setLocation("mumbai");
//        address1.setStreetNumber(102);
//        author.setAddress1(address1);
//
//
//
//       List<String> list1=new ArrayList<>();
//
//       list1.add("languages");
//       list1.add("fiction");
//       list1.add("classics");
//
//
//       author.setSubject(list1);
//
//
//        session.save(author);
//
//
//        Author author5 =new Author();
//
//        author5.setAuth_id(2);
//
//        author5.setFirstname("abc10");
//        author5.setLastname("xyz10");
//        author5.setAge(55);
//        author5.setDob(Date.valueOf("1982-02-3"));
//
//        address address7 =new address();
//        address7.setState("west bengal");
//        address7.setLocation("kolkata");
//        address7.setStreetNumber(101);
//        author5.setAddress1(address7);
//
//
//
//        List<String> list2=new ArrayList<>();
//
//        list2.add("Maths");
//        list2.add("Hindi");
//        list2.add("Economics");
//
//
//        author5.setSubject(list2);
//
//
//        session.save(author5);


//
//        Book book = new Book();
//        book.setBook_id(1);
//        book.setBook_name("java");
//        session.save(book);
//
//
//        Book book1 = new Book();
//        book1.setBook_id(2);
//        book1.setBook_name("c++");
//        session.save(book1);
//
//
//        Book book3 = new Book();
//        book3.setBook_id(3);
//        book3.setBook_name("php");
//        session.save(book3);
//
//
//        Book book2 = new Book();
//        book2.setBook_id(4);
//        book2.setBook_name("html");
//        session.save(book2);


//        Author author= session.get(Author.class,1);
//
//        Book book = session.get(Book.class, 1 );
//
//        author.setBook(book);
//
//        session.update(author);

//       Author author= session.get(Author.class,2);
//
//     Book book2 = new Book();
//
//     book2.setBook_id(1);
//     book2.setBook_name("the new way");
//
//      session.save(book2);
//
//        Book book3 = new Book();
//
//        book3.setBook_id(2);
//        book3.setBook_name("the new life");
//
//        session.save(book3);
//
//        Book book4 = new Book();
//
//        book4.setBook_id(3);
//        book4.setBook_name("the new world");
//
//        session.save(book4);
//
//        author.getBook1().add(book2);
//        author.getBook1().add(book3);
//        author.getBook1().add(book4);
//
//        session.update(author);


        session.getTransaction().commit();
        session.close();
        sessionFactory.close();

        System.out.println("Hello World 1234 !!!!");

    }
}
