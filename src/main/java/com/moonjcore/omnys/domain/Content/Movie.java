package com.moonjcore.omnys.domain.Content;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "db_movie")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String description;

    private String genero;

    private Integer year;

    private Integer duraction;

    private String classific;

    private String imgUrl;

    private String contentUrl;

    @Enumerated(EnumType.STRING)
    private Reaction reaction;

}
