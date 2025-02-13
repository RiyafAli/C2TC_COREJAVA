package com.tns.ifet.placementmanagement.certificatemodule.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.tns.ifet.placementmanagement.certificatemodule.entity.Certificate;
import com.tns.ifet.placementmanagement.certificatemodule.service.CertificateService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/certificates")
public class CertificateController {

    @Autowired
    private CertificateService service;

    @PostMapping("/issue")
    public ResponseEntity<Certificate> issueCertificate(@RequestBody Certificate certificate) {
        Certificate savedCertificate = service.issueCertificate(certificate);
        return ResponseEntity.ok(savedCertificate);
    }

    @GetMapping
    public ResponseEntity<List<Certificate>> getAllCertificates() {
        return ResponseEntity.ok(service.getAllCertificates());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Certificate> getCertificateById(@PathVariable Long id) {
        Optional<Certificate> certificate = service.getCertificateById(id);
        return certificate.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCertificate(@PathVariable Long id) {
        service.deleteCertificate(id);
        return ResponseEntity.noContent().build();
    }
}
