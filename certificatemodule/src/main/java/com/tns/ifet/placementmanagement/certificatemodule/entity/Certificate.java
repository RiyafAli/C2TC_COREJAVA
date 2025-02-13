package com.tns.ifet.placementmanagement.certificatemodule.entity;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "certificates")
public class Certificate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String studentName;

    @Column(nullable = false, unique = true)
    private String certificateNumber;

    @Column(nullable = false)
    private String course;

    @Column(nullable = false)
    private LocalDate issueDate;
}
