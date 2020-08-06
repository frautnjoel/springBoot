package com.utn.demo.repository;

import com.utn.demo.model.Printer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrinterRepository extends JpaRepository<Printer,Integer> {
}
