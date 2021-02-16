package com.yogiyo.serviceimpl;

import com.yogiyo.dao.Dao;
import com.yogiyo.service.DaoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ServiceImpl implements DaoService {

	@Autowired
    private Dao dao;

}