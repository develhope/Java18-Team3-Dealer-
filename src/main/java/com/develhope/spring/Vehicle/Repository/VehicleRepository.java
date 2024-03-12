package com.develhope.spring.Vehicle.Repository;

import com.develhope.spring.Order.Entity.Order;
import com.develhope.spring.Vehicle.Entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Long> {

}