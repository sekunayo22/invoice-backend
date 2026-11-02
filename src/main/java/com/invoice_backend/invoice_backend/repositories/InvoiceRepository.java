package com.invoice_backend.invoice_backend.repositories;

import com.invoice_backend.invoice_backend.models.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceRepository extends JpaRepository<Invoice, Long> {
}
