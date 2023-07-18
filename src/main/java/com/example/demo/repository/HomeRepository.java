package com.example.demo.repository;

import com.example.demo.entitiy.Home;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HomeRepository extends JpaRepository<Home,Integer> {

    @Query(value = "SELECT h FROM Home h WHERE (:esya IS NULL OR h.esya = :esya) " +
            "AND (:odaSayisi IS NULL OR h.odaSayisi = :odaSayisi) " +
            "AND (:isitmaTuru IS NULL OR h.isitmaTuru = :isitmaTuru) " +
            "AND (:binaYasi IS NULL OR h.binaYaşı = :binaYasi) " +
            "AND (:satilikKiralik IS NULL OR h.satılıkKiralık = :satilikKiralik) " +
            "AND (:fiyat IS NULL OR h.fiyat = :fiyat) " +
            "AND (:il IS NULL OR h.il = :il) " +
            "AND (:ilce IS NULL OR h.ilçe = :ilce)")
    List<Home> findByParams(@Param("esya") String esya, @Param("odaSayisi") String odaSayisi,
                            @Param("isitmaTuru") String isitmaTuru, @Param("binaYasi") Integer binaYasi,
                            @Param("satilikKiralik") String satilikKiralik, @Param("fiyat") Integer fiyat,
                            @Param("il") String il, @Param("ilce") String ilce);

}
