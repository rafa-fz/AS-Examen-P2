package ec.edu.espe.examenp2.examen.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.espe.examenp2.examen.model.Sucursal;
import ec.edu.espe.examenp2.examen.repository.SucursalRepository;

@Service
public class SucursalService {

    @Autowired
    private SucursalRepository repository;

    public List<Sucursal> findAll() {
        return repository.findAll();
    }

    public Sucursal findById(String id) {
        Sucursal sucursal = null;

        return sucursal;
    }

    public Sucursal create(Sucursal sucursal) {
        Sucursal createdSucursal = null;

        return createdSucursal;
    }

    public Sucursal update(Sucursal sucursal) {
        Sucursal updatedSucursal = null;

        return updatedSucursal;
    }

}
