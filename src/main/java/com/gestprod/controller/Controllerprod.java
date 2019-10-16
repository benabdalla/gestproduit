package com.gestprod.controller;

import com.gestprod.com.gestprod.dao.prodRep;
import com.gestprod.entity.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controllerprod  {
    @Autowired

    private prodRep Prodrep;

    @RequestMapping("/save")
    public Produit saveProd(Produit p){
        Prodrep.save(p);
        return p;
    }


    @RequestMapping("/all")
    public List<Produit> getprod(){
        return  Prodrep.findAll();
    }@RequestMapping("/hel")
    public String  hello(){
        return "helloooooooo";
    }

}
