package org.product.billsaas.auth.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;
import java.util.UUID;

@Entity
@Table(name = "tenants")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class Tenant {

    @Id
    @GeneratedValue
    private UUID id;

    private String name;

    @Column(unique = true)
    private String slug;

    private String gstin;

    @Column(name = "db_schema_name", unique = true)
    private String dbSchemaName;

    private Boolean isActive;

    private Instant createdAt;
}