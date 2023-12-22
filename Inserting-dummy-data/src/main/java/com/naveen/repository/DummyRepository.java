package com.naveen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.naveen.entity.DummyData;

@Repository
public interface DummyRepository extends JpaRepository<DummyData,Integer>{

}
