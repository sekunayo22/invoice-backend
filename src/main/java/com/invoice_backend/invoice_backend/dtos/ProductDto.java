package com.invoice_backend.invoice_backend.dtos;

import lombok.Data;


@Data
public class ProductDto {
    private Long id;
    private String name;
    private Long quantity;
    private Double price;
    private Double total;
    private InvoiceDto invoice;
}
