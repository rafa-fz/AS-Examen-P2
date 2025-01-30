package ec.edu.espe.examenp2.examen.controller.dto;

import java.time.LocalDate;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class FeriadoDTO {
    private LocalDate date;
    private String name;

}
