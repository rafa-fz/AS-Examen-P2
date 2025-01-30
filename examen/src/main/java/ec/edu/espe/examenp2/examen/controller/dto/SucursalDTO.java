package ec.edu.espe.examenp2.examen.controller.dto;

import java.time.LocalDateTime;
import java.util.List;

import ec.edu.espe.examenp2.examen.model.Feriado;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SucursalDTO {

    private String id;
    private String emailAddress;
    private String name;
    private String phoneNumber;
    private String state;
    private LocalDateTime creationDate;
    private LocalDateTime lastModifiedDate;
    private List<Feriado> branchHolidays;

}