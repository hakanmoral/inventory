package tr.com.bilyazilim.jhipster.repository;

import tr.com.bilyazilim.jhipster.domain.Authority;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the Authority entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {
}
