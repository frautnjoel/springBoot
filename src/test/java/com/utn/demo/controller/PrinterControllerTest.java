package com.utn.demo.controller;

import com.utn.demo.dto.PrinterDto;
import com.utn.demo.model.Impressions;
import com.utn.demo.model.Printer;
import com.utn.demo.service.PrinterService;
import org.apache.coyote.Response;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class PrinterControllerTest {

    PrinterController printerController;
    PrinterService service;


    @Before
    public void setUp() {
        service = mock(PrinterService.class);
        printerController = new PrinterController(service);
    }

    @Test
    public void readTest(){
        List<PrinterDto> list=new ArrayList<>();
        PrinterDto newPrinter=createPrinter();
        list.add(newPrinter);
        when(service.read()).thenReturn(list);
        ResponseEntity<List<PrinterDto>> expected=ResponseEntity.ok(service.read());
        Assert.assertEquals(expected,printerController.read());
    }

    private PrinterDto createPrinter() {
        return PrinterDto.builder().printer("a").items(new ArrayList<>()).build();
    }
}
