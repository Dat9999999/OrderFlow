package com.example.orderflow.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.orderflow.model.Store;
import org.springframework.stereotype.Repository;


@Repository
public interface StoreRepository extends JpaRepository<Store, Long> {
}
