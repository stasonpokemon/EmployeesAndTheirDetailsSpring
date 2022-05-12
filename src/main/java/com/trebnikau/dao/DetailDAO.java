package com.trebnikau.dao;

import com.trebnikau.entity.Detail;
import com.trebnikau.entity.Employee;

import java.util.List;

public interface DetailDAO {

    List<Detail> readAllDetail();

    Detail readDetail(int detailId);

    void saveDetail(Detail detail);

    void deleteDetail(int detailId);
}
