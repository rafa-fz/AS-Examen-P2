package ec.edu.espe.examenp2.examen.controller.dto;

import java.time.LocalDateTime;
import java.util.List;

import ec.edu.espe.examenp2.examen.model.Feriado;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SucursalDTO {

    @NotBlank(message = "El ID no puede estar vacio ni ser nulo")
    private String id;

    @NotBlank(message = "El Email no puede estar vacio ni ser nulo")
    @Email(message = "El Email debe de tener la siguiente estructura: ejemplo@banquito.com")
    private String emailAddress;

    @NotBlank(message = "El nombre no puede ser vacio ni nulo")
    private String name;

    @NotBlank(message = "El numero de telefono no puede ser vacio ni nulo")
    @Size(max = 10, message = "El numero de telefono no puede tener mas de 10 digitos")
    private String phoneNumber;

    @NotBlank(message = "El estado no puede ser vacio ni nulo")
    private String state;

    @NotBlank
    private LocalDateTime creationDate;

    @NotBlank
    private LocalDateTime lastModifiedDate;

    private List<Feriado> branchHolidays;

}