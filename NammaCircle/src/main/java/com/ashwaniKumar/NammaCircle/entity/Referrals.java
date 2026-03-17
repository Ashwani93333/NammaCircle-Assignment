package com.ashwaniKumar.NammaCircle.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "referrals", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"candidate_id", "company_id"})
})
public class Referrals {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "candidate_id", nullable = false)
    @Getter @Setter
    private Long candidateId;

    @Column(name = "company_id", nullable = false)
    @Getter @Setter
    private Long companyId;

    private LocalDateTime createdAt = LocalDateTime.now();

    // Getters and Setters
}