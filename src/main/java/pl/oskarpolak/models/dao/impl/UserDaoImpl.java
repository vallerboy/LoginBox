package pl.oskarpolak.models.dao.impl;

import pl.oskarpolak.DatabaseConnector;
import pl.oskarpolak.models.dao.UserDao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Lenovo on 29.08.2017.
 */
public class UserDaoImpl implements UserDao {

    private DatabaseConnector connector =  DatabaseConnector.getInstance();

    @Override
    public boolean checkLogin(String name, String password) {
        PreparedStatement preparedStatement = connector.getNewPreparedStatement(
                "SELECT * FROM user WHERE name = " + name + ";"
        );
        try {
            ResultSet set = preparedStatement.executeQuery();
            if(!set.next()) {
                return false;
            }
            String passwordFromDatabase = set.getString("password");
            if(passwordFromDatabase.equals(password)){
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
