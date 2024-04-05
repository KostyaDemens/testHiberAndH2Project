package by.bsuir.kostyademens.hibeaandh2practiceproject;


public class Main {


    public static void main(String[] args) {
        SessionFactoryUtils sessionFactoryUtils = new SessionFactoryUtils();
        sessionFactoryUtils.init();

        try {
            UserDao userDao = new UserDaoImpl(sessionFactoryUtils);
            System.out.println(userDao.findById(2l));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sessionFactoryUtils.shotDown();
        }
    }
}
