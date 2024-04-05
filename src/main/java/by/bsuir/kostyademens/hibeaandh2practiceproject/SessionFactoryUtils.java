package by.bsuir.kostyademens.hibeaandh2practiceproject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryUtils {

    private SessionFactory sessionFactory;

    public void init() {
        sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .buildSessionFactory();
    }

    public Session getSession() {
        return sessionFactory.openSession();
    }

    public void shotDown() {
        if (sessionFactory != null) {
            sessionFactory.close();
        }
    }
}
