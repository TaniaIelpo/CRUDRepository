package co.develhope.CRUDRestRepository2.repositories;

        import co.develhope.CRUDRestRepository2.entities.Language;
        import org.springframework.data.jpa.repository.JpaRepository;
        import org.springframework.data.rest.core.annotation.Description;
        import org.springframework.data.rest.core.annotation.RepositoryRestResource;
        import org.springframework.data.rest.core.annotation.RestResource;
        import org.springframework.stereotype.Repository;

@RepositoryRestResource(path = "repo-prog-languages", collectionResourceDescription =  @Description( "Repository for ProgrammingLanguage table"))

public interface LanguageRepository extends JpaRepository<Language,Long> { }
