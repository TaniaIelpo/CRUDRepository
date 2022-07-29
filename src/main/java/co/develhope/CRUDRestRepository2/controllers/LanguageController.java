package co.develhope.CRUDRestRepository2.controllers;


import co.develhope.CRUDRestRepository2.DTO.LanguageDTO;
import co.develhope.CRUDRestRepository2.DTO.LanguageInventorDTO;
import co.develhope.CRUDRestRepository2.entities.Language;
import co.develhope.CRUDRestRepository2.services.LanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping
public class LanguageController {

    @Autowired
    LanguageService languageService;

    @PostMapping
    public Language create (@RequestBody @Validated LanguageDTO language){
        return languageService.createLanguage(language);
    }

    @GetMapping("/{id}")
    public Optional<Language> readOne(@PathVariable Long id) throws Exception {
        return languageService.getOne(id);
    }

    @GetMapping
    public Page<Language> readAll(@RequestParam(required = false) Optional<Integer> page){

        return languageService.getAll(page);
    }

    @PutMapping("/{id}")
    public Language updateInventor(@PathVariable long id,
                                   @RequestBody LanguageInventorDTO inventor) {
        return languageService.updateInventor(id,inventor);
    }

}
