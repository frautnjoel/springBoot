package com.utn.demo.service;

import com.utn.demo.dto.PrinterDto;
import com.utn.demo.model.Printer;
import com.utn.demo.repository.PrinterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PrinterService {


    PrinterRepository printerRepository;
@Autowired
    public PrinterService(PrinterRepository printerRepository) {
        this.printerRepository = printerRepository;
    }

    public List<PrinterDto> read() {
        List<PrinterDto> list = new ArrayList<PrinterDto>();


        for(Printer e:printerRepository.findAll()){
            list.add(new PrinterDto(e.getBrand()+e.getModel(),e.getItems()));
        }
        return list;
    }
}
