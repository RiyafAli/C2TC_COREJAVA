package com.tns.ifet.placementmanagement.certificatemodule.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tns.ifet.placementmanagement.certificatemodule.entity.Certificate;
import com.tns.ifet.placementmanagement.certificatemodule.repository.CertificateRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CertificateService {

    @Autowired
    private CertificateRepository repository;

    public Certificate issueCertificate(Certificate certificate) {
        return repository.save(certificate);
    }

    public List<Certificate> getAllCertificates() {
        return repository.findAll();
    }

    public Optional<Certificate> getCertificateById(Long id) {
        return repository.findById(id);
    }

    public void deleteCertificate(Long id) {
        repository.deleteById(id);
    }
}
