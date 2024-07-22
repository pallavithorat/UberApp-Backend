package com.codingshuttle.project.uber.uberApp.repositories;

import com.codingshuttle.project.uber.uberApp.entities.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
 //Repo is used to connect with the actual DB
@Repository
public interface DriverRepository extends JpaRepository<Driver, Long> {
}
