package com.invoice_backend.invoice_backend.requests;

import com.invoice_backend.invoice_backend.dtos.ProductDto;
import com.invoice_backend.invoice_backend.dtos.UserDto;
import com.invoice_backend.invoice_backend.enums.InvoiceStatus;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class UpdateInvoiceRequest {
    private String currency;
    private InvoiceStatus status;
    private LocalDate invoiceDate;
    private UserDto billTo;
    private String description;
    private LocalDate paymentDue;
    private Double amountDue;
    private UserDto billFrom;
    private List<ProductDto> items;
}
