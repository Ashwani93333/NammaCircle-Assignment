package com.ashwaniKumar.NammaCircle.controller;

import com.ashwaniKumar.NammaCircle.dto.ReferralsDto;
import com.ashwaniKumar.NammaCircle.entity.Referrals;
import com.ashwaniKumar.NammaCircle.service.ReferralsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.ldap.LdapProperties;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/referrals")
public class ReferralController {

    @Autowired
    private ReferralsService referralService;

    @PostMapping
    public ResponseEntity<?> createReferral(@RequestBody ReferralsDto referralsDto) {
        try {
            Referrals savedReferral = referralService.referCandidate(referralsDto.getCandidateId(), referralsDto.getCompanyId());
            return ResponseEntity.ok(savedReferral);
        } catch (RuntimeException e) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(e.getMessage());
        }
    }
}