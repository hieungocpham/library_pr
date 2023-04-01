package com.example.library_pr.repositories;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.library_pr.models.PurchaseProduct;


@Repository
public interface PurchaseProductRepository extends JpaRepository<PurchaseProduct,Long> {
	
}