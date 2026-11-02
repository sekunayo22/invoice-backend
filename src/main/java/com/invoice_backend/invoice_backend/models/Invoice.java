package com.invoice_backend.invoice_backend.models;

import com.invoice_backend.invoice_backend.enums.InvoiceStatus;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="invoices")
@NoArgsConstructor
@Data
public class Invoice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String currency;
    private InvoiceStatus status;
    private LocalDate invoiceDate;
    @ManyToOne
    private User billTo;
    private String description;
    private LocalDate paymentDue;
    private Double amountDue;
    @ManyToOne
    private User billFrom;
    @OneToMany(mappedBy = "invoice", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Product> items = new ArrayList<>();
}
