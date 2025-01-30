package ec.edu.espe.examenp2.examen.controller;

import java.util.List;
import java.util.Optional;

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
        List<SucursalDTO> sucursales = service.getAllSucursales();
        return ResponseEntity.ok(sucursales);
    }

    @PostMapping
    public ResponseEntity<SucursalDTO> createSucursal(@RequestBody SucursalDTO sucursalDTO) {
        SucursalDTO createdSucursal = service.createSucursal(sucursalDTO);
        return ResponseEntity.ok(createdSucursal);
    }

    @GetMapping("/{id}")
    public ResponseEntity<SucursalDTO> getSucursalById(@PathVariable String id) {
        Optional<SucursalDTO> sucursal = service.getSucursalById(id);
        return sucursal.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<SucursalDTO> updateSucursal(@PathVariable String id, @RequestBody SucursalDTO sucursalDTO) {
        Optional<SucursalDTO> updatedSucursal = service.updateSucursal(id, sucursalDTO);
        return updatedSucursal.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping("/{id}/feriados")
    public ResponseEntity<FeriadoDTO> createFeriado(@PathVariable String id, @RequestBody FeriadoDTO feriadoDTO) {
        FeriadoDTO createdFeriado = service.createFeriado(id, feriadoDTO);
        return ResponseEntity.ok(createdFeriado);
    }

    @DeleteMapping("/{id}/feriados/{feriadoId}")
    public ResponseEntity<Void> deleteFeriado(@PathVariable String id, @PathVariable String feriadoId) {
        service.deleteFeriado(id, feriadoId);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}/feriados")
    public ResponseEntity<List<FeriadoDTO>> getFeriadosBySucursal(@PathVariable String id) {
        List<FeriadoDTO> feriados = service.getFeriadosBySucursal(id);
        return ResponseEntity.ok(feriados);
    }

    @GetMapping("/{id}/feriados/verificar")
    public ResponseEntity<Boolean> isFeriado(@PathVariable String id, @RequestParam String date) {
        boolean isFeriado = service.isFeriado(id, date);
        return ResponseEntity.ok(isFeriado);
    }
}
