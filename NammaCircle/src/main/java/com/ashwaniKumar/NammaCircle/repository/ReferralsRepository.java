package com.ashwaniKumar.NammaCircle.repository;

import com.ashwaniKumar.NammaCircle.entity.Referrals;
import org.springframework.boot.autoconfigure.ldap.LdapProperties;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReferralsRepository extends JpaRepository<Referrals, Long> {
    boolean existsByCandidateIdAndCompanyId(Long candidateId, Long companyId);
}