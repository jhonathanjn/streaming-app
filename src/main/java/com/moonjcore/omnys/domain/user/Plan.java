package com.moonjcore.omnys.domain.user;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "db_plans")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Plan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Integer duraction;

    private String description;

    @Column(nullable = false)
    private BigDecimal price;

    @ManyToMany
    @JoinColumn(name = "user_id", nullable = true)
    private User user;

}
