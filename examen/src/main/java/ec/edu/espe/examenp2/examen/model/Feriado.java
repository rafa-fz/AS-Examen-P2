package ec.edu.espe.examenp2.examen.model;

import java.time.LocalDate;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Feriado {

    private LocalDate date;
    private String name;

}
