package com.trebnikau.service;


import com.trebnikau.dao.DetailDAO;
import com.trebnikau.entity.Detail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DetailServiceImpl implements DetailService {

    @Autowired
    private DetailDAO detailDAO;

    @Override
    @Transactional
    public List<Detail> readAllDetail() {
        List<Detail> details = detailDAO.readAllDetail();
        return details;
    }

    @Override
    @Transactional
    public Detail readDetail(int detailId) {
        Detail detail = detailDAO.readDetail(detailId);
        return detail;
    }

    @Override
    @Transactional
    public void saveDetail(Detail detail) {
        detailDAO.saveDetail(detail);
    }

    @Override
    @Transactional
    public void deleteDetail(int detailId) {
       detailDAO.deleteDetail(detailId);
    }
}
