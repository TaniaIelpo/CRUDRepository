package co.develhope.CRUDRestRepository2.services;

import co.develhope.CRUDRestRepository2.DTO.LanguageDTO;
import co.develhope.CRUDRestRepository2.DTO.LanguageInventorDTO;
import co.develhope.CRUDRestRepository2.entities.Language;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface LanguageService {

    Language createLanguage(LanguageDTO language);



    Optional<Language> getOne(Long id) throws Exception;

    Page<Language> getAll(Optional<Integer>Page);

    Language updateInventor(long id, LanguageInventorDTO inventor);
}
