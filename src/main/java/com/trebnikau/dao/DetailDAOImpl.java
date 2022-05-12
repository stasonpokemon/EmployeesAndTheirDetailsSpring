package com.trebnikau.dao;


import com.trebnikau.entity.Detail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DetailDAOImpl implements DetailDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Detail> readAllDetail() {
        Session session = sessionFactory.getCurrentSession();
        List<Detail> derails = session.createQuery("from Derail", Detail.class).getResultList();
        return derails;
    }

    @Override
    public Detail readDetail(int detailId) {
        Session session = sessionFactory.getCurrentSession();
        Detail detail = session.get(Detail.class, detailId);
        return detail;
    }

    @Override
    public void saveDetail(Detail detail) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(detail);
    }

    @Override
    public void deleteDetail(int detailId) {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("delete from Detail where id =:detailId");
        query.setParameter("detailId", detailId);
        query.executeUpdate();
    }
}
