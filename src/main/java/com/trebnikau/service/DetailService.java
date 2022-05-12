package com.trebnikau.service;

import com.trebnikau.entity.Detail;

import java.util.List;

public interface DetailService {

    List<Detail> readAllDetail();

    Detail readDetail(int detailId);

    void saveDetail(Detail detail);

    void deleteDetail(int detailId);
}
