package pl.wsiiz.patientservice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.wsiiz.patientservice.model.Drug;

import java.util.List;

@Repository
public interface DrugRepository extends CrudRepository<Drug, Long> {
    List<Drug> getDrugsByNameEqualsAndManufacturerEquals(String name, String manufacturer);
}
