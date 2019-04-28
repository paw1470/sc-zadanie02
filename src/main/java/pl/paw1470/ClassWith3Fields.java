package pl.paw1470;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ClassWith3Fields {
    private int id;
    private String name;
    private String text;
}
