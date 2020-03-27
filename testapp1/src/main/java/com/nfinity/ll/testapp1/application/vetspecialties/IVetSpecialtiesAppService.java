package com.nfinity.ll.testapp1.application.vetspecialties;

import java.util.List;
import javax.validation.constraints.Positive;
import com.nfinity.ll.testapp1.domain.model.VetSpecialtiesId;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import com.nfinity.ll.testapp1.commons.search.SearchCriteria;
import com.nfinity.ll.testapp1.application.vetspecialties.dto.*;

@Service
public interface IVetSpecialtiesAppService {

	CreateVetSpecialtiesOutput create(CreateVetSpecialtiesInput vetspecialties);

    void delete(VetSpecialtiesId vetSpecialtiesId);

    UpdateVetSpecialtiesOutput update(VetSpecialtiesId vetSpecialtiesId, UpdateVetSpecialtiesInput input);

    FindVetSpecialtiesByIdOutput findById(VetSpecialtiesId vetSpecialtiesId);

    List<FindVetSpecialtiesByIdOutput> find(SearchCriteria search, Pageable pageable) throws Exception;

	public VetSpecialtiesId parseVetSpecialtiesKey(String keysString);
    
    //Specialties
    GetSpecialtiesOutput getSpecialties(VetSpecialtiesId vetSpecialtiesId);
    
    //Vets
    GetVetsOutput getVets(VetSpecialtiesId vetSpecialtiesId);
}
