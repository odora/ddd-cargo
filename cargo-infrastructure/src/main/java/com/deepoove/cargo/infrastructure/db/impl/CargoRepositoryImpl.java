package com.deepoove.cargo.infrastructure.db.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.deepoove.cargo.domain.aggregate.cargo.Cargo;
import com.deepoove.cargo.domain.aggregate.cargo.CargoRepository;
import com.deepoove.cargo.infrastructure.db.dataobject.AppConfig;
import com.deepoove.cargo.infrastructure.db.mapper.CargoMapper;

@Component
public class CargoRepositoryImpl implements CargoRepository {
    
    @Autowired
    private CargoMapper cargoMapper;

    @Override
    public Cargo find(String id) {
        Cargo cargo = new Cargo(null);
        AppConfig find = cargoMapper.find("app_android_comment");
        System.out.println(find);
        return cargo;
    }

    @Override
    public List<Cargo> findByCustomerId(String customerId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Cargo> findAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void save(Cargo cargo) {
        // TODO Auto-generated method stub

    }

}
