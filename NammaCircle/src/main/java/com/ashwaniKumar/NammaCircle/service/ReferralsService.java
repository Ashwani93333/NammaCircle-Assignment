package com.ashwaniKumar.NammaCircle.service;

import com.ashwaniKumar.NammaCircle.entity.Referrals;
import com.ashwaniKumar.NammaCircle.repository.ReferralsRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReferralsService {

    @Autowired
    private ReferralsRepository referralsRepository;

    @Transactional
    public Referrals referCandidate(Long candidateId, Long companyId) {
        // Business Rule: Check for existing referral
        if (referralsRepository.existsByCandidateIdAndCompanyId(candidateId, companyId)) {
            throw new RuntimeException("This candidate has already been referred to this company.");
        }

        Referrals referral = new Referrals();
        referral.setCandidateId(candidateId);
        referral.setCompanyId(companyId);

        return referralsRepository.save(referral);
    }
}