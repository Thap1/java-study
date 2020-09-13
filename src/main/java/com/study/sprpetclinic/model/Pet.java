package com.study.sprpetclinic.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;
@Data
@NoArgsConstructor
@AllArgsConstructor
//@Entity
public class Pet extends BaseEntity {
//    @Id
//    private Long id;
//    private PetType petType;
    private Owner owner;
    private LocalDate localeDate;
}
