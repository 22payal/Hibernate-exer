package com.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class ques15 {

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

      //  author.setBook(book1);

        session.save(author);

        session.getTransaction().commit();
        session.close();
        sessionFactory.close();

        System.out.println(" One to one mapping implemented between tables : Author and Book !!!!");

    }

}
