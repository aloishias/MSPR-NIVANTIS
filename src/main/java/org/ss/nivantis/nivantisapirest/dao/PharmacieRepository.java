package org.ss.nivantis.nivantisapirest.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.ss.nivantis.nivantisapirest.model.Pharmacie;

import java.util.ArrayList;
import java.util.List;

public interface PharmacieRepository extends JpaRepository<Pharmacie, Long> {

    ArrayList findByLatitudeAndLongitude(String latitude, String longitude);
    ArrayList findAllByLongitudeAndLatitude(String latitude,String longitude);
    List<Pharmacie> findAll();
    @Query("SELECT latitude,longitude FROM Pharmacie p")
    ArrayList getInfos();

}
