package com.gestprod.com.gestprod.dao;

import com.gestprod.entity.Produit;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.awt.print.Pageable;
import java.util.List;

public interface prodRep extends JpaRepository<Produit,Long> {
    @Query("select p  from   Produit p where p.dec Like :x")
    public Page<Produit> ProduitParMc(@Param("x")String mc , Pageable p);
    public List<Produit> findByDesc(String desc);
    public  List<Produit> findBydesc(String desc, Pageable p);
}
