package com.invoice_backend.invoice_backend.mappers;

import com.invoice_backend.invoice_backend.dtos.ProductDto;
import com.invoice_backend.invoice_backend.models.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    Product toEntity(ProductDto productDto);
    @Mapping(target = "invoice", ignore = true)
    ProductDto toDto(Product product);
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "invoice", ignore = true)
    void updateEntity(ProductDto productDto, @MappingTarget Product product);
}
