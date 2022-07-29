package co.develhope.CRUDRestRepository2.DTO;

import co.develhope.CRUDRestRepository2.entities.Language;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;

@Entity
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class LanguageInventorDTO extends Language {
    private String inventor;
}
