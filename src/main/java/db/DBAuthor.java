package db;

import models.Author;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class DBAuthor {

    private static Session session;
    private static Transaction transaction;

    public static void save(Author author) {
        session = HibernateUtil.getSessionFactory().openSession();
        try {
            transaction = session.beginTransaction();
            session.save(author);
            transaction.commit();
        } catch (HibernateException e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    public static List<Author> getAll(){
        List<Author> result = null;

        session = HibernateUtil.getSessionFactory().openSession();

        try {
            Criteria cr = session.createCriteria(Author.class);
            result = cr.list();

        } catch (HibernateException e){
            e.printStackTrace();
        } finally {
            session.close();
        }
        return result;
    }

    public static Author getById(int id){
        Author result = null;
        session = HibernateUtil.getSessionFactory().openSession();

        try{
            Criteria cr = session.createCriteria(Author.class);
            cr.add(Restrictions.eq("id", id));
            result = (Author) cr.uniqueResult();

        } catch (HibernateException e ){
            e.printStackTrace();
        }finally {
            session.close();
        }
        return result;
    }

    public static void update(Author author){
        session = HibernateUtil.getSessionFactory().openSession();

        try{

            transaction = session.beginTransaction();
            session.update(author);
            transaction.commit();

        } catch (HibernateException e){
            e.printStackTrace();
        } finally {
            session.close();
        }
    }



}
