package co.develhope.CRUDRestRepository2.services;

import co.develhope.CRUDRestRepository2.DTO.LanguageDTO;
import co.develhope.CRUDRestRepository2.DTO.LanguageInventorDTO;
import co.develhope.CRUDRestRepository2.entities.Language;
import co.develhope.CRUDRestRepository2.repositories.LanguageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LanguageServiceImpl implements LanguageService{

    @Autowired
    LanguageRepository languageRepository;

    @Override
    public Language createLanguage(LanguageDTO language) {

        Language languageToSave=language;
        return languageRepository.saveAndFlush(languageToSave);
    }

    @Override
    public Optional<Language> getOne(Long id) throws Exception {
        if(languageRepository.existsById(id)){
            return languageRepository.findById(id);
        }
        else
            throw new Exception("Language not found");
    }

    @Override
    public Page<Language> getAll(Optional<Integer> page) {
        if(page.isPresent()){
            Pageable pageable = PageRequest.of(page.get(),2);
            return languageRepository.findAll(pageable);
        }
        return Page.empty();
    }

    @Override
    public Language updateInventor(long id, LanguageInventorDTO inventor) {
        inventor.setId(id);
        Language langToSave=languageRepository.findById(id).get();
        langToSave.setInventor(inventor.getInventor());

        return languageRepository.saveAndFlush(langToSave);
    }


}
