package tacos;

import org.springframework.data.relational.core.mapping.Table;
import lombok.Data;

@Data
@Table // this is optional
public class IngredientRef {
    private final String ingredient;

}
