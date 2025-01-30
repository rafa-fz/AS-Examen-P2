package ec.edu.espe.examenp2.examen.controller.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

import ec.edu.espe.examenp2.examen.controller.dto.SucursalDTO;
import ec.edu.espe.examenp2.examen.controller.dto.FeriadoDTO;
import ec.edu.espe.examenp2.examen.model.Sucursal;
import ec.edu.espe.examenp2.examen.model.Feriado;

@Mapper(
    componentModel = MappingConstants.ComponentModel.SPRING, 
    unmappedTargetPolicy = ReportingPolicy.IGNORE
)

public interface SucursalMapper {
    SucursalDTO toDTO(Sucursal model);

    Sucursal toModel(SucursalDTO dto);

    FeriadoDTO toDTO(Feriado model);

    Feriado toModel(FeriadoDTO dto);
}