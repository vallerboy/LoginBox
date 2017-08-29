package pl.oskarpolak.models.dao;

/**
 * Created by Lenovo on 29.08.2017.
 */
public interface UserDao {
    boolean checkLogin(String name, String password);
}
