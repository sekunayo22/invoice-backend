package com.invoice_backend.invoice_backend.mappers;

import com.invoice_backend.invoice_backend.dtos.InvoiceDto;
import com.invoice_backend.invoice_backend.models.Invoice;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface InvoiceMapper {
    Invoice toEntity(InvoiceDto invoiceDto);
    InvoiceDto toDto(Invoice invoice);
}
