package com.digitalinnovation.gol.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.digitalinnovation.gol.model.Parking;

@Repository
public interface ParkingRepository extends JpaRepository<Parking, String>  {

}
