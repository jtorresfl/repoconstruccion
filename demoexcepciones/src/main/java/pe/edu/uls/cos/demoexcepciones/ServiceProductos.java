package pe.edu.uls.cos.demoexcepciones;

import java.util.Date;

import org.springframework.stereotype.Service;

@Service 
public class ServiceProductos {

    public Producto registrarProducto(Producto nuevo) {
        if(nuevo.getNombre().length()<2){
            throw new ProductoInvalidoException("Como vas a poner un producto de 1 letra down");

        }
        if (nuevo.getNombre().equals("mouse")) {
            throw new ProductoRepetidoException("El producto ya esta en inventario genio");
        }
        Date ahora = new Date();
        nuevo.setId((int) ahora.getTime());
        return nuevo;
    }

}

