package com.example.crud.domain.product;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;

@Table(name = "product")
@Entity(name = "product")
@EqualsAndHashCode(of = "id") //fala pro spring a PK o primekey das tabela
public class Product {
}