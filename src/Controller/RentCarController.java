/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

/**
 *
 * @author Usuario
 */
public class RentCarController {
    
    private RentCarView view;

    public RentCarController(RentCarView view) {
        this.view = view;
        this.view.setController(this);
    }

    public void registrarRenta(RentCar renta) {
        // Lógica para registrar la renta del carro
        // Puedes guardar la renta en una base de datos, por ejemplo
        // ...
        // Aquí iría el código necesario para guardar la renta en el sistema
        // ...

        JOptionPane.showMessageDialog(null, "La renta del carro ha sido registrada exitosamente.", "Registro exitoso", JOptionPane.INFORMATION_MESSAGE);
    }
}

    
}

