package com.kouenjirokusuke.crudapp.dao;

import com.kouenjirokusuke.crudapp.entity.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<User> getAllUsers() {
        return sessionFactory
                .getCurrentSession()
                .createQuery("from User", User.class)
                .getResultList();
    }

    @Override
    public void saveUser(User user) {
        sessionFactory.getCurrentSession().saveOrUpdate(user);
    }

    @Override
    public User getUser(long id) {
        return sessionFactory
                .getCurrentSession()
                .get(User.class, id);
    }

    @Override
    public void deleteUser(long id) {
        sessionFactory.getCurrentSession().delete(getUser(id));
    }
}
