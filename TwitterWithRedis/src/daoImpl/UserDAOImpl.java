package daoImpl;

import dao.UserDAO;

/**
 * Created by tamiand on 21/04/2015.
 */
public class UserDAOImpl implements UserDAO {

    ClientRedis client = new ClientRedis();



    @Override
    public void createUser(String login, String password) {

    }

    @Override
    public void deleteUser(String login) {

    }

    @Override
    public void getUsers() {

    }

    @Override
    public void getUser(String login) {

    }
}
