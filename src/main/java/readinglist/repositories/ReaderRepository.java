package readinglist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import readinglist.domain.Reader;

public interface ReaderRepository extends JpaRepository<Reader, String> {
}
