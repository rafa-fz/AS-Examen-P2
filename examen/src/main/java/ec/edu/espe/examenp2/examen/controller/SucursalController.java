package ec.edu.espe.examenp2.examen.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ec.edu.espe.examenp2.examen.controller.dto.FeriadoDTO;
import ec.edu.espe.examenp2.examen.controller.dto.SucursalDTO;
import ec.edu.espe.examenp2.examen.controller.mapper.SucursalMapper;
import ec.edu.espe.examenp2.examen.model.Sucursal;
import ec.edu.espe.examenp2.examen.service.SucursalService;

@RestController
@RequestMapping("/v1/sucursales")
public class SucursalController {

    private final SucursalService service;
    private final SucursalMapper mapper;

    public SucursalController(SucursalService service, SucursalMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    @GetMapping
    public ResponseEntity<List<SucursalDTO>> getAllSucursales() {
        try {
            List<Sucursal> sucursales = this.service.findAll();
            List<SucursalDTO> dtos = new ArrayList<>(sucursales.size());

            for (Sucursal sucursal : sucursales) {
                dtos.add(mapper.toDTO(sucursal));
            }
            return ResponseEntity.ok(dtos);

        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }

    }

    @PostMapping
    public ResponseEntity<SucursalDTO> createSucursal(@RequestBody SucursalDTO sucursalDTO) {

        return ResponseEntity.ok().build();

    }

    @GetMapping("/{id}")
    public ResponseEntity<SucursalDTO> getSucursalById(@PathVariable("id") String id) {
        try {
            Sucursal sucursal = this.service.findById(id);
            return ResponseEntity.ok(this.mapper.toDTO(sucursal));
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<SucursalDTO> updateSucursal(@PathVariable String id, @RequestBody SucursalDTO sucursalDTO) {

        rreturn ResponseEntity.ok().build();
    }

    @PostMapping("/{id}/feriados")
    public ResponseEntity <feriadoDTO> create(@RequestBody String entity) {
        
        rreturn ResponseEntity.ok().build();
    }

}
