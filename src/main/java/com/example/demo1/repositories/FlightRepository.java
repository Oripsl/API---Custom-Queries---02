package com.example.demo1.repositories;

import com.example.demo1.entities.Flight;
import com.example.demo1.entities.FlightStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Long> {
//    @Query("SELECT f FROM Flight f WHERE f.STATUS IN (:statuses)")
    List<Flight> findByStatusIn(List<FlightStatus> statuses);
}
