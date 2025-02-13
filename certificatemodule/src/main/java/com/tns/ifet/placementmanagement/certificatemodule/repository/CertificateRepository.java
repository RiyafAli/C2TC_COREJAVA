package com.tns.ifet.placementmanagement.certificatemodule.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tns.ifet.placementmanagement.certificatemodule.entity.Certificate;

@Repository
public interface CertificateRepository extends JpaRepository<Certificate, Long> {
}
