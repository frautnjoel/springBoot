package com.utn.demo.controller;

import com.utn.demo.dto.PrinterDto;
import com.utn.demo.service.PrinterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/printer")
public class PrinterController {

    private PrinterService service;
    @Autowired
    public PrinterController(PrinterService service) {
        this.service = service;
    }

    @GetMapping("/")
    public ResponseEntity<List<PrinterDto>> read() {
       List<PrinterDto> foundPrinter = service.read();
        if (foundPrinter == null) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(foundPrinter);
        }
    }
}
