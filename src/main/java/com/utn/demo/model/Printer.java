package com.utn.demo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Printer{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    private String brand;
    private String model;
    private String so;

    @OneToMany(mappedBy="printer")
    private List<Impressions> items;
}
