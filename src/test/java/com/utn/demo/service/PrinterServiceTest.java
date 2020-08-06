package com.utn.demo.service;

import com.utn.demo.dto.PrinterDto;
import com.utn.demo.model.Printer;
import com.utn.demo.repository.PrinterRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

public class PrinterServiceTest {
    PrinterService service;

    @Mock
    PrinterRepository repository;

    @Before
    public void setUp() {
        initMocks(this);
        service = new PrinterService(repository);
    }

    @Test
    public void redTest(){

        when(repository.findAll()).thenReturn(new ArrayList<Printer>());

        Assert.assertEquals(new ArrayList<PrinterDto>(),service.read());
    }

}
